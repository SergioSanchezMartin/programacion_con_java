import java.io.File;

/**
 * Clase File. Método que lista todos los archivos de una carpeta y sus subcarpetas.
 * 
 * @author Sergio Sánchez Martín
 */
public class Ejemplo09 {
  public static void listarArchivos(File carpeta) {

    if (carpeta.isDirectory()) {
      File[] lista = carpeta.listFiles();
      for (File f : lista) {
        if(f.isFile()) System.out.println(f.getPath());
        else if(f.isDirectory()) listarArchivos(f);   //Recursividad: una función se llama a sí misma
      }
    }
  }

  public static void main(String[] args) {
    File ruta = new File(".");
    listarArchivos(ruta);
  }
}
