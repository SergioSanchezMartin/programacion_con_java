import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Lectura de datos desde teclado usando la clase Scanner
 *
 * @author Luis J. Sánchez
 */
public class LeeDatosScannerMedia {
  public static void main(String[] args) throws IOException {
    // Scanner s = new Scanner(System.in);
    Scanner s = new Scanner(System.in);
    


    // System.out.println("Introduce tu nombre:");
    // String line = s.nextLine();
    // System.out.println(line);

/* 
    byte[] bytes = new byte[10];
    System.in.read(bytes);

    for(byte b : bytes){
      System.out.println((int)b);
    }

    System.out.println(bytes);
    System.out.println(System.in.available());*/

    // s.useLocale(Locale.ENGLISH);
    // System.out.println("Current Locale: "
                          //  + s.locale()); 

    // System.out.print("Introduce tres números (pueden contener decimales) separados por espacios: ");
    // double x1 = s.nextDouble();
    // double x2 = s.nextDouble();
    // double x3 = s.nextDouble();
    
    // double media = (x1 + x2 + x3) / 3;
    
    // System.out.println("La media de esos tres números es " + media);
    // s.close();
    String prueba = "Sánchez";
    System.out.println(prueba);
    System.out.println("Introduce tu nombre:");
    String nombre = s.nextLine();

    // System.out.println("Introduce tu edad:");
    // int edad = s.nextInt();

    // System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
    System.out.println("Tu nombre es " + nombre);
  }
}