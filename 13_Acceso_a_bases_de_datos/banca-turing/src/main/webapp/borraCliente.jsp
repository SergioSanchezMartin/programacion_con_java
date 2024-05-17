<%-- @author Sergio Sánchez --%>

<%@page import="models.ConexionBD"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
    <%
      //establecemos la conexión con la BBDD
      Connection conexion = ConexionBD.estableceConexion("banco");
      Statement consulta = conexion.createStatement();
      
      consulta.execute ("DELETE FROM cliente WHERE dni = '" + request.getParameter("dni") + "' ;");

      conexion.close();
      response.sendRedirect("http://localhost:8080/banca-turing");
    %>
  </body>
</html>