import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Ejemplo de escritura en un fichero de texto, añadiendo contenido al final si existe el fichero.
 *
 */

public class Ejemplo03bis {
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/fruta.txt", true));
      bw.write("pomelo\n");
      bw.write("fresa\n");
      bw.write("manzana\n");

      bw.close();

    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero. " + ioe.getMessage());
    }
  }
}