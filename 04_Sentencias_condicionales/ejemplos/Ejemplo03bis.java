/**
 * Uso de la sentencia switch
 * 
 * @author Sergio Sánchez
 */

 import java.util.Scanner;

public class Ejemplo03bis {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dia;

    System.out.print("Introduce el día de la semana: ");
    dia = sc.nextInt();

    switch (dia) {
      case 1,2,3,4,5:
        System.out.println("Es un día entre semana");
        break;
      
      case 6,7:
        System.out.println("Es fin de semana");
        break;

      default:
        System.out.println("** Error: no se corresponde con ningún día de semana");
        break;     
    }
    sc.close();
  }
}
