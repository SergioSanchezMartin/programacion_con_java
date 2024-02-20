import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Añadir elementos a un ArrayList en una posición ocupada por otro elemento: 
 * método add con índice.
 * 
 * @author Sergio Sánchez
 */
public class EjemploArrayList05 {
  public static void main(String[] args) {

    ArrayList<String> a = new ArrayList<String>();

    a.add("rojo");
    a.add("verde");
    a.add("azul");
    a.add("blanco");
    a.add("amarillo");

    System.out.println("Contenido de la lista: ");

    System.out.println(a);

    /**
     * Añadimos "turquesa" en la posición 1, ocupada por "verde", 
     * lo que provoca que los demás elementos se desplacen hacia la derecha
    */
    a.add(1, "turquesa");

    System.out.println("Contenido de la lista después de insertar en la posición 1: ");

    System.out.println(a);

    Collections.sort(a);

    System.out.println("\nLista ordenada:");
    for (String elemento: a) {
      System.out.println(elemento);
    }
  }
}
