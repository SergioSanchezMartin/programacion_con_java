<%-- info.jsp --%>
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
    <div class="container">

      <h1>Videoteca</h1>
      <h5>Editar película</h5>

      <% 

        //Recuperamos el parámetro
        String idPel = request.getParameter("id");

        Connection conexion = ConexionDB.getConexion("videoteca");
        Statement consulta = conexion.createStatement();

        String sql;

        //MÁQUINA DE ESTADOS:
        //Consulto mapa de parámetros. Si es un solo parámetro muestro el formulario, sino lanzo el UPDATE
        if(request.getParameterMap().size() == 1) {

          //lanzamos consulta
          sql = "SELECT * FROM pelicula WHERE idPel = " + idPel + " ;";
          ResultSet resPelicula = consulta.executeQuery(sql);

          //Avanzo cursor
          resPelicula.next();
      %>
      
      <form action="editar.jsp" method="post">

        <input type="hidden" name="id" value="<%= idPel %>" />

        <!-- Título -->
        <div class="row mt-4">
          <div>
            <label class="form-label fw-bold" for="titulo">Título:</label>
            <input class="form-control" id="titulo" type="text" name="titulo"
                   value="<%= resPelicula.getString("titulo") %>" />
          </div>
        </div>

        <!-- Nueva fila: director, duracion, año, poster -->
        <div class="row mt-4">
          
          <!-- Director -->
          <div class="col-sm-4">
            <label class="form-label fw-bold" for="director">Director:</label>
            <input class="form-control" id="director" type="text" name="director"
                   value="<%= resPelicula.getString("director") %>" />
          </div>

          <!-- Duración -->
          <div class="col-sm-2">
            <label class="form-label fw-bold" for="duracion">Duración:</label>
            <input class="form-control" id="duracion" type="text" name="duracion"
                   value="<%= resPelicula.getString("duracion") %>" />
          </div>

          <!-- Año de estreno -->
          <div class="col-sm-2">
            <label class="form-label fw-bold" for="anio">Año de estreno:</label>
            <input class="form-control" id="anio" type="text" name="anio"
                   value="<%= resPelicula.getString("anio").substring(0,4) %>" />
          </div>

          <!-- Poster -->
          <div class="col-sm-4">
            <label class="form-label fw-bold" for="poster">URL imagen:</label>
            <input class="form-control" id="poster" type="text" name="poster"
                   value="<%= resPelicula.getString("poster") %>" />
          </div>

        </div>

        <%-- ARGUMENTO --%>
        <div class="row mt-4">
          <div class="col">
            <label class="form-label fw-bold" for="argumento">Argumento: <span class="fw-normal">(300 caracteres máximo)</span></label>
            <textarea class="form-control" id="argumento" name="argumento" rows="8"><%= resPelicula.getString("argumento") %></textarea>
          </div>
        </div>

        <%-- BOTONERA --%>
        <div class="row mt-2">
          <div class="col text-end">
            <button class="btn btn-warning">Modificar película</button>
            <button type="button" class="btn btn-dark" onclick="location.href='index.jsp';">Cancelar</button>
            <%-- <a class="btn btn-dark" href="http://localhost:8080/videoteca">Cancelar</a> --%>
          </div>
        </div>
      </form>

      

    </div>

    <% } else {

          String titulo = request.getParameter("titulo");
          String director = request.getParameter("director");
          String duracion = request.getParameter("duracion");
          String anio = request.getParameter("anio");
          String poster = request.getParameter("poster");
          String argumento = request.getParameter("argumento");

          sql = "UPDATE pelicula SET " +
              "titulo='" + titulo + "', " +
              "director='" + director + "', " +
              "duracion='" + duracion + "', " +
              "anio='" + anio + "', " +
              "poster='" + poster + "', " +
              "argumento='" + argumento + "' " +
              "WHERE idPel = " + idPel + " ;";
          
          // out.println(sql);

          //Lanzamos consulta
          conexion.createStatement().execute(sql);

          response.sendRedirect("http://localhost:8080/videoteca");
        }    //cerramos if-else

        conexion.close();

    %> 

  </body>
</html>