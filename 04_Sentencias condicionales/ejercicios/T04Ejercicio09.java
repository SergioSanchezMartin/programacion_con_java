/**
 * Tema 4 - Sentencias condicionales
 * 
 * 9. Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax2 + bx + c = 0).
 * 
 * @author Sergio Sánchez
 */

import java.util.Scanner;

 public class T04Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("Este programa resuelve ecuaciones de segundo grado.");
    System.out.println("ax\u00B2 + bx + c = 0");
    System.out.println("Por favor, introduzca los valores.");
    
    System.out.print("a = ");
    double a = sc.nextDouble();

    System.out.print("b = ");
    double b = sc.nextDouble();

    System.out.print("c = ");
    double c = sc.nextDouble();

    double discriminante = Math.pow(b, 2) - (4*a*c);

    // ax^2 + bx + c = 0  con a, b y c distintos de 0
    
    if ((a != 0) && (b != 0) && (c != 0)) {  
      if (discriminante < 0) {
          System.out.println("La ecuación no tiene soluciones reales");
      } else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
      }
    }

    // 0x^2 + 0x + 0 = 0
    
    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("La ecuación tiene infinitas soluciones.");
    }
    
    // 0x^2 + 0x + c = 0  con c distinto de 0
    
    if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("La ecuación no tiene solución.");
    }
      
    //Sin término independiente (c = 0)

    if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));
    }


    // 0x^2 + bx + c = 0  con b y c distintos de 0
    
    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 = x2 = " + (-c / b));
    }

    sc.close();
  }
  
}
