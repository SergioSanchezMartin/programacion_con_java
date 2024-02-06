/**
 * Tema 5 - Bucles
 *
 * 2. Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 * 
 * @author Sergio Sánchez
 */
public class T05Ejercicio02 {
  public static void main(String[] args) {
    int i = 0;
    System.out.println("A continuación se muestra el listado de múltiple de 5 del 0 al 100:");

    while (i <= 100) {
      System.out.println(i);
      i+=5;     //i += 5  <-->  i = i + 5
    }
  }
}
