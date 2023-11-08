public class T03Ejercicio09 {
  public static void main(String[] args) {
    // final double PI = Math.PI;   //Esto la convierte en una constante con el modificador final
    System.out.println("VOLUMEN DE UN CONO");
    System.out.println("--------------");
    System.out.print("Por favor, introduce un radio (cm): ");
    double r = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce una altura (cm): ");
    double h = Double.parseDouble(System.console().readLine());
    double volumen = (Math.PI*(Math.pow(r, 2))*h)/3;
    System.out.printf("El volumen del cono es = %.2f cm3\n", volumen);
  }
}
