/**
 * Clase Persona que nos permitirá reutilizarla para ver el concepto de herencia en POO
 * 
 * @author Sergio Sánchez
 */
public abstract class Persona {

  //////Atributos
  private String nombre;
  private int edad;
  private String dni;

  //////Constructor
  public Persona(String nombre, int edad, String dni) {
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getEdad() {
    return this.edad;
  }

  public String getDni() {
    return this.dni;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + "\tEdad: " + edad + "\tDNI: " + dni;
  }

  // public void mostrarDatos() {
  //   System.out.println("Nombre: " + nombre + "\tEdad: " + edad + "\tDNI: " + dni);
  // }
  
  
  
}
