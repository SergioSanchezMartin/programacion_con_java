/**
 * Tema 5 - Bucles
 *
 * 10. Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 * 
 * @author Sergio Sánchez
 */

public class T05Ejercicio10 {
  public static void main(String[] args) {
    double numeroIntroducido = 0;
    int cantidadPositivos = 0;
    double media;
    double suma = 0;    //Donde iremos acumulando los numeros y que nos sirve para hacer la media

    System.out.println("Este programa calcula la media de los números positivos introducidos.");
    System.out.println("Para parar, introduzca un número negativo.");
    System.out.println("Introduce números y pulse INTRO:");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Double.parseDouble(System.console().readLine());
      //El 0 no se tendrá en cuenta para el cálculo de la media.
      if (numeroIntroducido > 0) {
        suma += numeroIntroducido;
        cantidadPositivos++;
      }
    }
    media = suma / cantidadPositivos;
    System.out.printf("La media de los %d números positivos introducidos es: %.2f", cantidadPositivos, media);
  }
}
