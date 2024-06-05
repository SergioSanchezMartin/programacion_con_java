public abstract class Publicacion {

  //Atributos
  private String isbn;
  private String titulo;
  private int anio;

  //Constructor
  public Publicacion(String isbn, String titulo, int year) {
    this.isbn   = isbn;
    this.titulo = titulo;
    this.anio   = year;
  }

  @Override
  public String toString() {
    return "ISBN: " + isbn + ", título: " + titulo + ", año de publicación: " + anio;
  }
}
