import java.util.Scanner;
public class T04Ejercicio22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in, "Windows-1252");     //Codificación Windows-1252 para que admita acentos
    final int MINUTOSTOTALES = (4 * 24 * 60) + (15 * 60);     //Calculamos minutos desde Lunes 00:00 hasta Viernes 15:00
    int diasTranscurridos = 0;

    System.out.print("Por favor, introduce un día de la semana (de lunes a viernes): ");
    String dia = sc.nextLine().toLowerCase();
    
    //Ver cuántos días han pasado desde lunes 00:00
    switch (dia) {
      case "lunes":
        diasTranscurridos = 0;
        break;
      
      case "martes":
        diasTranscurridos = 1;
        break;
      
      case "miércoles":
      case "miercoles":
        diasTranscurridos = 2;
        break;
      
      case "jueves":
        diasTranscurridos = 3;
        break;

      case "viernes":
        diasTranscurridos = 4;
        break;

      default:
        System.out.println("No has introducido un valor correcto");
        break;
    }
    System.out.print("Por favor, introduce una hora: ");
    int horas = sc.nextInt();
    System.out.print("Por favor, introduce los minutos: ");
    int minutos = sc.nextInt();
    sc.close();

    int minutosTranscurridos = (diasTranscurridos * 24 * 60) + (horas * 60) + minutos;
    System.out.println("Faltan " + (MINUTOSTOTALES - minutosTranscurridos) + " minutos para llegar al fin de semana");
  }
}
