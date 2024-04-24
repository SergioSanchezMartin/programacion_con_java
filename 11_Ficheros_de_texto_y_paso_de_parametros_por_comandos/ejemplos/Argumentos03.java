import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejemplo de lectura de ficheros con números
 * Calcula la media de los números que se encuentran en un fichero de texto
 */
public class Argumentos03 {
  public static void main(String[] args) {
    
    if (args.length != 1) {
      System.out.println("Este programa calcula la media de los números contenidos en un fichero.");
      System.out.println("Uso del programa: java Argumentos03 FICHERO");
      System.exit(0);
    }
    
    try {
      FileReader archivo = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(archivo);
      String linea = "0";
      int numLineas = -1;   //Empezamos en -1 porque va a contar la última línea (null)
      double suma = 0;
      
      do {
        suma += Double.parseDouble(linea);
        linea = br.readLine();
        numLineas++;
      } while (linea != null);

      System.out.println("Número de líneas leídas: " + numLineas);
      System.out.println("SUMA: " + suma);
      System.out.printf("MEDIA: %.2f", suma / numLineas);

      br.close();

    } catch (FileNotFoundException fnfe) {
      System.out.println("No se ha podido encontrar el fichero numeros.txt");
      System.out.println(fnfe.getMessage());
    } catch (IOException ioe) {
      System.out.println("Error en la lectura");
      System.out.println(ioe.getMessage());
    }
    


  }
  
}