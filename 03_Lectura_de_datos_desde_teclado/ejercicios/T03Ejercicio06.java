/**
 * Tema 3 - Lectura de datos desde teclado
 *
 * 6. Escribe un programa que calcule el área de un triángulo.
 *
 * @author Sergio Sánchez
 */

import java.util.Scanner;

public class T03Ejercicio06 {
  public static void main(String[] args) {
    double base;
    double altura;
    Scanner sc = new Scanner(System.in);

    //Si queremos usar el punto (.) para delimitar los decimales, es necesaria la siguiente sentencia.
    // sc.useLocale(Locale.ENGLISH);

    System.out.println("Área de un triángulo");
    System.out.println("---------------------");

    System.out.print("Por favor, introduzca la longitud de la base (cm): ");
    base = sc.nextDouble();
    System.out.print("Introduzca la altura (cm): ");
    altura = sc.nextDouble();
    
    System.out.println("El área del triángulo es " + (base * altura)/2 + " cm²");

    sc.close();
  }
}