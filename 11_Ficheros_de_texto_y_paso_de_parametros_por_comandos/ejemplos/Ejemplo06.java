import java.io.File;

/**
 * Ejemplo de uso de la clase File
 * 
 * @author Sergio Sánchez
 */
public class Ejemplo06 {
  public static void main(String[] args) {
    // se indica la ruta entre comillas (el . representa el directorio actual)
    File f = new File(".");

    // recuperamos el contenido del directorio
    String[] listaArchivos = f.list(); 

    // mostramos el listado
    for(String nombreArchivo : listaArchivos) {
      System.out.println(nombreArchivo); 
    }

  }
}
