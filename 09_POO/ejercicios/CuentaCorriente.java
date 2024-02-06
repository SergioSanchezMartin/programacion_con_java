public class CuentaCorriente {

  /////Atributos
  private String numero = "";
  private double saldo;

  /////Constructores
  public CuentaCorriente(){
    generarAleatorio();
    saldo = 0;
  }

  public CuentaCorriente(double saldoInicial){
    generarAleatorio();
    this.saldo = saldoInicial;
  }

  private void generarAleatorio() {
    for (int i = 0; i < 10; i++) {
      numero += (int)(Math.random()*10);
    }
  }

  public void ingreso (double cantidad){
    this.saldo += cantidad;
  } 

  public void cargo (double cantidad){
    this.saldo -= cantidad;
  }

  public void transferencia (CuentaCorriente destino, double cantidad){
    destino.saldo += cantidad;
    this.saldo -= cantidad;
  }

  public double getSaldo() {
    return this.saldo;
  }

  @Override
  public String toString() {
    return String.format("Número de cta: %s \tSaldo: %.2f", numero, saldo);
  }  
}
