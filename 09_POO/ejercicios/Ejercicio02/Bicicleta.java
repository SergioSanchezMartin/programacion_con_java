public class Bicicleta extends Vehiculo {

  //Atributos de instancia (objetos)
  private int pinones;

  //Constructores
  public Bicicleta() {
    super();    //Llamo al constructor padre public Vehiculo()
  }

  public Bicicleta(int p) {
    super();    //Llamo al constructor padre public Vehiculo()
    this.pinones = p;
  }

  public void hacerCaballito() {
    System.out.println("Estoy un caballitoooo!");
  }

}
