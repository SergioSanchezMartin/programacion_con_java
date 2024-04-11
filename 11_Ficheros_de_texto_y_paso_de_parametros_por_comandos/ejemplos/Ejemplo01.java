import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejemplo de lectura de ficheros
 */
public class Ejemplo01 {
  public static void main(String[] args) {
    try {
      FileReader archivo = new FileReader("C:/Users/Sergio/Desktop/champions.txt");
      BufferedReader br = new BufferedReader(archivo);
      String linea = "";
      
      do {
        // System.out.println(linea);
        linea = br.readLine();
        System.out.println(linea);

      } while (linea != null);

      br.close();

    } catch (FileNotFoundException fnfe) {
      System.out.println("No se ha podido encontrar el fichero champions.txt");
      // fnfe.printStackTrace();
    } catch (IOException ioe) {
      System.out.println("Error en la lectura");
      // ioe.printStackTrace();
    }
    


  }
  
}