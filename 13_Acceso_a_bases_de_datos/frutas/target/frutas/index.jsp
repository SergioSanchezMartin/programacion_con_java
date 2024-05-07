<%-- index.jsp --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="modules.Fruta"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Frutas</title>
    <link href="./assets/css/estilos.css" rel="stylesheet" type="text/css"/>
  </head>
  <body>
    <h1>Frutas</h1>

    <% 
      //Establecemos conexión con la BBDD
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/frutas", "root", "");

      //Establecemos consulta
      Statement consulta  = conexion.createStatement();
    
      if (request.getParameterMap().isEmpty()) {

      String id;
      String nombre;
          
      ResultSet resultado = consulta.executeQuery("SELECT * FROM fruta ;");
    %>

    <form method="get" action="index.jsp">
      <label for="fruta">Selecciona una fruta: </label>
      <select id="fruta" name="fruta">
        
        <%
          while(resultado.next()) {
            id = resultado.getString("id");
            nombre = resultado.getString("nombre");

            out.println("<option value=\"" + id + "\">" +
            nombre + "</option>");
          }
      
        %>

      </select>
        <button>Enviar</button>
    </form>


    <% 
    } else {

      ResultSet resultado = consulta.executeQuery("SELECT * FROM fruta WHERE id = " +
      request.getParameter("fruta") + " ;");

      //Movemos el cursor al primer (y único en este caso) registro
      resultado.next();

      //Establecemos codificación UTF-8
      request.setCharacterEncoding("UTF-8"); 
      Fruta fruta = new Fruta(resultado.getString("id"), 
                              resultado.getString("nombre"));
      out.println("<h4>Me gusta mucho comer " + fruta.getNombre() +
                  "</h4>"); 
      out.println(fruta);

    }

    //Cerramos conexión
    conexion.close();
    %>
  </body>
</html>