/**
 * Salida formateada utilizando distintos flags
 * 
 * @author Sergio Sánchez
 */
public class SalidaFormateada02 {
  public static void main(String[] args) {
    System.out.printf("%8d\n", 100) ;	// rellenará con 5 espacios a la izquierda
    System.out.printf("%08d\n", 100) ;	// rellena con 5 ceros a la izquierda
    System.out.printf("%+d\n", 100) ;	// muestra el signo del número
    System.out.printf("%-8d\n", 100) ;	// rellena con 5 espacios a la derecha
  }
}
