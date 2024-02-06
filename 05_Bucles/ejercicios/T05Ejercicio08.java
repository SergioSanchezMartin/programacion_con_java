/**
 * Tema 5 - Bucles
 *
 * 8. Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Sergio Sánchez
 */
import java.util.Scanner;

public class T05Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un número y le mostraré su tabla de multiplicar: ");
    int numeroIntroducido = sc.nextInt();
    sc.close();

    for (int i = 0; i <= 10; i++) {
      System.out.printf("%2d x %2d = %3d\n", numeroIntroducido, i, numeroIntroducido * i);
    }
  }
}
