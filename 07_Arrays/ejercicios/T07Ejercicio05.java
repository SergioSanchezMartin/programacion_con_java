public class T07Ejercicio05 {
  public static void main(String[] args) {
    
    int[] numero = new int[10];
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;

    System.out.println("Introduzca número enteros y pulse INTRO: ");

    for (int i = 0; i < numero.length; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());

      if (numero[i] > maximo) {
        maximo = numero[i];
      }

      if (numero[i] < minimo) {
        minimo = numero[i];
      }
    }

    System.out.println("Tus números son: ");
    for (int i = 0; i < numero.length; i++) {
      System.out.print(numero[i] + " ");
      if (numero[i] == maximo) {
        System.out.print(" máximo");
      }

      if (numero[i] == minimo) {
        System.out.print(" mínimo");
      }
      System.out.println();
    }

  }
}
