public class T03Ejercicio08 {
  public static void main(String[] args) {
    System.out.print("Introduce el numero de horas trabajadas: ");
    String linea;
    linea = System.console().readLine();
    int horasTrabajadas = Integer.parseInt(linea);
    System.out.println("Su salario semanal es de " + (horasTrabajadas*12) + " €");
  }
}
