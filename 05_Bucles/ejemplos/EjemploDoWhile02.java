/**
 * Ejemplo de bucle do-while II - Programa que lee números de teclado mientras el número introducido sea par
 * 
 * @author Sergio Sánchez
 */
public class EjemploDoWhile02 {
  public static void main(String[] args) {
    int numero = 0;
    do {
      System.out.print("Introduce un número par: ");
      numero = Integer.parseInt(System.console().readLine());
      if (numero % 2 == 0) {
        System.out.println("Ay qué bonito es el número par " + numero);
      } else {
        System.out.println("No me gustan los impares. Adiós");
      }
    } while (numero % 2 == 0);
  }
}
