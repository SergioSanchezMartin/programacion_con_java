import java.util.ArrayList;

/**
 * Ejemplo de uso de la clase ArrayList para recorrer y mostrar los 
 * elementos de la colección al estilo foreach
 * 
 * @author Sergio Sánchez
 */
public class EjemploArrayList021 {
  public static void main(String[] args) {

    ArrayList<String> a = new ArrayList<String>();

    a.add("rojo");
    a.add("verde");
    a.add("azul");
    a.add("blanco");
    a.add("amarillo");

    System.out.println("Contenido de la lista: ");


    for(String color: a) {          //Saca uno a uno todos los elementos de a y ve metiéndolos en una variable de nombre color
      System.out.println(color);    //Muestra por pantalla el contenido de la variable color
    }
  }
}
