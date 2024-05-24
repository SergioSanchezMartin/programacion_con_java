/** 
 * @author Sergio Sánchez Martín
 */
package modules;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {
  
  private static final String URL = "jdbc:mysql://localhost:3306/";
  private static final String USER = "root";
  private static final String PASS = "";

  public static Connection getConexion(String bbdd) {
    Connection conexion = null;

    try {
      Class.forName("com.mysql.jdbc.Driver");
      conexion = DriverManager.getConnection(URL + bbdd, USER, PASS);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return conexion;
  }

}
