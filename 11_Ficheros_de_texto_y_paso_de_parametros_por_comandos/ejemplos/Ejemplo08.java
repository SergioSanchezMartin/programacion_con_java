import java.io.File;

/**
 * Uso de la clase File. Lista archivos de una carpeta, indicando el tamaño en bytes
 * Uso de las funciones isDirectory(), listFiles(), isFile(), getName(), length
 * 
 * @author Sergio Sánchez Martín
 */
public class Ejemplo08 {
  
  public static void listarArchivos(String rutaCarpeta) {
    File carpeta = new File(rutaCarpeta);
    if (carpeta.exists()) {
      if (carpeta.isDirectory()) {
        File[] lista = carpeta.listFiles();
        for (File f : lista) {
          if (f.isFile()) {
            System.out.println(f.getName() + "\t Tamaño: " + f.length() + " B");
          }
        }
      } else {
        System.out.println("El fichero " + rutaCarpeta + " no es una carpeta.");
      }
    } else {
      System.out.println("El fichero " + rutaCarpeta + " no existe.");
    }
    
  }

  public static void main(String[] args) {
    String ruta = "ficheros";
    listarArchivos(ruta);
  }
}
