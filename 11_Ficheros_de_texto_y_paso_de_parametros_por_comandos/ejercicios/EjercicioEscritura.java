import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Crea un método que reciba el nombre de un archivo y un entero. 
 * El método deberá crear el archivo y escribir tanta líneas como 
 * indique el entero pasado por parámetro. Cada línea deberá tener 
 * escrito “Esta es la línea número n”, sustituyendo n por el número 
 * de la línea, empezando por 1. Utiliza un buffer para realizar la 
 * escritura de forma más eficiente. Prueba la función dentro del 
 * método main en el mismo archivo.
 * 
 * @author Sergio Sánchez
 */
public class EjercicioEscritura {

  public static void crearLineas(String nombreArchivo, int n) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
      for (int i = 1; i <= n; i++) {
        bw.write("Esta es la línea " + i);
        bw.newLine();
      }
      bw.close();
    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero. " + ioe.getMessage());
    }
  }
  public static void main(String[] args) {

    System.out.print("Introduzca el nombre del archivo: ");
    String nombre = System.console().readLine();

    System.out.print("Introduzca el número de líneas que contendrá el fichero: ");
    int numLineas = Integer.parseInt(System.console().readLine());

    crearLineas(nombre, numLineas);

  } 
}
