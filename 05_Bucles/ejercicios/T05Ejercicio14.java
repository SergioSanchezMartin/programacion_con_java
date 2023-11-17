/**
 * 14. Escribe un programa que pida una base y un exponente y que calcule la potencia.
 * 
 * @author Sergio Sánchez
 */
public class T05Ejercicio14 {
  public static void main(String[] args) {
    double potencia = 1;
    System.out.println("Cálculo de una potencia");

    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());

    if (exponente == 0) {
      potencia = 1;
    } else if (exponente > 0) {
      for (int i = 1; i <= exponente; i++) {
        potencia *= base;
      }
    } else {
      for (int i = 1; i <= -exponente; i++) {
        potencia *= base;
      }
      potencia = 1 / potencia;
    }
    System.out.println(base + "^" + exponente + " = " + potencia);
  }
}
