public class ArrayBi01 {
  public static void main(String[] args) throws InterruptedException {
    int[][] n = new int[3][2];    //Array de 3 filas x 2 columnas
    n[0][0] = 20;   //1ª fila 1ª columna
    n[1][0] = 67;   //2ª fila 1ª columna
    n[1][1] = 33;   //2ª fila 2ª columna
    n[2][1] = 7;    //3ª fila 2ª columna

    System.out.println("número de filas: " + n.length);
    System.out.println("número de columnas: " + n[0].length);
    for (int fila = 0; fila < n.length; fila++) {
      for (int columna = 0; columna < n[fila].length; columna++) {
        System.out.printf("%10d ", n[fila][columna]);
        Thread.sleep(1000); // retardo de un segundo
      }
      System.out.println();
    }
  }
}
