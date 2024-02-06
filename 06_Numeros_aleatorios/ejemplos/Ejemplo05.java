/**
 * Generar números enteros entre [50,71)
 * 
 * @author Sergio Sánchez
 */
public class Ejemplo05 {
  public static void main(String[] args) {
    int numero;

    for (int i = 0; i < 10; i++) {
      numero = (int)(Math.random()*21 + 50);
      System.out.println(numero);
    }
  }
}