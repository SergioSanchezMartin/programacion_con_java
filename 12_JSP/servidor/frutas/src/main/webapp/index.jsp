<%-- index.jsp --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

    <% if (request.getParameterMap().isEmpty()) { %>
    <form method="get" action="index.jsp">
      <label for="fruta">Selecciona una fruta: </label>
      <select id="fruta" name="fruta">
        <option value="kiwi">Kiwi</option>
        <option value="mango">Mango</option>
        <option value="melon">Melón</option>
        <option value="platano">Plátano</option>
        <option value="sandia">Sandía</option>
      </select>
        <button>Enviar</button>
    </form>


    <% 
    } else {
      request.setCharacterEncoding("UTF-8"); 
      Fruta fruta = new Fruta(request.getParameter("fruta"));
      out.println("<h4>Me gusta mucho comer " + fruta.getNombre() +
                  "</h4>"); 
      out.println(fruta);
    }
    %>
  </body>
</html>