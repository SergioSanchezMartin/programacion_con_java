import colors.ConsoleColors;

/**
 * Muestra varias palabras en el color que corresponde
 * 
 * @author Sergio Sánchez
 */

public class Colores {
  public static void main(String[] args) {
    System.out.print("\033[33m mandarina");
    System.out.print("\033[32m hierba");
    System.out.print("\033[31m tomate");
    System.out.print("\033[37m sábanas");
    System.out.print("\033[36m cielo");
    System.out.print("\033[35m nazareno");
    System.out.print("\033[30m carbón");
    System.out.print("\033[34m mar");

    //Reseteamos
    System.out.println(ConsoleColors.RESET);
  }
}
