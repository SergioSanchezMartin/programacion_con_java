<%-- @author Sergio Sánchez Martín --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="models.ConexionBD"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>

<% 
      String numPokedex = request.getParameter("numPokedex") ;
      String idTipo = request.getParameter("idTipo");


      //establecemos la conexión con la BBDD
      Connection conexion = ConexionBD.getConexion("pokemondb");
      Statement consulta = conexion.createStatement();

      // El método execute devuelve TRUE|FALSE únicamente, por lo que preferentemente lo utilizaremos
      // tan sólo para INSERT, DELETE y UPDATE.
      //
      // El método executeQuery devuelve un objeto de clase ResultSet, por lo que se utilizará únicamente
      // para consultas de tipo SELECT.
      consulta.execute("DELETE FROM pokemon_tipo WHERE numero_pokedex = " + numPokedex + " AND id_tipo = " + idTipo + " ;");

      //Cerramos conexion con la base de datos
      conexion.close();

      //Esta línea realiza una redirección HTTP al navegador del cliente de forma más simplificada
      //Envía un encabezado de respuesta con el código de estado "302 Found" y la URL a la que se debe redirigir el navegador. 
      response.sendRedirect("http://localhost:8080/pokemon") ;
%>

<!-- NO RECOMENDABLE:
Depende del soporte de JavaScript en el navegador del cliente y no es tan confiable como una redirección HTTP a nivel de servidor -->
<!--<script> document.location="http://localhost:8080/pokemon" </script>-->