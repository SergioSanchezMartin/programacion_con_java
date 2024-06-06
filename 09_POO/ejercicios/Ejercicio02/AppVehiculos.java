public class AppVehiculos {
  public static void main(String[] args) {
   
    int opcion = 0;
    int km;

    //Creamos objetos
    Bicicleta bh = new Bicicleta();
    // Bicicleta orbea = new Bicicleta(32);
    Coche mustang = new Coche(280);

    while (opcion != 9) {
      System.out.println("\n1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Número total de vehículos");
      System.out.println("9. Salir");
      System.out.println("Elige una opción (1-9): ");

      opcion = Integer.parseInt(System.console().readLine());
      switch (opcion) {
        case 1:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = Integer.parseInt(System.console().readLine());
          bh.andar(km);
          break;

        case 2:
          bh.hacerCaballito();
          break;

        case 3:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = Integer.parseInt(System.console().readLine());
          mustang.andar(km);
          break;

        case 4:
          mustang.quemarRueda();
          break;

        case 5:
          System.out.print("La bicicleta lleva recorridos ");
          System.out.println(bh.getKilometrosRecorridos() + " Km");
          break;

        case 6:
          System.out.print("El coche lleva recorridos ");
          System.out.println(mustang.getKilometrosRecorridos() + " Km");
          break;

        case 7:
          System.out.print("Los vehículos llevan recorridos ");
          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
          break;

        case 8:
          System.out.print("Número total de vehículos creados: ");
          System.out.println(Vehiculo.getVehiculosCreados() + " uds.");
          break;
          
        default:

      } //switch
      
    } //while

  }
}
