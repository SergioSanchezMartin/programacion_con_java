import java.util.Scanner;

/**
 * Ejemplo de bucle while - Contador de números positivos introducidos por teclado
 * 
 * @author Sergio Sánchez
 */
public class EjemploWhile02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeroIntroducido = 0;  //Variable que controle la salida del bucle
    int cuentaNumeros = 0;   //Variable contadora de números positivos introducidos
    int suma = 0;           //Variable acumuladora de los números positivos introducidos

    System.out.println("Por favor, introduce números enteros positivos");
    System.out.println("El programa finalizará cuando se introduzca un número negativo.");

    while (numeroIntroducido >= 0) {
      System.out.print("Número: ");
      numeroIntroducido = sc.nextInt();
      if (numeroIntroducido > 0) {
        cuentaNumeros++;
        suma += numeroIntroducido;        //suma = suma + numeroIntroducido        
      }
    }
    
    sc.close();
    System.out.println("La cantidad de números positivos introducidos es " + cuentaNumeros);
    System.out.println("La suma total de ellos es " + (suma));
  }
}
