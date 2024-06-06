package clases;

public class Coleccion {

  //Atributos
  private final int TOTAL = 5;

  private int ultimo;   //Marca la posición del ultimo guardado
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

  public void borrar(String codigo) {
    
    int posicion = buscarPosicionDisco(codigo);

    if (posicion < TOTAL) {
      this.coleccion[posicion] = null;

      //Recolocamos el índice ultimo si es necesario
      if (this.ultimo == TOTAL) {
        this.ultimo = posicion;
      }
    }
    


  }

  public void listar() {
    for (int i = 0; i < this.ultimo; i++) {
      System.out.println(this.coleccion[i]);
    }
  }
  
}
