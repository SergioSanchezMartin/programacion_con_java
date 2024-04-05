package t10ejercicio18;

import java.util.ArrayList;

public class Carrito {

  private ArrayList<Elemento> cesta = new ArrayList<Elemento>();

  public void agrega(Elemento e) {
    // boolean duplicado = false;

    // for (Elemento articulo : cesta) {
    //   if (cesta.contains(e)) {
    //     articulo.setCantidad(articulo.getCantidad() + e.getCantidad());
    //     duplicado = true;
    //     break;
    //   }
    // }
    // if (!duplicado) {
    //   cesta.add(e);
    // }

    if (cesta.contains(e)) {
      int posicion = cesta.indexOf(e);
      cesta.get(posicion).setCantidad(cesta.get(posicion).getCantidad() + e.getCantidad());
    } else {
      cesta.add(e);
    }
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
