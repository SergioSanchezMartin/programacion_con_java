/**
 * Tema 3 - Lectura de datos desde teclado
 *
 * 4. Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 *
 * @author Sergio Sánchez
 */

import java.util.Scanner;

public class T03Ejercicio04 {
  public static void main(String[] args) {
    double x;
    double y;
    Scanner sc = new Scanner(System.in);

    System.out.print("Por favor, introduzca el primer número: ");
    x = sc.nextDouble();
    System.out.print("Introduzca el segundo número: ");
    y = sc.nextDouble();
    
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));
    System.out.println("x / y = " + (x / y));
    System.out.println("x * y = " + (x * y));

    sc.close();
  }
}