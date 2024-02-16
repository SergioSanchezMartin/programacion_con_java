public abstract class Vehiculo {
  // atributos de clase
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;

  //atributos de instancia
  private int kilometrosRecorridos;

  public Vehiculo() {
    this.kilometrosRecorridos = 0;
    vehiculosCreados++;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }

  public void recorre(int km) {
    this.kilometrosRecorridos += km;
    kilometrosTotales += km;
  }

  //Método de clase
  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }
  
  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }
}
