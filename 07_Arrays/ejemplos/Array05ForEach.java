/**
 * Se muestra un array de números de tipo double que almacena notas de alumnos al estilo foreach
 * 
 * @author Sergio Sánchez
 */
public class Array05ForEach {
  public static void main(String[] args) {
    double[] notas = new double[3];
    double media = 0;
    double suma = 0;

    //Escritura en el array
    for (int i = 0; i < notas.length; i++) {
      System.out.print("Nota del examen nº " + (i + 1) + ": ");
      notas[i] = Double.parseDouble(System.console().readLine());
    }

    //Lectura del array
    System.out.println("Tus notas son: ");
    for (double n : notas) {
      System.out.print(n + "\t");
      suma += n;
    }

    media = suma / notas.length;
    System.out.println("\nTu nota media es: " + media);
  }
}
