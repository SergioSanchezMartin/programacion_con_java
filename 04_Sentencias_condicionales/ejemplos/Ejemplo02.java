/**
 * Ejemplo para utilizar operadores lógicos
 * 
 * @author Sergio Sánchez
 */

import java.util.Scanner;

public class Ejemplo02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("Introduce un valor comprendido entre 1 y 100: ");
    numero = sc.nextInt();

    if ((numero >= 1) && (numero <= 100)) {
      System.out.println("¡Enhorabuena! ¡El valor introducido está en el rango indicado!");
    } else {
      System.out.println("¡Te he dicho un valor entre 1 y 100!");
    }

    sc.close();
  }
}
