public abstract class Animal {
  
  //////Atributos
  private Sexo sexo;
  
  //////Constructor
  public Animal () {
    sexo = Sexo.MACHO;
  }
  
  public Animal (Sexo s) {
    sexo = s;
  }

  public Sexo getSexo() {
    return sexo;
  }
  public String toString() {
    return "Sexo: " + this.sexo + "\n";
  }

  /**
  * Hace que el animal se eche a dormir.
  */
  public abstract void duerme(String prueba);
}