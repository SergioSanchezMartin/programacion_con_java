import java.util.ArrayList;
import java.util.HashMap;

public class T10Ejercicio12 {
  public static void main(String[] args) {
    ArrayList<Carta> mano = new ArrayList<Carta>();
    HashMap<String, Integer> parejas = new HashMap<String, Integer>();
    int puntos = 0;

    parejas.put("As", 11);
    parejas.put("3", 10);
    parejas.put("Rey", 4);
    parejas.put("Caballo", 3);
    parejas.put("Sota", 2);

    Carta c = new Carta();
    mano.add(c);

    for (int i = 1; i < 5; i++) {
      do {
        c = new Carta();
      } while (mano.contains(c));
      mano.add(c);
    }

    for (Carta carta : mano) {
      System.out.println(carta);
      if(parejas.containsKey(carta.getValor())){
        puntos += parejas.get(carta.getValor());
      }
    }
    System.out.println("Puntos: " + puntos);
  }
}
