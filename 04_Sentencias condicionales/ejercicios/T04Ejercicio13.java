/**
 * Tema 4 - Sentencias condicionales
 * 
 * 13. Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * @author Sergio Sánchez
 */

import java.util.Scanner;

public class T04Ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Este programa ordena tres números introducidos por teclado.");
    System.out.println("Por favor, vaya introduciendo los tres números y pulsando INTRO:");

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();

    sc.close();

    // ordenación de los dos primeros números
    if (num1 > num2) {
      int aux = num1;
      num1 = num2;
      num2 = aux;
    }

    // ordenación de los dos últimos números
    if (num2 > num3) {
        int aux = num2;
        num2 = num3;
        num3 = aux;
    }
    
    // se vuelven a ordenar los dos primeros

    if (num1 > num2) {
        int aux = num1;
        num1 = num2;
        num2 = aux;
    }
    System.out.println("Los números introducidos ordenados de menor a mayor son " + num1 + ", " + num2 + " y " + num3 + ".");
  }
}
