import java.util.ArrayList;

/**
 * Modificar un elemento de un ArrayList de String e imprimir la lista completa:
 * método set, y println(nombreArrayList)
 * 
 * @author Sergio Sánchez
 */
public class EjemploArrayList04 {
  public static void main(String[] args) {

    ArrayList<String> a = new ArrayList<String>();

    a.add("rojo");
    a.add("verde");
    a.add("azul");
    a.add("blanco");
    a.add("amarillo");

    System.out.println("Contenido del vector: ");

    System.out.println(a);

    a.set(2, "turquesa");  

    System.out.println("Contenido del vector después de machacar la posición 2: ");

    System.out.println(a);
  }
}
