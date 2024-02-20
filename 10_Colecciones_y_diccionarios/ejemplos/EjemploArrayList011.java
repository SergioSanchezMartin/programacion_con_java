import java.util.ArrayList;

/**
 * Ejemplo de uso de la clase ArrayList de Integer: métodos size, add y get
 * Uso del wrapper de int --> Integer
 * 
 * @author Sergio Sánchez
 */
public class EjemploArrayList011 {
  public static void main(String[] args) {

    ArrayList<Integer> a = new ArrayList<Integer>();    //No se usa int sino su wrapper: Integer 

    a.add(18);
    a.add(22);
    a.add(-30);

    System.out.println("Nº de elementos: " + a.size());        

    System.out.println("El elemento que hay en la posición 1 es " + a.get(1));
  }
}
