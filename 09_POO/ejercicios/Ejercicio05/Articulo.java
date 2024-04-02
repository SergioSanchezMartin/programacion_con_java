package Ejercicio05;

public class Articulo {
  private String codigo;
  private String descripcion;
  private double precioDeCompra;
  private double precioDeVenta;
  private int stock;

  public Articulo(String codigo, String descripcion, double precioDeCompra, double precioDeVenta, int stock) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precioDeCompra = precioDeCompra;
    this.precioDeVenta = precioDeVenta;
    this.stock = stock;
  }

  public Articulo() {
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioDeCompra() {
    return precioDeCompra;
  }

  public void setPrecioDeCompra(double precioDeCompra) {
    this.precioDeCompra = precioDeCompra;
  }

  public double getPrecioDeVenta() {
    return precioDeVenta;
  }

  public void setPrecioDeVenta(double precioDeVenta) {
    this.precioDeVenta = precioDeVenta;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  @Override
  public String toString() {
    return "--------- " + 
            "\nCódigo: " + this.codigo +
            "\nDescripción: " + this.descripcion + 
            "\nPrecio de compra: " + this.precioDeCompra + 
            "\nPrecio de venta: " + this.precioDeVenta + 
            "\nStock: " + this.stock;
  }
  
} 
