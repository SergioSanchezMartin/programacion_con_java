/**
 * Tema 3 - Lectura de datos desde teclado
 *
 * 9. Escribe un programa que calcule el volumen de un cono según la fórmula
 * V = (1/3)πr^2h
 *
 * @author Sergio Sánchez
 */
public class T03Ejercicio09 {
  public static void main(String[] args) {
    // final double PI = Math.PI;   //Esto la convierte en una constante con el modificador final
    System.out.println("VOLUMEN DE UN CONO");
    System.out.println("--------------");
    System.out.print("Por favor, introduce un radio (cm): ");
    double r = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce una altura (cm): ");
    double h = Double.parseDouble(System.console().readLine());
    double volumen = (Math.PI*(Math.pow(r, 2))*h)/3;      //También se podría double volumen = (1.0/3.0)*(Math.PI*(Math.pow(r, 2))*h);
    System.out.printf("El volumen del cono es = %.2f cm3\n", volumen);
  }
}
