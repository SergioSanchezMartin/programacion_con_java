/**
 * 3. Modifica el programa anterior de tal forma que los números que se introducen en
 * el array se generen de forma aleatoria (valores entre 100 y 999).
 * 
 * @author Sergio Sánchez
 */
/**
 * T07Ejercicio03_bidim
 */
public class T07Ejercicio03_bidim {
public static void main(String[] args) {
  int[][] tabla = new int[4][5];
  int fila;
  int columna;

  System.out.println("Número de filas = " + tabla.length);
  System.out.println("Número de columnas = " + tabla[0].length);

  //Rellenar el array
  for (fila = 0; fila < tabla.length; fila++) {
    for (columna = 0; columna < tabla[fila].length; columna++){
      tabla[fila][columna] = (int)(Math.random()*900 + 100);
    }
  }

  //Mostramos el array
  int sumaFila;
  for (fila = 0; fila < tabla.length; fila++) {
    sumaFila = 0;       //Reseteo valor fila
    for (columna = 0; columna < tabla[fila].length; columna++){
      System.out.printf("%8d",tabla[fila][columna]);
      sumaFila = sumaFila + tabla[fila][columna];     
    }
    System.out.printf("|%8d\n", sumaFila);      //Muestro la suma de la fila y salto de línea
  }

    // Muestra las sumas parciales de las columnas
    for(columna = 0; columna < 49; columna++) {
      System.out.print("-");
    }
    System.out.println();

    int sumaColumna;
    int sumaTotal = 0;

    for (columna = 0; columna < tabla[0].length; columna++) {
      sumaColumna = 0;    //reseteo valor de la columna
      for (fila = 0; fila < tabla.length; fila++) {
        sumaColumna += tabla[fila][columna];
      }
      System.out.printf("%8d", sumaColumna);      //Muestro la suma de la fila y salto de línea
      sumaTotal += sumaColumna;
    }

    System.out.printf("|%8d\n", sumaTotal);      

  }
  
}