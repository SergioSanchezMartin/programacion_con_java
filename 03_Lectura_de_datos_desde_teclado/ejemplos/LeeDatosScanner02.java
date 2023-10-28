import java.util.Scanner;

/**
 * Lectura de datos por teclado usando Scanner y usando .next()
 * 
 * @author Sergio Sánchez
 */
public class LeeDatosScanner02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  //Creamos un objeto de la clase Scanner, llamado sc

    System.out.print("Introduce tu edad, nombre, apellidos (separados por un espacio): ");
    int edad = sc.nextInt();
    String nombre = sc.next();
    String apellido1 = sc.next();
    String apellido2 = sc.next();
    
    System.out.println("Edad: " + edad);
    System.out.println("Tu nombre es " + nombre);
    System.out.println("Apellido 1: " + apellido1);
    System.out.println("Apellido 2: " + apellido2); 
    
    sc.close();   //Para evitar el warning, cerramos el buffer
  }
}
