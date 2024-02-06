/**
 * Clase de ejemplo Coche
 * 
 * @author Sergio Sánchez
 */

public class Coche {

  ////////Atributos
  String matricula;
  String marca;
  String modelo;
  int puertas;
  String color;
  int potencia;

  public static void main(String[] args) {
    Coche miCoche = new Coche();    //Coche 1
    Coche tuCoche = new Coche();    //Coche 2


    miCoche.matricula = "1234ABC";
    System.out.println("Matrícula coche 1: " + miCoche.matricula);
    System.out.println("Potencia coche 1: " + miCoche.potencia);
    System.out.println("Matrícula coche 2: " + tuCoche.matricula);
    System.out.println("Potencia coche 2: " + tuCoche.potencia);
  }
  
}