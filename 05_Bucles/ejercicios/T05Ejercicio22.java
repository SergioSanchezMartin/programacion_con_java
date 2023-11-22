/**
 * Tema 5 - Bucles
 * 
 * 22. Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos
 * 
 * @author Sergio Sánchez
 */

public class T05Ejercicio22 {
  public static void main(String[] args) {
    boolean esPrimo = true;   //Comenzamos presuponiendo que será primo

    System.out.println("Números primos entre 2 y 100:");

    for (int num = 2; num <= 100; num++) {
      esPrimo = true;     //Comenzamos presuponiendo que cada num será primo

      //Vamos a comprobar si encontramos algún divisor iterando entre 2 y el número anterior a num
      for (int i = 2; i < num; i++) {
        if (num % i == 0) {
          esPrimo = false;
          break;      //En el momento que encontremos un divisor, podemos dejar de iterar
        }
      }

      // si num es primo, lo mostramos por pantalla
      if (esPrimo) {
        System.out.print(num + " ");
      }
    }
  }
}
