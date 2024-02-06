/**
 * Generar números enteros entre [0,10)
 * 
 * @author Sergio Sánchez
 */
public class Ejemplo03 {
  public static void main(String[] args) {
    int numero;

    for (int i = 0; i < 10; i++) {
      numero = (int)(Math.random()*10);
      System.out.println(numero);
    }
  }
}
