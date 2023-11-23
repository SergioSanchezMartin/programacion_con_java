/**
 * Tema 5 - Bucles
 *
 * 37. Realiza un conversor del sistema decimal al sistema de “palotes”.
 * 
 * @author Sergio Sánchez
 */

public class T05Ejercicio37 {
  public static void main (String[] args) {
    int numeroIntroducido;
    do {
      System.out.print("Introduce un número entero positivo: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
    } while (numeroIntroducido < 1);
    System.out.print(numeroIntroducido + " = ");
    
    // Cuenta los números y calcula el reves
    int numeroDigitos = 0;
    int numeroVolteado = 0;
    while (numeroIntroducido > 0){
      numeroVolteado = ((numeroVolteado*10) + (numeroIntroducido % 10));
      numeroIntroducido /= 10;
      numeroDigitos++;
    }
    int digito = 0;

    // Separa las cifras y escribe los palitos
    for (int i = 0; i < numeroDigitos; i++){
      digito = numeroVolteado%10;
      numeroVolteado /= 10;
      for (int j = 0; j < digito; j++){
        System.out.print("|");
      }
      //Mientras no sea la ultima cifra, pintamos el guion separador
      if (i < numeroDigitos - 1){
        System.out.print("-");
      }
    }
  }
}
