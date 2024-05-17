<%-- @author Sergio Sánchez --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="models.ConexionBD"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<!DOCTYPE html>
<html>
  <head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>PROYECTO BANCA TURING</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
  
  </head>
  <body>

    <%      
      if(request.getParameterMap().size() == 1) {
    %>
    
    <form action="modificaCliente.jsp" method="post">
      
      <div class="form-group">
        <label for="dni">DNI:</label>
        <%-- Con placeholder + readonly/disabled el dni se pierde, se manda vacío --%>
        <input type="text" class="form-control" id="dni" name="dni" value="<%= request.getParameter("dni")%>" readonly>
      </div>

      <div class="form-group">
        <label for="nombre">Introduce nombre:</label>
        <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre Apellido1 Apellido2" required>
      </div>

      <div class="form-group">
        <label for="direccion">Introduce dirección:</label>
        <input type="text" class="form-control" id="direccion" name="direccion" placeholder="C/ Ejemplo, 123" required>
      </div>
      <div class="form-group">

        <label for="telefono">Introduce teléfono:</label>
        <div class="input-group">
          <div class="input-group-prepend">
            <div class="input-group-text">+34</div>
          </div>
          <input type="text" class="form-control" id="telefono" name="telefono" placeholder="123 456 789" required>
        </div>
      </div>

      <button type="submit" class="btn btn-warning">
        <i class="bi bi-pencil"></i>
        Modificar
      </button>

    </form>

    <% 
      } else {
        
        //establecemos la conexión con la BBDD
        Connection conexion = ConexionBD.estableceConexion("banco");
        Statement consulta = conexion.createStatement();

        request.setCharacterEncoding("UTF-8");

        String dni = request.getParameter("dni");  
        String nombre = request.getParameter("nombre");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        
        String sql  = "UPDATE cliente SET "
                    + "nombre='" + nombre
                    + "', direccion='" + direccion
                    + "', telefono='" + telefono
                    + "' WHERE dni='" + dni + "' ;";

        // out.println(sql);

        consulta.execute(sql);

        conexion.close();

        response.sendRedirect("http://localhost:8080/banca-turing");

      } 
    %>


</body>
</html>