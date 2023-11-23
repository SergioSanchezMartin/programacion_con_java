/**
 * Tema 5 - Bucles
 *
 * 34. Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando los
 * dígitos de la siguiente manera: primer dígito del primer número, primer dígito
 * del segundo número, segundo dígito del primer número, segundo dígito del
 * segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
 * podemos suponer que el usuario introducirá dos números de la misma longitud
 * y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
 * int donde sea necesario para admitir números largos.
 * 
 * @author Sergio Sánchez
 */
public class T05Ejercicio34 {
  public static void main(String[] args) {
    long numeroVolteado1 = 0;
    long numeroVolteado2 = 0;
    int longitud = 0;

    System.out.print("Por favor, introduzca un número: ");
    long numeroIntroducido1 = Long.parseLong(System.console().readLine());

    System.out.print("Introduzca otro número: ");
    long numeroIntroducido2 = Long.parseLong(System.console().readLine());
    
    //Volteamos el primer numero
    while (numeroIntroducido1 > 0) {
      numeroVolteado1 = (numeroVolteado1 * 10) + (numeroIntroducido1 % 10);
      numeroIntroducido1 /= 10;
      longitud++;
    }

    //Volteamos el segundo numero    
    while (numeroIntroducido2 > 0) {
      numeroVolteado2 = (numeroVolteado2 * 10) + (numeroIntroducido2 % 10);
      numeroIntroducido2 /= 10;
    }

    // Recorre los dos números volteados para formar los dos resultados ////////
    long resultadoPares = 0;
    long resultadoImpares = 0;
    int digito;
    
    for (int i = 0; i < longitud; i++) {

      digito = (int)(numeroVolteado1 % 10);

      if ((digito % 2) == 0) {
        resultadoPares = resultadoPares * 10 + digito;
      } else {
        resultadoImpares = resultadoImpares * 10 + digito;
      }

      digito = (int)(numeroVolteado2 % 10);

      if ((digito % 2) == 0) {
        resultadoPares = resultadoPares * 10 + digito;
      } else {
        resultadoImpares = resultadoImpares * 10 + digito;
      }

      numeroVolteado1 /= 10;
      numeroVolteado2 /= 10;
    }
    
    // Muestra el resultado
    System.out.println("El número formado por los dígitos pares es: " + resultadoPares);
    System.out.println("El número formado por los dígitos impares es: " + resultadoImpares);
  }
}
