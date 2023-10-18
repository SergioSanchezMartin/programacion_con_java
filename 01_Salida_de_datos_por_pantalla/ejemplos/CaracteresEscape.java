/**
 * Salida formateada utilizando caracteres de escape (salto de línea, tabulaciones...)
 * 
 * @author Sergio Sánchez
 */
public class CaracteresEscape {
  public static void main(String[] args) {
    System.out.printf("Al final de esta línea se producirá un salto a la siguiente.\n") ;
    System.out.printf("\tComenzamos con una tabulación.\n") ;
    System.out.printf("Ahora escribimos comillas dobles: \"\".\n") ;
    System.out.printf("También la barra inclinada a la izquierda: \\.\n") ;
    System.out.print("Y las comillas simples: ") ;
    System.out.println('\'') ;
  }
}
