public class PruebaVehiculos {
  public static void main(String[] args) {
    Coche toyota = new Coche("1234ABC", "Toyota", "Prius");
    Bicicleta bh = new Bicicleta("BH");

    int opcion = 0;
    int km;
    while (opcion != 9) {
      System.out.println();
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Ver cantidad vehículos creados");
      System.out.println("9. Salir");

      System.out.print("Elija una opción: ");
      opcion = Integer.parseInt(System.console().readLine());
      switch (opcion) {
        case 1:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = Integer.parseInt(System.console().readLine());
          bh.recorre(km);
          break;
        
        case 2:
          bh.hacerCaballito();
          break;
        
        case 3:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = Integer.parseInt(System.console().readLine());
          toyota.recorre(km);
          break;
        
        case 4:
          toyota.quemaRueda();
          break;

        case 5:
          System.out.println("Kms recorridos por la bicicleta: " + bh.getKilometrosRecorridos());
          break;

        case 6:
          System.out.println("Kms recorridos por el coche: " + toyota.getKilometrosRecorridos());
          break;

        case 7:
          System.out.println("Los vehículos llevan recorridos un total de kms: " + Vehiculo.getKilometrosTotales());
          break;
        
        case 8:
          System.out.println("Se han creado " + Vehiculo.getVehiculosCreados() + " vehículos");
        default:
          break;
      }
    }
  }
}
