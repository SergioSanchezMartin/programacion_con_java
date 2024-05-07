package modules;

public class Fruta {

  private String nombre;
  private final String EXTENSION = ".jpg";
  
  public Fruta(String nombre) {
      this.nombre = nombre;
  }

  public String getNombre() {
      return nombre;
  }

  @Override
  public String toString() {        
      return "<img src=\"./assets/img/" + this.nombre
             + EXTENSION +"\" />"  ;
  }
}