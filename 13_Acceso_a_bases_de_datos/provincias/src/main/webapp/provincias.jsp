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
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
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
    <table class="table table-light table-striped">
      <thead class="table-dark">
        <tr>
          <th>Nombre</th>
          <th></th>
          <th></th>
          <th></th>
        </tr>
      </thead>
      <tbody class="table-group-divider">
        <%
          while(resultado.next()){
            out.println("<tr>");
            out.println("<td>" + resultado.getString("nomProv") + "</td>");
            out.println("<td></td>");
            // out.println("<td>Editar</td>");
        %>
          <td>
            <a class="icon-link" href="editarProvincia.jsp?codProv=<%= resultado.getString("codProv") %>">
              <i class="bi bi-pencil"></i>
              Modificar
            </a>
          </td>
          <td>
            <a class="icon-link" href="borrarProvincia.jsp?cod=<%= resultado.getString("codProv") %>">
              <i class="bi bi-trash"></i>
              Borrar
            </a>
          </td>
        <%
          }   //cierre del while linea 40
        %>
      </tbody>
    </table>

    <%
      //Cerramos conexión con BBDD
      conexion.close();
    %>

    <%-- BOTON AÑADIR PROVINCIA --%>
    <%-- <a href="insertarProvincia.jsp" method="post">Insertar nueva provincia</a> --%>

    <form action="insertarProvincia.jsp" method="post">
      <input type="hidden" name="ccaa" value="<%= codCCAA %>" />
      <button>Insertar nueva provincia</button>
    </form>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>