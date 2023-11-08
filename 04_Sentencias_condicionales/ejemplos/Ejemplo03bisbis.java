/**
 * Uso de la sentencia switch
 * 
 * @author Sergio Sánchez
 */

 import java.util.Scanner;

public class Ejemplo03bisbis {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dia;

    System.out.print("Introduce el día de la semana: ");
    dia = sc.nextInt();

    switch (dia) {
      case 1:
      case 2:
      case 3:
      case 4:      
      case 5:
        System.out.println("Es un día entre semana");
        break;
      case 6:
      case 7:
        System.out.println("Es fin de semana");
        break;
      
      default:
        System.out.println("** Error: no se corresponde con ningún día de semana");
        break;
    }

    sc.close();
  }
}