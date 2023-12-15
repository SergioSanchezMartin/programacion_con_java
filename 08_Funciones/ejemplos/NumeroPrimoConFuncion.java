/**
 * Explica tu código aquí
 * 
 * @author Sergio Sánchez
 */
public class NumeroPrimoConFuncion {
  
  ////Funciones definidas por el usuario

  /**
   * Comprueba si un número entero positivo es primo o no.
   * Un número es primo cuando únicamente es divisible entre
   * él mismo y la unidad.
   * 
   * @param x un número entero positivo
   * @return boolean <code>true</code> si el número es primo o <code>false</code> en caso contrario
   */
  public static boolean esPrimo(int x) { 
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }     
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Introduce un numero entero postivo: ");
    int n = Integer.parseInt(System.console().readLine());
    
    if (esPrimo(n)) {
      System.out.println("El numero " + n + " es primo.");
    } else {
      System.out.println("El numero " + n + " no es primo.");
    }
  }
}
