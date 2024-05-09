<%-- @author Sergio Sánchez Martín --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modules.Conexion"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>

<% 
  //Conectamos con la BBDD
  Connection conexion = Conexion.getConexion("ccaa");
  Statement consulta = conexion.createStatement();
  out.println("BORRANDO PROVINCIA CON CLAVE PRIMARIA codProv = " + request.getParameter("cod"));

  //El método executeQuery devuelve un objeto de la clase ResultSet, por lo que
  //únicamente se utilizará para consultas de tipo SELECT

  //El método execute devuelve TRUE|FALSE, por lo que lo utilizaremos preferentemente
  //tan solo para las consultas de tipo INSERT, DELETE y UPDATE
  consulta.execute("DELETE FROM provincia WHERE codProv = " + request.getParameter("cod") + " ;"); 

  //Cerramos la conexión con BBDD
  conexion.close();

  //Redirigirnos a alguna página JSP a nivel servidor 
  //Forma 1:
  // response.setStatus(response.SC_FOUND);    //Establece estado de respuesta HTTP "302 Found"
  // response.setHeader("Location", "http://localhost:8080/provincias");    //Establece la cabecera Location en la respuesta HTTP con la URL a la que redireccionarnos

  //Forma 2: Realizamos una redirección HTTP al navegador del cliente de forma más simplificada
  response.sendRedirect("http://localhost:8080/provincias");
%>

<%-- NO RECOMENDABLE: Depende del soporte de JavaScript en el navegador del cliente y no es tan confiable como lo anterior.
<script>document.location = "http://localhost:8080/provincias"</script> 
--%>


