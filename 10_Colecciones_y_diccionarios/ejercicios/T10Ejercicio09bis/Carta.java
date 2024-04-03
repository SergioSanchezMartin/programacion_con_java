/**
 * Ejercicio 9 Tema 10
 * Modifica el programa anterior de tal forma que las cartas se muestren ordenadas.
 * Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
 * coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 * 
 * @author Sergio Sánchez
 */
public class Carta implements Comparable<Carta> {
  private static String[] p = {"Oros", "Bastos", "Espadas", "Copas"};
  private static int[] n = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

  private String palo;
  private int valor;

  public Carta(){
    this.palo = p[(int)(Math.random()*4)];
    this.valor = n[(int)(Math.random()*10)];
  }

  public String getPalo() {
    return palo;
  }

  public int getValor() {
    return valor;
  }

  @Override
  public String toString() {
    return valor + " de " + palo;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Carta other = (Carta) obj;
    if (valor != other.valor)
      return false;
    if (!palo.equals(other.palo))
      return false;
    return true;
  }
  
  @Override
  public int compareTo(Carta c) {
    if (this.palo.equals(c.getPalo())) {
      return Integer.compare(this.valor, c.getValor());
    } else {
      return this.palo.compareTo(c.getPalo());
    }
  }

}
