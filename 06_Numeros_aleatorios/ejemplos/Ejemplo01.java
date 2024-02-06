/**
 * Primer ejemplo de numeros aleatorios
 * 
 * @author Sergio Sánchez
 */
public class Ejemplo01 {
  public static void main(String[] args) {
    double numero;

    for (int i = 0; i < 10; i++) {
      numero = Math.random();
      System.out.println(numero);
    }
  }
}