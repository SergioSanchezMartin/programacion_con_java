/**
 * Tema 5 - Bucles
 * 
 * Escribe un programa que lea un número por pantalla e imprima un gráfico de barras horizontal (el número tiene que ser mayor que 0)
 * Este gráfico podrá imprimirse de forma simple o en color.
 * 
 * @author Sergio Sánchez
 */

public class T05Histograma {
  public static void main(String[] args) {
    int cifraIntroducida = 0;    //Almaceno la cifra introducida
    long numeroCompleto = 0;    //El numero que se forma al finalizar la inclusión de todas las cifras
    long numeroVolteado = 0;
    int digito = 0;             //Lee el digito
    int digitoMayor = 0;        //Almacena el digito mayor conforme leo el numero completo
    int numeroDigitos = 0;      //Almacena el numero total de digitos introducidos

    System.out.println("Introduzca números entre 0 y 9 y pulsa INTRO. Introduce un número negativo si desea parar.");
    
    // while (cifraIntroducida >= 0) {
    //   cifraIntroducida = Integer.parseInt(System.console().readLine());
    //   if (cifraIntroducida >= 0 && cifraIntroducida <=9) {
    //     numeroCompleto = (numeroCompleto * 10) + cifraIntroducida;
    //   }
    // }
    do {
      cifraIntroducida = Integer.parseInt(System.console().readLine());
      if (cifraIntroducida >= 0 && cifraIntroducida <=9) {
        numeroCompleto = (numeroCompleto * 10) + cifraIntroducida;
      }
    } while (cifraIntroducida >= 0);

    //Le damos la vuelta al número y además vamos a ver cuál es el dígito mayor
    while (numeroCompleto > 0) {
      digito = (int) (numeroCompleto % 10);
      if (digito > digitoMayor) {
        digitoMayor = digito;
      }
      numeroVolteado = (numeroVolteado * 10) + digito;
      numeroCompleto /= 10;
      numeroDigitos++;
    }

    //Empezamos a mostrarlo en forma de tabla, teniendo en cuenta que hay que pintar digitoMayor + 1 columnas y numeroDigitos filas.
    int numeroColumnas = digitoMayor + 1;
    int numeroFilas = numeroDigitos;

    //Pintamos la primera hilera de guiones
    for (int i = 1; i <= numeroColumnas; i++) {
      System.out.print(" ---");
    }

    //Empezamos a pintar las filas
    for (int i = 1; i <= numeroFilas; i++) {
      System.out.println();
      digito = (int) (numeroVolteado % 10);         //Cojo el digito menos significativo del numeroVolteado
      numeroVolteado/=10;
      System.out.print("| " + digito + " |");       //Pintamos la 1ª columna, la de los dígitos introducidos

      //Pintamos tantas columnas con asterisco como indique el digito
      for (int j = 1; j <= digito; j++) {
        System.out.print(" * |");
      }
      
      //Pintamos el resto de columnas sin asterisco
      for (int j = 1; j <= numeroColumnas - digito - 1; j++) {
        System.out.print("   |");
      }
      System.out.println();

      for (int j = 1; j <= numeroColumnas; j++) {
        System.out.print(" ---");
      }
      
    }

  }  
}
