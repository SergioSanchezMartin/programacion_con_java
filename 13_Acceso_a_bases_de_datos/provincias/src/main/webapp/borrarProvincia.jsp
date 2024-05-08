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

  conexion.close();
%>