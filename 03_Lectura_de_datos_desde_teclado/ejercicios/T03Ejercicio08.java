/**
 * Tema 3 - Lectura de datos desde teclado
 *
 * 8. Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
 *
 * @author Sergio Sánchez
 */
public class T03Ejercicio08 {
  public static void main(String[] args) {
    System.out.print("Introduce el numero de horas trabajadas: ");
    String linea;
    linea = System.console().readLine();
    int horasTrabajadas = Integer.parseInt(linea);
    System.out.println("Su salario semanal es de " + (horasTrabajadas*12) + " €");
  }
}
