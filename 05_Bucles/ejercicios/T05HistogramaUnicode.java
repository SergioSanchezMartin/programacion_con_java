/**
 * Tema 5 - Bucles
 * 
 * Escribe un programa que lea un número por pantalla e imprima un gráfico de barras horizontal (el número tiene que ser mayor que 0)
 * Este gráfico podrá imprimirse de forma simple o en color.
 * 
 * @author Sergio Sánchez
 */

public class T05HistogramaUnicode {
  public static final String RESET = "\033[0m";
  public static final String RED_BACKGROUND = "\033[41m";
  public static final String GREEN_BACKGROUND = "\033[42m";
  public static final String BLUE_BACKGROUND = "\033[44m";
  public static final String PURPLE_BACKGROUND = "\033[45m";
  public static final String WHITE_BLACKGROUND = "\033[47m";      //Color blanco
  public static void main(String[] args) {
    int cifraIntroducida = 0;
    long numeroCompleto = 0;
    long numeroVolteado = 0;
    int digito = 0;
    int numeroDigitos = 0;
    int digitoMayor = 0;
    int respuestaColor;
    String color;
  
    System.out.println("Introduzca números entre 0 y 9 y pulsa INTRO. Introduce un número negativo si desea parar.");
    do {
      cifraIntroducida = Integer.parseInt(System.console().readLine());
      if (cifraIntroducida >= 0) {
        numeroCompleto = (numeroCompleto * 10) + cifraIntroducida; 
      }
    } while (cifraIntroducida >= 0 && cifraIntroducida <= 9);

    do {
      System.out.println("1. ROJO");
      System.out.println("2. VERDE");
      System.out.println("3. AZUL");
      System.out.println("4. VIOLETA");
      System.out.println("0. SIN COLOR");
      System.out.print("Escoja color: ");
      respuestaColor = Integer.parseInt(System.console().readLine());
    } while (respuestaColor < 0 || respuestaColor > 4);
    
    switch (respuestaColor) {
      case 1:
        color = RED_BACKGROUND;
        break;
      case 2:
        color = GREEN_BACKGROUND;
        break;
      case 3:
        color = BLUE_BACKGROUND;
        break;
      case 4:
        color = PURPLE_BACKGROUND;
        break;
      default:
        color = WHITE_BLACKGROUND;
        break;
    }

    //Le damos la vuelta al número y además actualizamos cuál es el dígito mayor
    while (numeroCompleto > 0) {
      digito = (int) (numeroCompleto % 10);
      if (digito > digitoMayor) {
        digitoMayor = digito;
      }
      numeroVolteado = digito + (numeroVolteado * 10);
      numeroCompleto /= 10;
      numeroDigitos++;
    }

    //Empezamos a mostrarlo en forma de tabla, teniendo en cuenta que hay que pintar digitoMayor + 1 columnas
    int numeroColumnas = digitoMayor + 1;
    int numeroFilas = numeroDigitos;
    
    //Pintamos la primera fila.
    System.out.print("\u2554\u2550\u2550\u2550\u2566");   //Primera columna
    for (int j = 1; j <= numeroColumnas-2; j++) {         //Resto de columnas
        System.out.print("\u2550\u2550\u2550\u2566");
    }
    System.out.println("\u2550\u2550\u2550\u2557");       //Última columna

    //Empezamos a pintar el resto de filas con los números incluidos
    for (int i = 1; i <= numeroFilas; i++) {
      digito = (int) (numeroVolteado % 10);
      numeroVolteado /= 10;
      
      //Pintamos 1ª columna
      System.out.print("\u2551 " + digito + " \u2551");     
      
      //PINTAMOS CON ASTERICOS tantas columnas como indique el digito
      for (int j = 1; j <= digito; j++) {
        System.out.print(color + "   " + RESET + "\u2551");                 
      }

      //Del total de columnas, ya se han pintado digito + 1 columnas con asterisco
      //Por tanto, quedan por PINTAR EN BLANCO numeroColumnas - digito - 1 columnas
      for (int j = 1; j <= numeroColumnas - digito - 1; j++) {
        System.out.print("   \u2551");
      }

      //Salto de línea -> Fila siguiente
      System.out.println("");       
      
      //Pintamos la parte inferior de cada fila, teniendo en cuenta que la última fila es diferente del resto
      if (i < numeroFilas) {
        System.out.print("\u2560\u2550\u2550\u2550\u256C");    //Primera columna
        for(int j=1; j<=numeroColumnas-2;j++){                
          System.out.print("\u2550\u2550\u2550\u256C");       //Resto de columnas
        }
        System.out.println("\u2550\u2550\u2550\u2563");       //Última columna
      } else {    //Última fila
        System.out.print("\u255A\u2550\u2550\u2550\u2569");   //Primera columna
        for(int j=1; j<=numeroColumnas-2;j++)
          System.out.print("\u2550\u2550\u2550\u2569");       //Resto de columnas
        System.out.print("\u2550\u2550\u2550\u255D");         //Última columna
      }
    }
  }
}