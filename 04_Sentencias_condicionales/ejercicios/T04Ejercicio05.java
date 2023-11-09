/**
 * Tema 4 - Sentencias condicionales
 * 
 * 5. Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
 * 
 * @author Sergio Sánchez
 */

import java.util.Scanner;

public class T04Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a;
    double b;

    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Por favor, introduzca el valor de a: ");
    a = sc.nextDouble();
    System.out.print("Ahora introduzca el valor de b: ");
    b = sc.nextDouble();

    // Si a = 0 y b!=0, entonces no tiene solución real
    if ((a == 0) && (b != 0)) {
      System.out.println("Esa ecuación no tiene solución real.");
    } else if ((a == 0) && (b == 0)) {
      System.out.println("x = 0, evidentemente.");
    } else {
      System.out.println("x = " + (-b/a));
    }
    sc.close();
  }
}
