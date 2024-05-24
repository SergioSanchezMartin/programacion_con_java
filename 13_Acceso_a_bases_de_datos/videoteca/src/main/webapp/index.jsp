<%-- @author Sergio Sánchez --%>

<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="modules.ConexionDB" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html lang="es">
  <head>
    <title>VIDEOTECA</title>
    <meta charset="utf-8" />
    <style>
      p { text-align: justify ; }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </head>

  <body>
    <h1>Videoteca</h1>

    <menu>
      <a href="nueva.jsp">Añadir película</a>
    </menu>
    
    <table class="table">
      <thead class="table-dark">
        <tr>
          <th>título</th>
          <th>director</th>
          <th>año</th>
          <th></th>
          <th></th>
          <th></th>
        </tr>
      </thead>
      <tbody>
        <%
          Connection conexion = ConexionDB.getConexion("videoteca");
          Statement consulta = conexion.createStatement();

          //lanzamos la consulta
          String sql = "SELECT * FROM pelicula ORDER BY anio DESC ;";
          ResultSet resultado = consulta.executeQuery(sql);

          while(resultado.next()) {
        %>
        <tr>
          <td> <%= resultado.getString("titulo") %> </td>
          <td> <%= resultado.getString("director") %> </td>
          <td> <%= resultado.getString("anio").substring(0,4) %> </td>
          <td><a href="info.jsp?id=<%= resultado.getString("idPel") %>">info</a></td>
          <td><a href="editar.jsp?id=<%= resultado.getString("idPel") %>">editar</a></td>
          <td><a href="borrar.jsp?id=<%= resultado.getString("idPel") %>">borrar</a></td>
        </tr>
          
        <%  
          } //fin del while

          //Cerramos conexion con BBDD
          conexion.close();
         %>
      </tbody>
    </table>
  </body>
</html>