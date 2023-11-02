/**
 * Tema 3 - Lectura de datos desde teclado
 * 
 * 3. Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Sergio Sánchez
 */

import java.util.Scanner;

public class T03Ejercicio03 {
  public static void main(String[] args) {
    int pesetasAConvertir;
    Scanner sc = new Scanner(System.in);

    //Si queremos usar el punto (.) para delimitar los decimales, es necesaria la siguiente sentencia.
    // sc.useLocale(Locale.ENGLISH);

    System.out.print("Por favor, introduzca la cantidad de pesetas que quiere convertir: ");
    pesetasAConvertir = sc.nextInt();
    double euros = (pesetasAConvertir / 166.386);      //No hacemos casting (division entero y real --> real)

    System.out.printf("%d pta --> %.2f €", pesetasAConvertir, euros);   //El resultado es formateado: dos decimales con coma

    sc.close();
  }
}
