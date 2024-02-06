/**
 * Segundo ejemplo de numeros aleatorios. Genera número entre [0,10)
 * 
 * @author Sergio Sánchez
 */
public class Ejemplo02 {
  public static void main(String[] args) {
    double numero;

    for (int i = 0; i < 10; i++) {
      numero = Math.random()*10;
      System.out.println(numero);
    }
  }
}