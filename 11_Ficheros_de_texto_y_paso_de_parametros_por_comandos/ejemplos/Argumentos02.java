public class Argumentos02 {
  public static void main(String[] args) {
    double suma = 0;

    for (int i = 0; i < args.length; i++) {
      suma += Double.parseDouble(args[i]);
    }

    System.out.print("La suma de ");

    for (int i = 0; i < args.length; i++) {
      if (i == args.length - 1) {
        System.out.print(args[i] + " es ");
      } else {
        System.out.print(args[i] + " + ");
      }
      
    }
   System.out.print(suma); 
  }
}
