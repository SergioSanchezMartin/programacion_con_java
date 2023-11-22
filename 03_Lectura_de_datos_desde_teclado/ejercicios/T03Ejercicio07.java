/**
 * Tema 3 - Lectura de datos desde teclado
 *
 * 7. Escribe un programa que calcule el total de una factura a partir
 * de la base imponible.
 *
 * @author Sergio Sánchez
 */
import java.util.Scanner;

public class T03Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double baseImponible;
    
    System.out.print("Por favor, introduzca la base imponible (precio del artículo sin IVA): ");
    baseImponible = sc.nextDouble();

    System.out.printf("\nBase imponible %8.2f €\n", baseImponible);
    System.out.printf("IVA (21%%)      %8.2f €\n", (baseImponible * 0.21));   //Para imprimir el carácter %, lo debemos escapar utilizando %%
    System.out.printf("-------------------------\n");
    System.out.printf("Total          %8.2f €\n", (baseImponible * 1.21));

    sc.close();
  }
}