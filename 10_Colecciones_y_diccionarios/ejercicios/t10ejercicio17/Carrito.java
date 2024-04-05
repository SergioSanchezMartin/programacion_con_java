package t10ejercicio17;

import java.util.ArrayList;

public class Carrito {

  private ArrayList<Elemento> cesta = new ArrayList<Elemento>();

  public void agrega(Elemento e) {
    cesta.add(e);
  }

  public int numeroDeElementos() {
    return cesta.size();
  }

  public double importeTotal() {
    double total = 0;

    for (Elemento e : cesta) {
      total += e.getCantidad() * e.getPrecio();
    }
    return total;
  }

  @Override
  public String toString() {
    String respuesta;
    respuesta = "Contenido del carrito\n"
              + "=====================\n";
    for (Elemento e : cesta) {
      respuesta += e + "\n";
    }
    return respuesta;
  }

  

}
