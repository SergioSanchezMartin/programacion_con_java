/**
 * La clase que contendrá el método principal o main
 * 
 * @author Sergio Sánchez
 */
public class PruebaLibro {
  public static void main(String[] args) {
    // Libro lib = new Libro();
    // Libro miLibrito = new Libro();
    // Libro quijote = new Libro();

    // lib.titulo = "Atomka";
    // lib.autor = "Franck Thilliez";
    // lib.numeroPaginas = 490;
    // System.out.println("Titulo: " + lib.titulo);
    // System.out.println("Autor: " + lib.autor);
    // System.out.println("Número de páginas: " + lib.numeroPaginas);
    // System.out.println("Edición: " + lib.edicion);

    boolean[] numerosUsados = new boolean[5];
    for (int i = 0; i < numerosUsados.length; i++) {
      System.out.print(numerosUsados[i] + ", ");
    }
  }
}
