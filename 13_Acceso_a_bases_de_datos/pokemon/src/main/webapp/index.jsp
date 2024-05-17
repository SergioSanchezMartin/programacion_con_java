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
        // conectamos con el servidor de Bases de Datos
        Connection conexion = ConexionBD.getConexion("pokemondb") ;

        // creamos una sentencia y la lanzamos
        // podemos hacerlo en dos pasos...
        //Statement consulta  = conexion.createStatement() ;
        //ResultSet resultado = consulta.executeQuery("SELECT * FROM especie ;") ;

        // o enlazando métodos...
        ResultSet resultado = conexion.createStatement()
                                      .executeQuery("SELECT * FROM pokemon ;") ;

    %>

    <form action="nuevoPokemon.jsp" method="post">
        <button type="submit" class="btn btn-success btn-block">
            <i class="bi bi-floppy2-fill"></i>
            Nuevo Pokémon
        </button>
    </form>

    <table class="table table-warning table-striped align-middle table-sm">
        <thead class="table-dark">
            <tr>
                <th>#</th>
                <th>Nombre del pokemón</th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>

    <% while (resultado.next()) { %>
            <tr>
                <td><%= resultado.getString("numero_pokedex") %></td>
                <td><%= resultado.getString("nombre") %></td>
                <td><img src="<%= resultado.getString("sprite") %>"></td>
                <td>
                    <form action="detalles.jsp" method="post">
                        <input type="hidden" name="numPokedex" value="<%= resultado.getString("numero_pokedex") %>" />
                        <button class="btn btn-info">Detalles</button>
                    </form>
                </td>
            </tr> 
    
    <% } %>
        </tbody>
    </table>
    <% 

        // cerramos la conexión
        // IMPORTANTE: NO SE NOS DEBE OLVIDAR
        conexion.close() ; 
    %>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>
</html>