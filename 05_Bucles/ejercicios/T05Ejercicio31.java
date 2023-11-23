/**
 * Tema 5 - Bucles
 * 
 * 31. Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la altura. El
 * palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.
 * 
 * @author Sergio Sánchez
 */

public class T05Ejercicio31 {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura de la L: ");
    int altura = Integer.parseInt(System.console().readLine());

    //Pintamos el palo
    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }

    //Pintamos la base
    for (int i = 1; i <= (altura/2)+1; i++) {
      System.out.print("*");
    }
  }
}
