public class Quiniela {
  
  public static int aleatorio1X2() {
    return (int)(Math.random()*3);
  }

  public static int aleatorioPlenoAl15() {
    return (int)(Math.random()*4);
  }
  public static void main(String[] args) {
    int[][] apuestas = new int[14][3];
    int[] resultadoPartido = new int[14];
    int[] apuesta15 = new int[2];
    int[] partido15 = new int[2];
    int[] aciertos = new int[3];

    for (int i = 0; i < resultadoPartido.length; i++) {
      resultadoPartido[i] = aleatorio1X2();
      for (int j = 0; j < apuestas[i].length; j++) {
        apuestas [i][j] = aleatorio1X2();
        if (apuestas[i][j] == resultadoPartido[i]) {
          aciertos[j]++;
        }
      }
    }
    
    for (int i = 0; i < 2; i++){
      apuesta15[i] = aleatorioPlenoAl15();
      partido15[i] = aleatorioPlenoAl15();
    }

    if (apuesta15[0] == partido15 [0] && apuesta15[1] == partido15[1]) {
      aciertos[0]++;
      aciertos[1]++;
      aciertos[2]++;
    }

    System.out.printf("    %8s    | %s", "APUESTAS", "RESULTADO\n");
    System.out.println("============================");

    for (int i = 0; i < 15; i++) {
      if (i != 14) {
        System.out.printf("%2d. |", i+1);
        for (int j = 0; j < apuestas[0].length; j++) {
          switch (apuestas[i][j]) {
            case 0:
              System.out.printf(" X |");
              break;
            case 1:
              System.out.printf("1  |");
              break;
            case 2:
              System.out.printf("  2|");
            default:
              break;
          }  
        }
        System.out.printf(" \033[0;1m%s \033[0m", resultadoPartido[i] == 0 ? "X" : resultadoPartido[i]);
      } else {
        System.out.println("============================");
        System.out.printf("%2d. |", i+1);
        System.out.printf(" Local  %s  Visitante  %s", partido15[0] == 3 ? "M" : partido15[0], partido15[1] == 3 ? "M" : partido15[1]);
        //Para comprobar
        System.out.printf("\n Local  %s  Visitante  %s", apuesta15[0] == 3 ? "M" : apuesta15[0], apuesta15[1] == 3 ? "M" : apuesta15[1]);
      }
      System.out.println();
    }
    System.out.println("\nAciertos apuesta 1: " + aciertos[0]);
    System.out.println("Aciertos apuesta 2: " + aciertos[1]);
    System.out.println("Aciertos apuesta 3: " + aciertos[2]);
  }
}