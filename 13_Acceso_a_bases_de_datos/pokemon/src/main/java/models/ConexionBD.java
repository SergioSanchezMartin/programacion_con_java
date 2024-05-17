/**
 * @author Sergio Sánchez Martín
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {


    private static final String url     = "jdbc:mysql://localhost:3306/" ;
    private static final String usuario = "root" ;
    private static final String clave   = "" ;

    /**     
     * @param bbdd
     * @return
     */
    public static Connection getConexion(String bbdd) {

        Connection conexion = null ;

        try {
            Class.forName("com.mysql.jdbc.Driver") ;
            conexion = DriverManager.getConnection(url + bbdd, usuario, clave) ;
        } catch(Exception excp) {
            System.out.println("Se ha producido un error al conectar con la base de datos.");
        }

        return conexion ;
    }
    
}