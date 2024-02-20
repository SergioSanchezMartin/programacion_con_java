import java.util.ArrayList;

/**
 * Borrado de elementos tipo Integer que cumplen una determinada condición dado un predicado:
 * método removeIf().
 * 
 * @author Sergio Sánchez
 */
public class EjemploArrayList061 {
  public static void main(String[] args) {

    ArrayList<Integer> a = new ArrayList<Integer>();

    a.add(20);
    a.add(7);
    a.add(14);
    a.add(32);
    a.add(3);

    System.out.println("Contenido de la lista: ");
    System.out.println(a);

    a.removeIf(numero -> numero < 10);

    System.out.println("Contenido de la lista después de borrar los menores de 10: ");
    System.out.println(a);

  }
}
