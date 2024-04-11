import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Ejemplo de escritura en un fichero de texto
 *
 */

public class Ejemplo03 {
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/fruta.txt"));

      bw.write("aguacate");
      bw.newLine();
      bw.write("mango");
      bw.newLine();
      bw.write("níspero\n");

      bw.close();

    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero. " + ioe.getMessage());
    }
    
  }

}
