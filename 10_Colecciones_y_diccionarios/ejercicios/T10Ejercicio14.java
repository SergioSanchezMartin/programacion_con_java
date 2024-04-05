import java.util.ArrayList;
import java.util.HashMap;

public class T10Ejercicio14 {
  public static void main(String[] args) {
    HashMap<String, Double> productos = new HashMap<String, Double>();
    productos.put("avena", 2.21);
    productos.put("garbanzos", 2.39);
    productos.put("tomate", 1.59);
    productos.put("jengibre", 3.13);
    productos.put("quinoa", 4.50);
    productos.put("guisantes", 1.60);

    ArrayList<String> listadoProductos = new ArrayList<String>();
    ArrayList<Integer> listadoCantidades = new ArrayList<Integer>();
    boolean continuar = true;
    String productoIntroducido;
    int cantidadIntroducida;
    double total = 0;

    do {
      System.out.print("Producto: ");
      productoIntroducido = System.console().readLine();
      if (!productoIntroducido.equalsIgnoreCase("fin")) {
        System.out.print("Cantidad: ");
        cantidadIntroducida = Integer.parseInt(System.console().readLine());
        listadoProductos.add(productoIntroducido);
        listadoCantidades.add(cantidadIntroducida);
      } else {
        continuar = false;
      }
    } while (continuar);

    System.out.println("Producto Precio Cantidad Subtotal");
    System.out.println("---------------------------------");

    for (int i = 0; i < listadoProductos.size(); i++) {
      String producto = listadoProductos.get(i);
      double precio = productos.get(producto);
      int cantidad = listadoCantidades.get(i);
      double subtotal = precio * cantidad;
      total += subtotal;
      System.out.printf("%-8s %7.2f %6d %7.2f\n", producto, precio, cantidad, subtotal);
    }

    System.out.println("---------------------------------");
    System.out.printf("TOTAL: %7.2f€", total);
  }
}
