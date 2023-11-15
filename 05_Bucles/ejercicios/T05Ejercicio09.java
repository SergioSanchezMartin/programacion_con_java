/**
 * Tema 5 - Bucles
 *
 * 9. Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
 * esta manera, la única limitación en el número de dígitos la establece el tipo de
 * dato que se utilice (int o long).
 * 
 * @author Sergio Sánchez
 */
import java.util.Scanner;

public class T05Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n;
    int numeroCifras = 1;     //En caso de no entrar en el bucle, entonces el número es de 1 cifra.

    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    long numeroIntroducido = sc.nextLong();
    n = numeroIntroducido;
    sc.close();

    while (n >= 10) {
      //Si entra aquí, obligatoriamente el número es mayor de 1 cifra.
      numeroCifras++;
      n = n / 10;     //Se puede poner como n /= 10
    }
    
    if (numeroCifras == 1) {
      System.out.println(numeroIntroducido + " tiene 1 cifra.");
    } else {
      System.out.println(numeroIntroducido + " tiene " + numeroCifras +" cifras.");
    }
  }
}
