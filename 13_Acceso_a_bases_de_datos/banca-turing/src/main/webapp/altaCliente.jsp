<%-- @author Sergio Sánchez --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="models.ConexionBD"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
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
      if(request.getParameterMap().isEmpty()) {
    %>

    <form action="altaCliente.jsp" method="post">

    <div class="form-group">
        <label for="dni">Introduce DNI:</label>
        <%-- Con placeholder + readonly/disabled el dni se pierde, se manda vacío --%>
        <input type="text" class="form-control" id="dni" name="dni" placeholder="12345678A" required>
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

      <button type="submit" class="btn btn-success">
        <i class="bi bi-floppy2-fill"></i>
        Guardar
      </button>

      <%-- <label for="dni">Introduce DNI:</label>
      <input type="text" id="dni" name="dni" autofocus required />
      <br>

      <label for="nombre">Introduce nombre:</label>
      <input type="text" id="nombre" name="nombre" required />
      <br>

      <label for="direccion">Introduce dirección:</label>
      <input type="text" id="direccion" name="direccion" required />
      <br>

      <label for="telefono">Introduce teléfono:</label>
      <input type="text" id="telefono" name="telefono" required />
      <br>

      <button type="submit" class="btn btn-success">
        <i class="bi bi-floppy2-fill"></i>
        Guardar
      </button> --%>

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
        
        String sql  = "INSERT INTO cliente(dni, nombre, direccion, telefono) "
                    + "VALUES ('" + dni 
                    +  "', '" + nombre 
                    +  "', '" + direccion
                    +  "', '" + telefono + "') ;" ; 

        //out.println(sql);

        consulta.execute(sql);

        conexion.close();

        response.sendRedirect("http://localhost:8080/banca-turing");

      } 
    %>

</body>
</html>