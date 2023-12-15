/**
 * Primer ejemplo del tema 14
 * 
 * @author Sergio Sánchez
 */

import java.util.Scanner;

public class Ejemplo01 {
  public static void main(String[] args) {
    int numero1;
    int numero2;
    Scanner sc = new Scanner (System.in);

    try {
      System.out.print("Introduzca el primer número: ");
      numero1 = Integer.parseInt(sc.nextLine());
      System.out.print("Introduzca el segundo número: ");
      numero2 = Integer.parseInt(sc.nextLine());
      sc.close();
      System.out.println("La media es = " + (numero1 + numero2)/2);
    } catch (NumberFormatException nfe) {
      System.out.println("No se pueden introducir caracteres. Se piden numeros.");
    } catch (Exception e) {
      System.out.println("Error de mensaje: " + e.getMessage());
      System.out.println("Clase de excepción: "+ e.getClass());
    } finally {
      System.out.println("Gracias por utilizar este programa.");
    }
  }
}