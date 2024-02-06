/**
 * Explica tu código aquí
 * 
 * @author Sergio Sánchez
 */
public class T07Ejercicio19 {
  public static void main(String[] args) {
    int[] num = new int[12];
    for (int i = 0; i < num.length; i++) {
      num[i] = (int)(Math.random()*201);
    }

    System.out.println("Array original:");
    System.out.print("Índice ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", num[i]);
    }

    System.out.print("\nIntroduzca el número que quiere insertar: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
    int posicion = Integer.parseInt(System.console().readLine());

    //Desplazar los valores e insertar el número
    for (int i = num.length - 1; i > posicion; i--) {
      num[i] = num[i - 1]; 
    }
    num[posicion] = numeroIntroducido;

    //Mostramos por pantalla el resultado del cambio
    System.out.println("Array modificado:");
    System.out.print("Índice ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", num[i]);
    }
  }
}
