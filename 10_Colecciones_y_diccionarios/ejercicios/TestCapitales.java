import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TestCapitales {
  public static void main(String[] args) {

    //Creamos el diccionario de paises-capitales
    HashMap<String, String> paisesCapitales = new HashMap<String, String>();
    paisesCapitales.put("España", "Madrid");
    paisesCapitales.put("Francia", "París");
    paisesCapitales.put("Portugal", "Lisboa");
    paisesCapitales.put("Italia", "Roma");
    paisesCapitales.put("Alemania", "Berlín");
    paisesCapitales.put("Bélgica", "Bruselas");
    paisesCapitales.put("Polonia", "Varsovia");
    paisesCapitales.put("Irlanda", "Dublín");
    paisesCapitales.put("Reino Unido", "Londres");
    paisesCapitales.put("Noruega", "Oslo");

    //Creamos la lista de respuesta incorrectas. Total 20
    ArrayList<String> incorrectas = new ArrayList<String>();
    incorrectas.add("Budapest");
    incorrectas.add("Atenas");
    incorrectas.add("Praga");
    incorrectas.add("Viena");
    incorrectas.add("Zurich");
    incorrectas.add("Estocolmo");
    incorrectas.add("Ámsterdam");
    incorrectas.add("Copenhague");
    incorrectas.add("Helsinki");
    incorrectas.add("Dubrovnik");
    incorrectas.add("Moscú");
    incorrectas.add("Kiev");
    incorrectas.add("Bucarest");
    incorrectas.add("Sofía");
    incorrectas.add("Estambul");
    incorrectas.add("Berna");
    incorrectas.add("Nicosia");
    incorrectas.add("Valetta");
    incorrectas.add("Tirana");
    incorrectas.add("Pristina");

    //Creo una lista que contiene el conjunto de todas las claves del diccionario
    ArrayList<String> listadoPaises = new ArrayList<String>(paisesCapitales.keySet());
    String pais;
    String capitalCorrecta;
    int numeroAleatorio;
    int respuestaIntroducida;

    for (int i = 0; i < 10; i++) {
      numeroAleatorio = (int)(Math.random()*listadoPaises.size());
      pais = listadoPaises.get(numeroAleatorio);
      System.out.println("\n" + (i+1) + ") ¿Cuál es la capital de " + pais + "?");
      capitalCorrecta = paisesCapitales.get(pais);
      ArrayList<String> opciones = generarOpciones(capitalCorrecta, incorrectas);
      for (int j = 0; j < opciones.size(); j++) {
        System.out.println((j+1) + ". " + opciones.get(j));
      }
      System.out.print("RESPUESTA: ");
      respuestaIntroducida = Integer.parseInt(System.console().readLine());
      if (opciones.get(respuestaIntroducida - 1).equals(capitalCorrecta)) {
        System.out.println("¡CORRECTO!");
      } else {
        System.out.println("¡FALLASTE!");
      }

      //Eliminamos el pais preguntado del ArrayList
      listadoPaises.remove(pais);

      //Aunque no es necesario, podemos eliminar el par (pais, capital)
      // paisesCapitales.remove(pais);

      //Eliminamos todas las opciones de respuesta
      incorrectas.removeAll(opciones);
    }
  
  }

  //Método que genera las 3 opciones de respuesta y se presentan aleatoriamente
  private static ArrayList<String> generarOpciones(String capitalCorrecta, ArrayList<String> incorrectas) {
    ArrayList<String> opciones = new ArrayList<String>();
    opciones.add(capitalCorrecta);
    while (opciones.size() < 3) {
      String opcionIncorrecta = incorrectas.get((int)(Math.random()*incorrectas.size()));
      if (!opciones.contains(opcionIncorrecta)) {
        opciones.add(opcionIncorrecta);
      }
    }
    Collections.shuffle(opciones);
    return opciones;
  }
}
