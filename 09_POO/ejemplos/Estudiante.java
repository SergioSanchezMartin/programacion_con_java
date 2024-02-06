/**
 * Clase Estudiante que hereda de la clase Persona
 * 
 * @author Sergio Sánchez
 */
public class Estudiante extends Persona {

  //////Atributos
  private int creditos;

  //////Constructores
  public Estudiante(String nombre, int edad, String dni) {
    super(nombre, edad, dni);
    this.creditos = 60;
  }

  public Estudiante(String nombre, int edad, String dni, int creditos) {
    super(nombre, edad, dni);
    this.creditos = creditos;
  }

  public int getCreditos() {
    return this.creditos;
  }

  @Override
  public String toString() {
    return super.toString() + " [Estudiante] Créditos: " + creditos; 
  }

  

  // @Override
  // public void mostrarDatos() {
  //   super.mostrarDatos();     //Llamo al método mostrarDatos de la superclase
  //   System.out.println("Estudiante matriculado de " + creditos + " créditos.");
  // }
}
