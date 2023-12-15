import matematicas.Varias;
import matematicas.Volumen;
import matematicas.Area;

public class PruebaFunciones {
  public static void main(String[] args) {
    // int n;

    // //Probamos la función esPrimo(), alojada en la clase Varias dentro del paquete matematicas
    // System.out.print("introduzca un numero entero positivo: ");
    // n = Integer.parseInt(System.console().readLine());

    // if (Varias.esPrimo(n)) {
    //   System.out.println("El numero " + n + " es primo.");
    // } else {
    //   System.out.println("El numero " + n + " no es primo.");    
    // }

    // //Prueba digitos(), alojada en la clase Varias dentro del paquete matematicas
    // System.out.print("introduzca un numero entero positivo: ");
    // n = Integer.parseInt(System.console().readLine());

    // int numDigitos = Varias.digitos(n);
    // System.out.println(n + " tiene " + numDigitos + " dígitos.");


    // //Prueba volumenCilindro(), alojada en la clase Volumen dentro del paquete matematicas
    // double r;
    // double h;
    // System.out.print("Introduzca el radio del cilindro (cm): ");
    // r = Double.parseDouble(System.console().readLine());
    // System.out.print("Introduzca la altura del cilindro (cm): ");
    // h = Double.parseDouble(System.console().readLine());

    // System.out.println("El volumen del cilindro es " + Volumen.volumenCilindro(r, h) + "cm^3");

    // System.out.print("Introduzca un número para voltearlo: ");
    // long x = Long.parseLong(System.console().readLine());
    // System.out.println("El numero " + x + " volteado es: " + Varias.voltea(x));
    
    // //Prueba de la función int voltea()
    // System.out.print("Introduzca un número para voltearlo: ");
    // int num = Integer.parseInt(System.console().readLine());
    // System.out.println("El numero " + num + " volteado es: " + Varias.voltea(num));

    // System.out.print("Introduzca un número para saber si es capicúa (int): ");
    // int x = Integer.parseInt(System.console().readLine());
    // if (Varias.esCapicua(x)) {
    //   System.out.println("El número es capicúa");
    // } else {
    //   System.out.println("El número no es capicúa");
    // }
    System.out.print("Introduzca un número para conocer si es amigo: ");
    int x = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca un número para conocer si es amigo: ");
    int y = Integer.parseInt(System.console().readLine());
    
    if (Varias.numerosAmigos(x, y)) {
      System.out.println("Son amigos");
    } else {
      System.out.println("No son amigos");
    }
    

    System.out.println();
  }
}
