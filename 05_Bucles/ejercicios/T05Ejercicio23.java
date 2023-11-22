/**
 * Tema 5 - Bucles
 * 
 * 23. Escribe un programa que permita ir introduciendo una serie indeterminada de números hasta que su suma
 * supere el valor 10000. Cuando esto último ocurra, se debe mostrar el total acumulado, el contador de los
 * números introducidos y la media.
 * 
 * @author Sergio Sánchez
 */
import java.util.Scanner;

public class T05Ejercicio23 {
  public static void main(String[] args) {
    int contadorNumeros = 0;
    int suma = 0;
    int numeroIntroducido;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Por favor, vaya introduciendo números.");
    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
    //Al menos nos debe dejar introducir un número, por lo que encaja perfectamente un do-while o un while
    do {
      numeroIntroducido = sc.nextInt();
      contadorNumeros++;
      suma += numeroIntroducido;
    } while (suma <= 10000);
    sc.close();
    
    System.out.println("Ha introducido un total de " + contadorNumeros + " números.");
    System.out.println("La suma total de los números introducidos es " + suma + ".");
    System.out.printf("La media de los números introducidos es %.2f.\n", (double) suma / contadorNumeros);
  }
}
