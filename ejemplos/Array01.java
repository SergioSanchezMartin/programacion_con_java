/**
 * Ejemplo primero del Tema 7 - Arrays
 * 
 * @author Sergio Sánchez
 */

public class Array01 {
  public static void main(String[] args) {
    int[] n;
    n = new int[4];

    n[0] = 26;
    n[1] = -30;
    n[2] = 0;
    n[3] = 100;

    System.out.println("Los valores del array son los siguientes:");
    System.out.println(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);

    int suma = n[1] + n[3];
    System.out.println("El resultado de sumar el segundo elemento y el cuarto es: " + suma);

  }  
}