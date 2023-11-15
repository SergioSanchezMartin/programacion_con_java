/**
 * Tema 5 - Bucles
 *
 * 7. Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author Sergio Sánchez
 */
import java.util.Scanner;

public class T05Ejercicio07 {
  public static void main(String[] args) {
    int intentos = 4;
    int numeroIntroducido;
    int combinacionCorrecta = 1234;
    boolean acertado = false;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.print("Introduzca la clave de la caja fuerte: ");
      numeroIntroducido = sc.nextInt();
      intentos--;

      if (numeroIntroducido == combinacionCorrecta) {
        acertado = true;
      } else {
        System.out.println("Clave incorrecta. Le quedan " + intentos + " intentos.");
      }
    } while((intentos > 0) && (!acertado));    //!acertado  <-->  acertado == false
    
    sc.close();

    if (acertado) {
      System.out.println("Ha abierto la caja fuerte.");
    } else {
      System.out.println("Lo siento, no le quedan más intentos.");
    }
  }
}
