/**
 * Tema 3 - Lectura de datos desde teclado
 * 
 * 2. Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Sergio Sánchez
 */

import java.util.Scanner;

public class T03Ejercicio02 {
  public static void main(String[] args) {
    double eurosAConvertir;
    Scanner sc = new Scanner(System.in);

    //Si queremos usar el punto (.) para delimitar los decimales, es necesaria la siguiente sentencia.
    // sc.useLocale(Locale.ENGLISH);

    System.out.print("Por favor, introduzca la cantidad de euros que quiere convertir: ");
    eurosAConvertir = sc.nextDouble();
    int pesetas = (int) (eurosAConvertir * 166.386);      //Se hace casting porque necesitamos un entero (multiplicar real y real --> real)

    System.out.printf("%.2f € --> %d pta", eurosAConvertir, pesetas);   //El resultado es formateado: dos decimales con coma

    sc.close();
  }
}
