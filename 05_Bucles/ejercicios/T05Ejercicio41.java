/**
 * Tema 5 - Bucles
 *
 * 41. Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * 
 * @author Sergio Sánchez
 */
public class T05Ejercicio41 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    int digitosPares = 0;
    int digitosImpares = 0;
    int digito;

    long copiaNumero = numeroIntroducido;     //Hacemos una copia del número introducido para manipularlo
    
    while (copiaNumero > 0) {
      digito =  (int) (copiaNumero % 10);     //Obtenemos el digito de las unidades, decenas, centenas...del resto de dividir por 10
      if (digito != 0) {                      //Si el dígito es un 0, no lo contamos ni como par ni como impar
        if (digito % 2 == 0) {
          digitosPares++;
        } else {
          digitosImpares++;
        }
      }
      copiaNumero /= 10;      //Buscamos la siguiente cifra
    }
    System.out.println("El " + numeroIntroducido + " contiene " + digitosPares + " dígitos pares y " + digitosImpares + " impares.");
  }
}
