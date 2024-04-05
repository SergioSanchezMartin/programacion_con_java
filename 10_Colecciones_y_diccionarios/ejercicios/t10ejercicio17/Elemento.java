package t10ejercicio17;

public class Elemento {
  private String producto;
  private double precio;
  private int cantidad;

  public Elemento(String producto, double precio, int cantidad) {
    this.producto = producto;
    this.precio = precio;
    this.cantidad = cantidad;
  }

  public double getPrecio() {
    return precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  @Override
  public String toString() {
    return this.producto
      + " PVP: " + String.format("%.2f", this.precio)
      + " Unidades: " + this.cantidad
      + " Subtotal: " + String.format("%.2f", this.precio * this.cantidad);
  }
}
