/**
 * Tema 3 - Lectura de datos desde teclado
 *
 * 10. Realiza un conversor de Mb a Kb
 *
 * @author Sergio Sánchez
 */
public class T03Ejercicio10 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca el número de Mb: ");
    double mb = Double.parseDouble(System.console().readLine());
    System.out.println(mb + "Mb = " +  (mb * 1024) + "Kb");
  }
}