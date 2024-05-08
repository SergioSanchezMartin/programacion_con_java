<%-- @author Sergio Sánchez Martín --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modules.Conexion"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>

<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>PROYECTO PROVINCIAS</title>
  </head>
  <body>
    <h1>Provincias</h1>
    <% 
      //El valor de los parámetros en la petición POST deben codificarse a UTF-8
      request.setCharacterEncoding("UTF-8");
      String codCCAA = request.getParameter("ccaa");

      //Conectamos con la BBDD
      Connection conexion = Conexion.getConexion("ccaa");
      Statement consulta = conexion.createStatement();
      ResultSet resultado = consulta.executeQuery("SELECT * FROM provincia WHERE codCCAA = " + codCCAA + " ;");
    %>
    <table>
      <thead>
        <tr>
          <th>Nombre</th>
          <th></th>
          <th></th>
          <th></th>
        </tr>
      </thead>
      <tbody>
        <%
          while(resultado.next()){
            out.println("<tr>");
            out.println("<td>" + resultado.getString("nomProv") + "</td>");
            out.println("<td></td>");
            out.println("<td>Editar</td>");
            out.println("<td><a href=\"borrarProvincia.jsp?cod=" + resultado.getString("codProv") + "\">Borrar</a></td>");
          }
        %>
      </tbody>
    </table>

    <%
      //Cerramos conexión con BBDD
      conexion.close();
    %>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>