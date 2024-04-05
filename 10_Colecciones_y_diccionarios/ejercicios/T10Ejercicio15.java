import java.util.ArrayList;
import java.util.HashMap;

public class T10Ejercicio15 {
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
    double descuento = 0;
    boolean hayDescuento = false;

    do {
      System.out.print("Producto: ");
      productoIntroducido = System.console().readLine();
      if (!productoIntroducido.equalsIgnoreCase("fin")) {
        System.out.print("Cantidad: ");
        cantidadIntroducida = Integer.parseInt(System.console().readLine());
        if (productos.containsKey(productoIntroducido)) {
          //Compruebo si el producto ya está entre el pedido
          if (listadoProductos.contains(productoIntroducido)) {
            int posicionProducto = listadoProductos.indexOf(productoIntroducido);
            listadoCantidades.set(posicionProducto, listadoCantidades.get(posicionProducto) + cantidadIntroducida);
          } else {
            listadoProductos.add(productoIntroducido);
            listadoCantidades.add(cantidadIntroducida);
          }
        } else {
          System.out.println("Lo sentimos. Este producto no se encuentra disponible");
        }
        
        
      } else {
        continuar = false;
        System.out.print("Introduzca código de descuento (INTRO si no tiene ninguno): ");
        String respuesta = System.console().readLine();
        if (respuesta.equals("ECODTO")) {
          hayDescuento = true;
        }
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

    if (hayDescuento) {
      descuento = total / 10.0;
      total *= 0.9;
    }

    System.out.println("---------------------------------");
    System.out.printf("Descuento: %7.2f€\n", descuento);
    System.out.println("---------------------------------");
    System.out.printf("TOTAL: %7.2f€", total);
  }
}