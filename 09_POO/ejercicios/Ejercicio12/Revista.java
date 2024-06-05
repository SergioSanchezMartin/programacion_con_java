public class Revista extends Publicacion {

  //Atributos
  private int numero;

  //Constructor
  public Revista(String isbn, String titulo, int anio, int numero) {
    super(isbn, titulo, anio);
    this.numero = numero;
  }

  //No tenemos que sobrecargar el método toString porque vamos a usar el del padre
  //Como lo heredamos, no es necesario hacer nada más.

}
