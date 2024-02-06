/**
 * Tema 5 - Bucles
 * 
 * 24. Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas como en la siguiente figura:
 *          1 
 *         121
 *        12321 
 *       1234321
 * 
 * @author Sergio Sánchez
 */

public class T05Ejercicio24 {
  public static void main(String[] args) {
    int nivel = 1;
    int i;

    System.out.println("Este programa pinta una pirámide hecha a base de números.");
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    int espaciosPorDelante = alturaIntroducida - 1;

    while (nivel <= alturaIntroducida) {
      // inserta espacios por delante
      for (i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }

      // Pintamos los números ascendentes hasta el número central
      for (i = 1; i <= nivel; i++) {
        System.out.print(i);
      }

      // Pintamos los números descendentes después del número central
      for (i = nivel - 1; i >= 1; i--) {
        System.out.print(i);
      }

      //Saltamos al siguiente nivel
      System.out.println();
      nivel++;
      espaciosPorDelante--;   //Se reduce los espacios por delante una unidad
    }
  }
}
