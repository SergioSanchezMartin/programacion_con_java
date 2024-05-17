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
    <title>Pokémon</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
  
  </head>
  <body>

    <% 

      // conectamos con el servidor de bases de datos
        Connection conexion = ConexionBD.getConexion("pokemondb") ;

      // creamos una sentencia
      Statement consulta  = conexion.createStatement() ;

      // Máquina de estados: si no hay parámetros, "pinto" el formulario.
      // Si hubiera (else), realizamos el INSERT

      if(request.getParameterMap().isEmpty()) {
    %>

    <form action="" method="post">

      <div class="form-group">
        <label for="nombre">Nombre Pokémon:</label>
        <%-- Con placeholder + readonly/disabled el dni se pierde, se manda vacío --%>
        <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Bulbasaur" required>
      </div>

      <div class="form-group">
        <label for="altura">Altura (m):</label>
        <input type="number" class="form-control" min="0" max="10" step="0.1" id="altura" name="altura" required>
      </div>

      <div class="form-group">
        <label for="peso">Peso (kg):</label>
        <input type="number" class="form-control" min="0" max="500" step="0.1" id="peso" name="peso" required>
      </div>

      <div class="form-group">
        <label for="sprite">URL imagen:</label>
        <input type="text" class="form-control" id="sprite" name="sprite" placeholder="https://..." required>
      </div>


      <%-- Permitimos escoger entre varios tipos con el select multiple --%>
      <div class="form-group">
        <label for ="tipo">Selecciona tipo Pokémon:</label>
        <select id="tipo" name="tipo[]" multiple>

          <%

            // lanzamos consulta
            ResultSet resultado = consulta.executeQuery("SELECT * FROM tipo ;") ;

            while(resultado.next()) {
              out.println("<option value=\"" + resultado.getString("id_tipo") + "\">");
              out.println(resultado.getString("nombre"));
              out.println("</option>");
            }
          %>

        </select>
      </div>

      <button type="submit" class="btn btn-success">
        <i class="bi bi-floppy2-fill"></i>
        Guardar
      </button>

    </form>

    <% 
      } else {

        request.setCharacterEncoding("UTF-8");

        String nombre = request.getParameter("nombre");
        String peso = request.getParameter("peso");
        String altura = request.getParameter("altura");
        String sprite = request.getParameter("sprite");
        String[] tiposSeleccionados = request.getParameterValues("tipo[]");
          
        //insertamos en la tabla pokemon
        String sql  = "INSERT INTO pokemon(nombre, peso, altura, sprite) "
                    + "VALUES ('" + nombre 
                    +  "', '" + peso 
                    +  "', '" + altura
                    +  "', '" + sprite + "') ;" ; 

        consulta.execute(sql);
          
        //Buscamos el numero_pokedex del nuevo registro insertado
        sql = "SELECT * FROM pokemon "
            + "WHERE nombre = '" + nombre + "' "
            + "AND peso = '" + peso + "' "
            + "AND altura = '" + altura + "' "
            + "AND sprite = '" + sprite + "' ;";
          
        // Obtener el numero_pokedex (PK) del pokemon que acabamos de insertar
        ResultSet resultado = consulta.executeQuery(sql);
        int idPokemon = 0;
        if (resultado.next()) {
            idPokemon = resultado.getInt("numero_pokedex");
        }

        for(String tipo : tiposSeleccionados) {
          sql = "INSERT INTO pokemon_tipo "
              + "VALUES ('" + idPokemon + "', '" + tipo + "') ;";
          // out.println(sql);
          consulta.execute(sql);
        }

        

        response.sendRedirect("http://localhost:8080/pokemon");
      }   //cerramos el if-else 

      // cerramos la conexión
      // IMPORTANTE: NO SE NOS DEBE OLVIDAR
      conexion.close();
    %>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>


</body>
</html>