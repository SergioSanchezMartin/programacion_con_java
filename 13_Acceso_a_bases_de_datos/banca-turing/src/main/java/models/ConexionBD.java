package models;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
  
  private static final String url  = "jdbc:mysql://localhost:3306/";
  private static final String user = "root";
  private static final String pass = "";

  public static Connection estableceConexion (String bbdd) {
    Connection conexion = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection(url + bbdd, user, pass);
    } catch (Exception e) {
      System.out.println("Se ha producido un error en la conexión con la base de datos.");
    }
    return conexion;    
  }
}
