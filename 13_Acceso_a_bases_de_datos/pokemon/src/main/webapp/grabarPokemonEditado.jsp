<%-- @author Sergio Sánchez --%>

<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="models.ConexionBD" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
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

            // Recuperamos los 3 parámetros que se nos envía desde el archivo editar.jsp:
            // numPokedex, idTipo (antiguo), nuevoTipo (el nuevo seleccionado)
            //
            // IMPORTANTE: debemos recordar que el valor de todos los pará-
            // metros se reciben SIEMPRE en formato STRING.
            String numPokedex = request.getParameter("numPokedex") ;
            String antiguoTipo = request.getParameter("idTipo");
            String nuevoTipo = request.getParameter("nuevoTipo") ;

            // conectamos con el servidor de bases de datos
            Connection conexion = ConexionBD.getConexion("pokemondb") ;

            // creamos una sentencia y la lanzamos
            Statement consulta  = conexion.createStatement() ;
            request.setCharacterEncoding("UTF-8");
        
            String actualizacion = "UPDATE pokemon_tipo SET"
                                + " id_tipo=" + Integer.valueOf(nuevoTipo)
                                + " WHERE numero_pokedex=" + Integer.valueOf(numPokedex)
                                + " AND id_tipo=" + Integer.valueOf(antiguoTipo) + " ;";
            consulta.execute(actualizacion);
            out.println("Pokemon actualizado correctamente.");

            // cerramos la conexión
            // IMPORTANTE: NO SE NOS DEBE OLVIDAR
            conexion.close() ; 
        %>
        <a href="index.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span>Página principal</a>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
