import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Crea un método que reciba un archivo y devuelva la cantidad de palabras 
 * que contiene dicho archivo. Consulta la documentacón de la clase String 
 * para apoyarte en algún método que te permita dividir las palabras que 
 * contiene una línea. Utiliza un buffer para realizar la lectura de forma 
 * más eficiente. Prueba la función dentro del método main en el mismo archivo.
 * 
 * @author Sergio Sánchez
 */
public class EjercicioLectura {

  public static void contadorPalabras(String nombreArchivo) {
    try {
      BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
      int numPalabras = 0;
      String linea = "";

      while (linea != null) {
        String[] palabrasLinea = linea.split("\\s+");   //1 o más ocurrencias de la expresión regular \s, que representa un espacio
        numPalabras += palabrasLinea.length;
      }
      System.out.println("El fichero contiene " + numPalabras + " palabras.");
      br.close();
      
    } catch (FileNotFoundException fnfe) {
      System.out.println("No se ha podido encontrar el fichero numeros.txt");
      System.out.println(fnfe.getMessage());
    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero. " + ioe.getMessage());
    }
    
  }
  public static void main(String[] args) {
    
  }
}
