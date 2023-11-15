/**
 * Tema 5 - Bucles
 *
 * 1. Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 * 
 * @author Sergio Sánchez
 */
public class T05Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("A continuación se muestra el listado de múltiple de 5 del 0 al 100:");
    
    for (int i = 0; i <= 100; i += 5) {     //i += 5  <-->  i = i + 5
      System.out.println(i);
    }
  }
}
