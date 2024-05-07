package modules;

public class Fruta {

  private String id;
  private String nombre;
  private final String EXTENSION = ".jpg";
  
  //Primer constructor
  public Fruta(String nombre) {
      this.nombre = nombre;
  }

  //Segundo constructor (lo usamos ahora con BBDD)
  public Fruta(String id, String nombre) {
    this.id = id;
    this.nombre = nombre;
}

  public String getNombre() {
      return nombre;
  }

  @Override
  public String toString() {        
      return "<img src=\"./assets/img/img_" + this.id
             + EXTENSION +"\" />"  ;
  }
}