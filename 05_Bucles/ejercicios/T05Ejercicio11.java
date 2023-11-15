/**
 * Tema 5 - Bucles
 *
 * 11. Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números
 * enteros a partir de uno que se introduce por teclado.
 * 
 * @author Sergio Sánchez
 */
import java.util.Scanner;

public class T05Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeroIntroducido;
    
    System.out.print("Introduce un número: ");
    numeroIntroducido = sc.nextInt();
    sc.close();
    System.out.println("   n   |    n²    |    n³     ");
    System.out.println("----------------------------");

    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      System.out.printf("%5d  |%8d  |%9d  \n", i, i * i, i * i * i);
    }
  }
}
