/**
 * Tema 2 - Variables
 * 
 * 5. Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 *    convertir deberá estar almacenada en una variable. 1 € = 166.386 pesetas.
 *    
 * @author Sergio Sánchez
 */

public class T02Ejercicio05 {
  public static void main(String[] args) {
    int pesetasAConvertir = 1000;
    double euros = pesetasAConvertir / 166.386;   //No hacemos casting (division entero y real --> real)

    System.out.println(pesetasAConvertir + " pta --> " + euros + " €");
    System.out.printf("%d pta --> %.2f €", pesetasAConvertir, euros);   //El resultado es formateado: dos decimales con coma
  }
}