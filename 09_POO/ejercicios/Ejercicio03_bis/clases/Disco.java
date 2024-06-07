package clases;

public class Disco {
  
  private String codigo;
  private String titulo;
  private String autor;
  private String genero;
  private int duracion;
  
  /**
   * @param codigo
   * @param titulo
   * @param autor
   * @param genero
   * @param duracion
   */
  public Disco(String codigo, String titulo, String autor, String genero, int duracion) {
    this.codigo = codigo;
    this.titulo = titulo;
    this.autor  = autor;
    this.genero = genero;
    this.duracion = duracion;    
  }


  /**
   * @return
   */
  public String getCodigo(){
    return this.codigo;
  }

  
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }


  public void setAutor(String autor) {
    this.autor = autor;
  }


  public void setGenero(String genero) {
    this.genero = genero;
  }


  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }


  @Override
  public String toString() {
    return "Código: " + this.codigo + "\n" +
           "Autor: " + this.autor + "\n" +  
           "Título: " + this.titulo + "\n" + 
           "Género: " + this.genero + "\n" + 
           "Duración: " + this.duracion + "\n" + 
           "------------------------------------------------------" ;
  }

}
