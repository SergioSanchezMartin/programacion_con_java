public class Libro extends Publicacion implements Prestable {
  
  //Atributos
  // private boolean prestado = false;
  private boolean prestado;

  //Constructor
  public Libro(String isbn, String titulo, int year){
    super(isbn, titulo, year);
    this.prestado = false; 
  }

  @Override
  public void presta() {
    if (this.prestado) {
      System.out.println("Lo siento, ese libro ya está prestado.");
    } else {
      this.prestado = true;   //Si no está prestado, entonces lo presto
    }
  }

  @Override
  public void devuelve() {
    this.prestado = false;    //cambiamos de nuevo a false el atributo prestado
  }

  @Override
  public boolean estaPrestado() {
    return this.prestado;
  }

  //Llamo al toString del padre (Publicacion) y, además, añado el dato de si está prestado o no
  @Override
  public String toString() {
  //   String cadena;
  //   if (this.prestado) {
  //     cadena = " (prestado)";
  //   } else {
  //     cadena = " (no prestado)";
  //   }
  //   return super.toString() + cadena;
  // }
    return super.toString() + " (" + (this.prestado ? "prestado)" : "no prestado)");
  }

}
