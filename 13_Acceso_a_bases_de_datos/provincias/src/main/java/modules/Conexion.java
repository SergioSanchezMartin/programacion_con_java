/** 
 * @author Sergio Sánchez Martín
 */

package modules;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

  private final static String url = "jdbc:mysql://localhost:3306/";
  private final static String user = "root";
  private final static String pass = "";
  
  public static Connection getConexion(String bbdd) {
    Connection conexion = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      conexion = DriverManager.getConnection(url + bbdd,user,pass);
    } catch (Exception e) {
      System.out.println("Se ha producido un error al conectar con la base de datos");
    }
    return conexion;
  }
}
