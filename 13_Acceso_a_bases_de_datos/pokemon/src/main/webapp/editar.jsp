<%-- @author Sergio Sánchez --%>

<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="models.ConexionBD" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<!DOCTYPE hmtl>
<html>
<head>
    <title>Pokémon</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%-- <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css"> --%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">


</head>
<body>

    <h1>Pokémon</h1>

    <%

        // Recuperamos el valor de la clave primaria del pokemón y el valor de la clave primaria del tipo 
        // que se nos envía desde el archivo detalles.jsp en forma de parámetros
        //
        // IMPORTANTE: debemos recordar que el valor de todos los pará-
        // metros se reciben SIEMPRE en formato STRING.
        String numPokedex = request.getParameter("numPokedex") ;
        String idTipo = request.getParameter("idTipo");

        // conectamos con el servidor de bases de datos
        Connection conexion = ConexionBD.getConexion("pokemondb") ;

        // creamos una sentencia que me devuelva todos los tipos que NO estén ya asociados al pokemon en cuestión
        Statement consulta  = conexion.createStatement() ;
        String sql  = "SELECT *"
                    + " FROM tipo"
                    + " WHERE id_tipo NOT IN ("
                        + " SELECT id_tipo"
                        + " FROM pokemon_tipo"
                        + " WHERE numero_pokedex = '" + numPokedex + "') ;";
        ResultSet resultado = consulta.executeQuery(sql) ;

    %>

     <%-- Mostramos los tipos y mandamos las claves primaria de forma oculta para el UPDATE
          junto con el nuevoTipo elegido --%>
    <form action="grabarPokemonEditado.jsp" method="post">
      <input type="hidden" name="numPokedex" value="<%= numPokedex %>" />
      <input type="hidden" name="idTipo" value="<%= idTipo %>" />
      <label for ="nuevoTipo">Selecciona tipo Pokémon:</label>
      <select id="nuevoTipo" name="nuevoTipo">

        <%
          while(resultado.next()) {
            out.println("<option value=\"" + resultado.getString("id_tipo") + "\">");
            out.println(resultado.getString("nombre"));
            out.println("</option>");
          }
        %>

      </select>
      <br>
      <button>Guardar</button>
    </form>
    <% 

        // cerramos la conexión
        // IMPORTANTE: NO SE NOS DEBE OLVIDAR
        conexion.close() ; 
    %>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>
</html>