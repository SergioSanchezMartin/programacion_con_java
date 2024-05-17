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

        // Recuperamos el valor de la clave primaria del pokemón que se
        // nos envía desde el archivo index.jsp en forma de parámetro
        //
        // IMPORTANTE: debemos recordar que el valor de todos los pará-
        // metros se reciben SIEMPRE en formato STRING.
        String numPokedex = request.getParameter("numPokedex") ;

        // conectamos con el servidor de bases de datos
        Connection conexion = ConexionBD.getConexion("pokemondb") ;

        // creamos una sentencia y la lanzamos
        Statement consulta  = conexion.createStatement() ;
        ResultSet resultado = consulta.executeQuery("SELECT * FROM pokemon WHERE numero_pokedex = " + numPokedex + " ;") ;

        // colocamos el cursor en el primer registro del conjunto de resultados
        // que, en este caso, sólo debe haber devuelto una única fila (registro).
        if (!resultado.next()) {
             out.println("No existe esa especie.") ;
        } else {
    %>


    <h2><%= resultado.getString("nombre") %></h2>
    <img src="<%= resultado.getString("sprite")%>"/>
    <ul type="square">
        <li>Altura: <%= resultado.getString("altura") %> m</li>
        <li>Peso: <%= resultado.getString("peso") %> kg</li>
    </ul>

    <% 

            //Consulta anidada con JOIN: buscamos los datos de los tipos asociados a un pokemon
            String sql = "SELECT * FROM tipo T " +
                        "JOIN pokemon_tipo PT " +
                        "ON (T.id_tipo = PT.id_tipo)  " + 
                        "WHERE PT.numero_pokedex = " + numPokedex + " ;" ;

            resultado = consulta.executeQuery(sql) ;

    %>

        <h3>Tipo de Pokemón</h3>
            <table class="table table-warning align-middle table-sm">
                <thead class="table-dark">
                    <tr>
                        <th>Tipo</th>
                        <th>Descripción</th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
    <%
            while(resultado.next()) {
                out.println("<tr>") ;
                out.println("<td>" + resultado.getString("nombre") + "</td>") ;
                out.println("<td>" + resultado.getString("descripcion") + "</td>") ;

                //tanto a editar.jsp como a borrar.jsp necesitamos mandarles los parámetros id_tipo y numero_pokedex 
                out.println("<td><a href=\"editar.jsp?idTipo=" +  resultado.getString("id_tipo") + "&numPokedex=" + numPokedex + "\">editar</a></td>") ;
                out.println("<td><a href=\"borrar.jsp?idTipo=" +  resultado.getString("id_tipo") + "&numPokedex=" + numPokedex + "\">borrar</a></td>") ;
                out.println("</tr>") ;
            }
    %>
                </tbody>
            </table>

    <% 
        }   // cerramos el else
        
        // cerramos la conexión
        // IMPORTANTE: NO SE NOS DEBE OLVIDAR
        conexion.close() ; 
    %>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>
</html>