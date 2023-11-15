/**
 * Tema 5 - Bucles
 *
 * 12. Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término
 * de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que
 * tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe introducir por
 * teclado.
 * 
 * @author Sergio Sánchez
 */

public class T05Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
    System.out.print("Por favor, introduzca n: ");
    int n = Integer.parseInt(System.console().readLine());
    switch (n) {
      case 1:
        System.out.println("0");
        break;
      
      case 2:
        System.out.println("0 1");
        break;
      
      default:
        System.out.print("0 1");
        int primero = 0;
        int segundo = 1;
        int siguiente;
        while (n > 2) {
          siguiente = primero + segundo;
          primero = segundo;
          segundo = siguiente;
          System.out.print(" " + siguiente);
          n--;
        }
        break;
    }
  }
}
