<%-- info.jsp --%>
<%-- @author Sergio Sánchez --%>

<%@page contentType="text/html" pageEncoding="utf-8" %>
<%@page import="modules.ConexionDB" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>

<% 

  //Recuperamos el parámetro
  String idPel = request.getParameter("id");

  if (idPel == null) {
%>
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
    <div class="container">

      <h1>Videoteca</h1>
      <h4>Imposible eliminar la película seleccionada</h4>

      <a class="btn btn-dark" href="http://localhost:8080/videoteca">Volver al inicio</a>

  </body>
</html>

<%
  } else {
    
    Connection conexion = ConexionDB.getConexion("videoteca");
    Statement consulta = conexion.createStatement();

    //lanzamos la consulta para borrar
    String sql = "DELETE FROM pelicula WHERE idPel = " + idPel + " ;";

    consulta.execute(sql);

    //Cerramos conexión
    conexion.close();

    response.sendRedirect("http://localhost:8080/videoteca");
  }
%>