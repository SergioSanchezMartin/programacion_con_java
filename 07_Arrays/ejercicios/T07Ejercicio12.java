public class T07Ejercicio12 {
  public static void main(String[] args) {
    int[] original = new int[10];
    int[] copia = new int[10];
    int nInicial;
    int nFinal;
    boolean continuar;

    for (int i = 0; i < original.length; i++) {
      System.out.print("introduzca un número: ");
      original[i] = Integer.parseInt(System.console().readLine());
    }

    System.out.println("Array original:");
    System.out.print("Índice ");
    for (int i = 0; i < original.length; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < original.length; i++) {
      System.out.printf("%4d", original[i]);
    }
    System.out.println();
    do {
      continuar = true;
      System.out.print("Introduce un número inicial (0-9): ");
      nInicial = Integer.parseInt(System.console().readLine());

      System.out.print("Introduce un número final (0-9): ");
      nFinal = Integer.parseInt(System.console().readLine());

      if (nFinal <= nInicial) {
        System.out.println("Incorrecto. El numero inicial debe ser inferior o igual");
        continuar = false;
      }

      if ((nFinal<0) || (nFinal>9) || (nInicial<0) || (nInicial>9)){
        System.out.println("ERROR. Debes introducir un número (0-9)");
        continuar = false;
      }
    } while (!continuar);

    //Copio el array
    for (int i = 0; i < copia.length; i++) {
      copia[i] = original[i];
    }

    copia[nFinal] = original[nInicial];

    //Copiamos valores desde la posicion siguiente de nFinal
    for (int i = nFinal + 1; i < copia.length; i++) {
      copia[i] = original[i-1];
    }

    copia[0] = original[(original.length-1)];

    //Copiamos valores desde la primera posición del original hasta nInicial
    //(Original 1ª -> Copia 2ª) 
    for (int i = 0; i < nInicial; i++) {
      copia[i+1] = original[i];
    }

    System.out.println("Array final:");
    System.out.print("Índice ");
    for (int i = 0; i < copia.length; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < copia.length; i++) {
      System.out.printf("%4d", copia[i]);
    }

  }
}
