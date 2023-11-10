/**
 * Tema 4 - Sentencias condicionales
 * 
 * 23. Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
 * muestran los valores correctos, aunque los números no estén tabulados.
 * 
 * @author Sergio Sánchez
 */

public class T04Ejercicio23 {
  public static void main(String[] args) {
    System.out.print("Introduzca la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());

    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIVA = System.console().readLine().toLowerCase();

    System.out.print("Introduce el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigoPromocional = System.console().readLine().toLowerCase();

    //Calculamos el IVA y el precio antes de usar código promocional
    int porcentajeIVA = 0;
    switch (tipoIVA) {
      case "general":
        porcentajeIVA = 21;
        break;
      
      case "reducido":
        porcentajeIVA = 10;
        break;
      
      case "superreducido":
        porcentajeIVA = 4;
        break;
      
      default:
        System.out.println("No has introducido un valor correcto de IVA");
        break;
    }
    double iva = baseImponible * porcentajeIVA / 100;
    double precioConIva = baseImponible + iva;

    //Calculamos el descuento con el codigo promocional
    double descuento = 0;
    switch (codigoPromocional) {
      case "nopro":
        descuento = 0;
        break;
      
      case "mitad":
        descuento = baseImponible / 2;
        break;
      
      case "meno5":
        descuento = 5;
        break;

      case "5porc":
        descuento = baseImponible * (5 / 100);
        break;
    
      default:
        System.out.println("No has introducido un valor correcto de códigp promocional");
        break;
    }

    double total = precioConIva - descuento;
    
    System.out.printf("%-20s %6.2f\n","Base imponible", baseImponible);
    System.out.printf("IVA (%2d%%)            %6.2f\n", porcentajeIVA, iva);
    System.out.printf("%-20s %6.2f\n","Precio con IVA", precioConIva);
    System.out.printf("Cód. promo. (%5s) -%6.2f\n", codigoPromocional, descuento);
    System.out.printf("%-20s %6.2f\n","TOTAL", total);
  }
}
