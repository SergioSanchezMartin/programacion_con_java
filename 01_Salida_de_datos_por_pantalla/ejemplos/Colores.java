/**
 * Muestra varias palabras en el color que corresponde
 * 
 * @author Sergio Sánchez
 */

public class Colores {
  public static void main(String[] args) {
    System.out.print("\033[30m carbón");
    System.out.print("\033[31m tomate");
    System.out.print("\033[32m hierba");
    System.out.print("\033[33m mandarina");
    System.out.print("\033[34m mar");
    System.out.print("\033[35m nazareno");
    System.out.print("\033[37m sábanas");
    System.out.println("\033[36m cielo");

    //En negrita ahora
    System.out.print("\033[1;30m carbón");
    System.out.print("\033[1;31m tomate");
    System.out.print("\033[1;32m hierba");
    System.out.print("\033[1;33m mandarina");
    System.out.print("\033[1;34m mar");
    System.out.print("\033[1;35m nazareno");
    System.out.print("\033[1;37m sábanas");
    System.out.print("\033[1;36m cielo");

    //Reseteamos
    // System.out.println("\033[0m");
  }
}
