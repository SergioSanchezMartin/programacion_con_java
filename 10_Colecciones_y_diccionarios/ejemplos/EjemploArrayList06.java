import java.util.ArrayList;

/**
 * Borrado de elementos que cumplen una determinada condición dado un predicado:
 * método removeIf().
 * 
 * @author Sergio Sánchez
 */
public class EjemploArrayList06 {
  public static void main(String[] args) {

    ArrayList<String> a = new ArrayList<String>();

    a.add("rojo");
    a.add("verde");
    a.add("azul");
    a.add("blanco");
    a.add("amarillo");

    System.out.println("Contenido de la lista: ");
    System.out.println(a);

    a.removeIf(palabra -> palabra.contains("o"));

    System.out.println("Contenido de la lista después de borrar las palabras que contienen la letra \"o\": ");
    System.out.println(a);

    a.removeIf(palabra -> palabra.contains("az"));

    System.out.println("Contenido de la lista después de borrar las palabras que contienen las letras \"az\": ");
    System.out.println(a);

  }
}
