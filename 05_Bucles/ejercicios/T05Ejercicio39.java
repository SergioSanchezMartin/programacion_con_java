/**
 * Tema 5 - Bucles
 *
 * 39. Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los números desde el 1 al número introducido junto
 * con su factorial.
 * 
 * @author Sergio Sánchez
 */
import java.util.Scanner;

public class T05Ejercicio39 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numeroIntroducido = sc.nextInt();
    sc.close();

    for (int n = 1; n <= numeroIntroducido; n++) {
      int factorial = 1;    //Empezamos por un valor inicial al comienzo de cada iteración
      
      for (int i = 1; i <= n; i++) {
        factorial *= i;
      }
      System.out.println(n + "! = " + factorial);
    }
  }
}
