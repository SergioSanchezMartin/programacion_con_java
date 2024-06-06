public class Vehiculo {
  
  //Atributos de clase
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;

  //Atributo de instancia (objetos)
  private int kilometrosRecorridos;

  //Constructor
  public Vehiculo(){
    this.kilometrosRecorridos = 0;
    Vehiculo.vehiculosCreados++;
  }
  
  //Getters

  /** 
   * @return int
   */
  public static int getKilometrosTotales() {
    // return Vehiculo.kilometrosTotales;
    return kilometrosTotales;
  }

  
  /** 
   * @return int 
   */
  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public static int getVehiculosCreados() {
    // return Vehiculo.vehiculosCreados;
    return vehiculosCreados;
  }

  
  /** 
   * Hace que un vehículo recorra una distancia determinada.
   * <p>
   * Cuando un vehículo recorre una distancia <code>km</code>, se
   * incrementan su propio cuentakilómetros, es decir, su atributo
   * <code>kilometrosRecorridos</code> y también se incrementa la cuenta
   * global de kilómetros que recorren todos los vehículos, es decir, el
   * atributo de clase <code>kilometrosTotales</code>.
   * @param km - kilómetros que va a recorrer el vehículo 
   */
  public void andar(int km) {
    this.kilometrosRecorridos += km;
    Vehiculo.kilometrosTotales += km;
  }
}
