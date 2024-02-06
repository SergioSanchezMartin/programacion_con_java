/**
 * Generar números enteros entre [1,11)
 * 
 * @author Sergio Sánchez
 */
public class Ejemplo04 {
  public static void main(String[] args) {
    int numero;

    for (int i = 0; i < 10; i++) {
      numero = (int)(Math.random()*10) + 1;
      System.out.println(numero);
    }
  }
}