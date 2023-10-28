/**
 * Ejemplo primera lectura de datos (clase 27/10/2023)
 * 
 * @author Sergio Sánchez
 */

public class Ejemplo01 {
  public static void main(String[] args) {
    String nombre;
    System.out.print("Dime cómo te llamas: ");
    nombre = System.console().readLine();

    System.out.println("¡Hola " + nombre + "! Bienvenid@ a programación");

    String num1;
    String num2;
    System.out.print("introduce un numero: ");
    num1 = System.console().readLine();

    System.out.print("introduce un numero: ");
    num2 = System.console().readLine();

    System.out.println("El resultado = " + (num1 + num2));

  }
  
}