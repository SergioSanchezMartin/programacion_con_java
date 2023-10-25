/**
 * Tema 2 - Variables
 * 
 * 1. Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 *    los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 *    el valor de cada variable, la suma, la resta, la división y la multiplicación.
 * 
 * @author Sergio Sánchez
 */
public class T02Ejercicio01 {
  public static void main(String[] args) {
    int x = 144;
    int y = 999;

    System.out.println("El valor de x: " + x);
    System.out.println("El valor de y: " + y);
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));
    System.out.println("x / y = " + ((float) x / (float) y));   //Hacemos casting para que no nos salga resultado 0.
    System.out.println("x * y = " + (x * y));
  }
}
