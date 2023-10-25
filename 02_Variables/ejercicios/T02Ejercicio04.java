/**
 * Tema 2 - Variables
 * 
 * 4. Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 *    convertir deberá estar almacenada en una variable. 1 € = 166.386 pesetas.
 *    
 * @author Sergio Sánchez
 */

public class T02Ejercicio04 {
  public static void main(String[] args) {
    double eurosAConvertir = 6.00;
    int pesetas = (int) (eurosAConvertir * 166.386);      //Se hace casting porque necesitamos un entero (multiplicar real y real --> real)

    System.out.println(eurosAConvertir + " € --> " + pesetas + " pta");
    System.out.printf("%.2f € --> %d pta", eurosAConvertir, pesetas);   //El resultado es formateado: dos decimales con coma
  }
}
