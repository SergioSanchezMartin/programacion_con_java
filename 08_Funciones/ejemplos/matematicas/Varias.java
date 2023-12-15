package matematicas;

/**
 * Funciones matemáticas de propósito general
 * 
 * @author Sergio Sánchez
 */
public class Varias {

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

  /**
   * Devuelve el número de dígitos que contiene un número entero
   * 
   * @param x un número entero
   * @return int la cantidad de dígitos que contiene el número
   */
  public static int digitos(int x) {
    
    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }

  /** 
   * Voltear un número introducido por teclado
   * @param x un número de tipo long
   * @return long el número volteado
   */
  public static long voltea(long x) {
    if (x < 0) {
      return -voltea(-x);
    }

    long numeroVolteado = 0;
    while (x > 0) {
      numeroVolteado = (numeroVolteado * 10) + (x % 10);
      x /= 10;
    }

    return numeroVolteado;
  }

  
  /** 
   * Voltear un número introducido por teclado, llamando a la función original que devuelve un long
   * @param x Un número entero
   * @return int casteando el resultado de llamar a la funcion long voltea()
   */
  public static int voltea(int x){
    return (int)voltea((long)x);
  }

  public static boolean esCapicua(long x){
   return x == voltea(x);
  }

  public static boolean esCapicua(int x){
    return esCapicua((long)x);
  }

  public static int siguientePrimo(int x){
    do {
      x++;
    } while (!esPrimo(x));
    return x;
  }

  public static int sumaDivisoresPropios (int x){
    int suma = 0;
    for (int i = 1; i < x; i++) {
      if (x % i == 0) {
        suma += i;
      }
    }
    return suma;
  }

  public static boolean numerosAmigos (int x, int y){
    if (x == sumaDivisoresPropios(y) && y == sumaDivisoresPropios(x)) {
      return true;
    }
    return false;
  }
}