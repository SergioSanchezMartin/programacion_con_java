/**
 * Tema 5 - Bucles
 *
 * 21. Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga
 * cuantos números se han introducido, la media de los impares y el mayor de los pares. El número negativo
 * sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.
 *  
 * @author Sergio Sánchez
 */
import java.util.Scanner;

public class T05Ejercicio21 {
  public static void main(String[] args) {
    int contadorNumeros = 0;
    int contadorImpares = 0;
    int sumaImpares = 0;
    int maximoPares = 0;
    int numeroIntroducido;
    // double mediaImpares = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, vaya introduciendo números enteros.");
    System.out.println("Puede terminar mediante la introducción de un número negativo.");

    do {
      numeroIntroducido = sc.nextInt();
      if (numeroIntroducido >= 0) {
        contadorNumeros++;
        if (numeroIntroducido % 2 == 1) {     //Si es número impar
          contadorImpares++;
          sumaImpares += numeroIntroducido;
        } else {                              //Si no es impar, será par
          if (numeroIntroducido > maximoPares) {
            maximoPares = numeroIntroducido;
          }
        }
      }
    } while (numeroIntroducido >= 0);
    
    // double mediaImpares = sumaImpares/contadorImpares;
    sc.close();
    System.out.println("Ha introducido " + contadorNumeros + " números.");
    System.out.printf("La media de los numero impares es %.2f.\n", (double) sumaImpares/contadorImpares);
    // System.out.printf("La media de los numero impares es %.2f.\n", mediaImpares);
    System.out.println("El máximo de los números pares es " + maximoPares + ".");
  }
}
