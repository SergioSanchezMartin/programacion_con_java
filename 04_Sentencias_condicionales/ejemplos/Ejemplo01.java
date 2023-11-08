/**
 * Escribe un programa que solicite por teclado un valor de tipo 
 * numérico entero positivo y, hecho esto, muestre por pantalla 
 * un mensaje que indique si ha aprobado o no.
 * 
 * @author Sergio Sánchez
 */

import java.util.Scanner;

public class Ejemplo01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nota;

    System.out.print("¿Qué nota has sacado en el último examen?: ");
    nota = sc.nextInt();

    //Sentencia if-else
    if (nota >= 5) {
      System.out.println("¡Enhorabuena! ¡has aprobado!");
    } else {
      System.out.println("Lo siento :( Has suspendido.");
    }

    sc.close();
  }
}
