/**
 * * Minijuego "Busca el tesoro"
 * Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de
 * cuatro filas por cinco columnas. El usuario intentará averiguar dónde
 * está el tesoro.
 * 
 * @author Sergio Sánchez
 */

 public class BuscaTesoro {
 
  public static void main(String[] args) {
    //Constantes que representan las diferentes casillas
    final int VACIA = 0;
    final int TESORO = 1;
    final int MINA = 2;
    final int JUGADA = 3;
    int fila;
    int columna;

    //Tablero de 4 filas y 5 columnas
    int[][] tablero = new int[4][5];

    //Inicializamos el tablero con casillas VACIA
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        tablero[i][j] = VACIA;
      }
    }

    //Se coloca una casilla de TESORO de manera aleatoria en el tablero
    int tesoroFila = (int)(Math.random()*4);      //Numero aleatorio entero [0,4)
    int tesoroColumna = (int)(Math.random()*5);   //Numero aleatorio entero [0,5)
    tablero[tesoroFila][tesoroColumna] = TESORO;

    //Se coloca una casilla de MINA de manera aleatoria en el tablero
    //Pero no puede ser la misma casilla que la del TESORO
    int minaFila;
    int minaColumna;
    do {
      minaFila = (int)(Math.random()*4);      //Numero aleatorio entero [0,4)
      minaColumna = (int)(Math.random()*5);   //Numero aleatorio entero [0,5)
    } while ((tesoroFila == minaFila) && (tesoroColumna == minaColumna));
    tablero[minaFila][minaColumna] = MINA;

    //Iniciamos el juego
    System.out.println("JUEGO DEL TESORO");
    boolean salida = false;
    do {
      //Pintamos el tablero
      for (int i = tablero.length - 1; i >= 0; i--) {
        System.out.print(i + " |");
        for (int j = 0; j < tablero[i].length; j++) {
          if (tablero[i][j] == JUGADA) {
            System.out.printf("%2s","X");
          } else {
            System.out.printf("%2s"," ");
          }
        }
        System.out.println();     //Saltamos de linea para pintar la fila siguiente
      }
      System.out.print("   ");
      for (int i = 0; i < (3*tablero[0].length); i++) {
        System.out.print("-");
      }
      System.out.print("\n   ");
      for (int j = 0; j < tablero[0].length; j++) {
        System.out.printf("%2d ", j);
      }
      System.out.println();
      //Pido las coordenadas
      System.out.print("introduce fila: ");
      fila = Integer.parseInt(System.console().readLine());
      System.out.print("introduce columna: ");
      columna = Integer.parseInt(System.console().readLine());

      //Compruebo lo que hay en las coordenadas introducidas por el jugador
      switch (tablero[fila][columna]) {
        case VACIA:
          tablero[fila][columna] = JUGADA;
          break;
        case MINA:
          System.out.println("Lo siento, has perdido.");
          salida = true;
          break;
        case TESORO:
          System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
          salida = true;
          break;
        default:
      }
    } while (!salida);    //Si salimos del bucle do-while es porque toco mina o tesoro.

    //Pintamos el tablero final, una vez terminada la partida
    String c = "";
    for (int i = tablero.length - 1; i >= 0; i--) {
      System.out.print(i + " |");
      for (int j = 0; j < tablero[i].length; j++) {
        switch (tablero[i][j]) {
          case VACIA:
            c = " ";
            break;
          case MINA:
            c = "*";
            break;
          case TESORO:
            c = "$";
            break;
          case JUGADA:
            c = "X";
            break;
          default:
        }
        System.out.printf("%2s", c);
      }
      System.out.println();
    }
    System.out.print("   ");
    for (int i = 0; i < (3*tablero[0].length); i++) {
      System.out.print("-");
    }
    System.out.print("\n   ");
    for (int j = 0; j < tablero[0].length; j++) {
      System.out.printf("%2d ", j);
    }
  }
 }