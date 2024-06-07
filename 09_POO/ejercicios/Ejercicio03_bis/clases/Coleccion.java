package clases;

public class Coleccion {

  //Atributos
  private final int TOTAL = 5;

  private int ultimo;   //índice que marca una posición vacía
  private Disco[] coleccion;

  //Constructor
  public Coleccion() {
    this.coleccion = new Disco[TOTAL];
    this.ultimo = 0;
  }

  public boolean esLlena() {
    return this.ultimo == TOTAL;
  }

  public boolean esVacia() {
    return this.ultimo == 0;
  }

  private int buscarPosicionDisco(String codigo) {

    int i = 0;
    boolean encontrado = false;

    while ((i < TOTAL) && (!encontrado)) {
      if((this.coleccion[i] != null) && 
         (this.coleccion[i].getCodigo().equals(codigo))) {
            encontrado = true;
         } else {
            i++;
         }
    } //while

    return i;
  }


  /**
   * Guarda el Disco pasado por parámetro en la posición marcada por ultimo 
   * y busca nueva posición para el índice ultimo
   * @param d - Disco
   */
  public void guardar(Disco d) {

    this.coleccion[this.ultimo] = d;

    //buscamos nueva posición vacía para el índice ultimo
    this.ultimo = -1;
    do {
      this.ultimo++;
    } while ((this.ultimo < TOTAL) && (this.coleccion[this.ultimo] != null));
  }


  public void borrar(String codigo) {
    
    int posicion = buscarPosicionDisco(codigo);

    if (posicion < TOTAL) {
      this.coleccion[posicion] = null;

      //Recolocamos el índice ultimo si es necesario
      if (esLlena()) { this.ultimo = posicion; }
    }
  }

  public void listar() {
    for (int i = 0; i < TOTAL; i++) {
      if (this.coleccion[i] != null) {
        System.out.println(this.coleccion[i]);
      }
    }
  }

  public Disco buscar(String codigo) {
    
    int posicion = buscarPosicionDisco(codigo); 
    // Disco d;
    // if (posicion < TOTAL) {
    //   d = this.coleccion[posicion];
    // } else {
    //   d = null;
    // }
    // return d;
    return (posicion < TOTAL) ? this.coleccion[posicion] : null; 
  }
}
