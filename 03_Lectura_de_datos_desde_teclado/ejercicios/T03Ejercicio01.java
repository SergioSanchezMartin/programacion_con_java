/**
 * Tema 3 - Lectura de datos desde teclado
 * 
 * 1. Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 * 
 * @author Sergio Sánchez
 */

import java.util.Scanner;

public class T03Ejercicio01 {
  public static void main(String[] args) {
    int x;
    int y;
    Scanner sc = new Scanner(System.in);

    System.out.println("Este programa multiplica dos números enteros.");
    System.out.print("Por favor, introduzca el primer número: ");
    x = sc.nextInt();
    System.out.print("Por favor, introduzca el segundo número: ");
    y = sc.nextInt();

    System.out.println(x + " * " + y + " = " + (x * y));

    sc.close();
  }
}
