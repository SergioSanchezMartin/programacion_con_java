import java.io.File;

/**
 * Clase para manejo de ficheros con la clase File
 */

public class Ejemplo05 {
  public static void main(String[] args) {
    File archivo = new File("ficheros/fichero1.txt");
    if (archivo.exists()) {
      System.out.println("El fichero " + archivo.getName() + " existe.");
      System.out.println("Nombre: " + archivo.getName());
      System.out.println("Peso (en bytes): " + archivo.length());
      System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
      
    } else {
      System.out.println("El fichero " + archivo.getName() + " no existe.");
    }

    File carpeta = new File("ficheros");
    if (carpeta.exists()) {
      System.out.println("La carpeta " + carpeta.getName() + " existe.");
      System.out.println("Nombre: " + carpeta.getName());
      System.out.println("Peso (en bytes): " + carpeta.length());
      System.out.println("Ruta absoluta: " + carpeta.getAbsolutePath());
    } else {
      System.out.println("El fichero " + carpeta.getName() + " no existe.");
    }
  } 
}
