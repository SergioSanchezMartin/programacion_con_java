/**
 * Tema 4 - Sentencias condicionales
 * 
 * 6. Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t =√(2h/g) siendo g = 9.81m/s2
 * 
 * @author Sergio Sánchez
 */

import java.util.Scanner;

public class T04Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final double g = 9.81;    //Como g es un valor constante (gravedad), lo declaramos como tal
    double h;

    System.out.println("Cálculo del tiempo de caída de un objeto.");
    System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
    h = sc.nextDouble();
    
    double t = Math.sqrt(2*h/g);
    
    System.out.printf("El objeto tarda %.2f\" en caer.\n", t);
    
    sc.close();
  }
  
}
