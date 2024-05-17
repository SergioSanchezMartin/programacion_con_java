<%-- @author Sergio Sánchez --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="models.ConexionBD"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>PROYECTO BANCA TURING</title>
    <!-- <link href="./assets/css/bootstrap.min.css" rel="stylesheet"> -->
    <!-- <link rel="stylesheet" href="icons/font/bootstrap-icons.min.css"> -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">    
  </head>
  <body>

    <% 
      //establecemos la conexión con la BBDD
      Connection conexion = ConexionBD.estableceConexion("banco");
      Statement consulta = conexion.createStatement();
      ResultSet resultado = consulta.executeQuery("SELECT * FROM cliente ORDER BY nombre ASC");
    %>

    <div class="container">
      <div class="card">
        <h1 class="text-center">Banca Turing</h1>

        <table class="table table-light table-striped">

          <thead class="table-dark">
            <tr>
              <th scope="col">DNI</th>
              <th scope="col">Nombre</th>
              <th scope="col">Dirección</th>
              <th scope="col">Teléfono</th>
              <th></th>
              <th></th>
            </tr>
          </thead>

          <tbody class="table-group-divider">
            <% while(resultado.next()) { %>
            <tr>
              <td><%= resultado.getString("dni") %></td>
              <td><%= resultado.getString("nombre") %></td>
              <td><%= resultado.getString("direccion") %></td>
              <td><%= resultado.getString("telefono") %></td>

              <%-- BOTON BORRAR CLIENTE --%>
              <td>
                <form action="borraCliente.jsp" method="get">
                  <input type="hidden" name="dni" value="<%= resultado.getString("dni") %>">
                  <button type="submit" class="btn btn-danger">
                    <i class="bi bi-person-dash"></i>
                    Eliminar
                  </button>
                </form>
              </td>

              <%-- BOTON MODIFICAR CLIENTE --%>
              <td>
                <form action="modificaCliente.jsp" method="post">
                  <input type="hidden" name="dni" value="<%= resultado.getString("dni") %>">
                  <button type="submit" class="btn btn-warning">
                    <i class="bi bi-pencil"></i>
                    Modificar
                  </button>
                </form>
              </td>
            </tr>
            <% 
              }   // cierre while
              conexion.close(); 
            %>
          <%-- <form action="altaCliente.jsp" method="post"> --%>
            <%-- <input type="hidden" name="accion" value="insertar"> --%>
            <%-- <tr>
              <td><input type="text" name="dni" size="10" require></td>
              <td><input type="text" name="nombre"></td>
              <td><input type="text" name="direccion"></td>
              <td><input type="text" name="telefono" size="10"></td>
              <td>
                <button type="submit" class="btn btn-success">
                  <i class="bi bi-floppy2-fill"></i>
                  Añadir
                </button>
              </td>
              <td></td>
            </tr>
          </form> --%>
          </tbody>
        </table>
        <form action="altaCliente.jsp" method="post">
            <%-- <input type="hidden" name="accion" value="insertar"> --%>
            <button type="submit" class="btn btn-primary btn-lg btn-block">
              <i class="bi bi-floppy2-fill"></i>
              Añadir cliente
            </button>
        </form>
      </div>
    </div>
    <script src="./assets/js/bootstrap.bundle.min.js"></script>
  </body>
</html>