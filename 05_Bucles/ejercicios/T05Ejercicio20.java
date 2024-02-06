/**
 * Tema 5 - Bucles
 *
 * 20. Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 *  
 * @author Sergio Sánchez
 */
public class T05Ejercicio20 {
  public static void main(String[] args) {
    


    System.out.print("Introduzca el caracter de relleno: ");
    String caracter = System.console().readLine();

    System.out.print("Introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    int nivel = 1;    //Variable que controla en qué nivel estoy pintando, siendo 1 la cima de la pirámide
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosPorDentro = 0;

    //Pintamos toda la pirámide excepto la base
    while (nivel < alturaIntroducida) {
      
      //Pintamos los espacios por delante
      for (int i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      
      //Pintamos el caracter
      System.out.print(caracter);

      //Pintamos los espacios por dentro
      for (int i = 1; i < espaciosPorDentro; i++) {
        System.out.print(" ");
      }

      //Pintamos el segundo caracter de relleno, excepto en el nivel 1
      if (nivel > 1) {
        System.out.print(caracter);
      }

      //Saltamos de línea
      System.out.println();
      
      nivel++;    //Aumentamos un nivel en la pirámide
      espaciosPorDelante--;   //En cada nivel pintamos un espacio por delante menos
      espaciosPorDentro += 2;   //En cada nivel pintamos 2 huecos más
    }

    //Base de la pirámide
    for (int i = 1; i < alturaIntroducida * 2; i++) {
      System.out.print(caracter);
    }
  }
}
