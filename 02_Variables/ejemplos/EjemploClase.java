/**
 * Clase en la que probamos todos los tipos de variables vistos en clase,
 * así como
 * 
 * @author Sergio Sánchez
 */
public class EjemploClase {
  public static void main(String[] args) {
    
    //Tipos numéricos
    byte myNumByte = 100;
    System.out.println(myNumByte);

    short myNumShort = 5000;
    System.out.println(myNumShort);

    long myNumLong = 15000000000L;
    System.out.println(myNumLong);

    float myNumFloat = 5.75f;
    System.out.println(myNumFloat);

    //Boolean
    boolean esJavaDivertido = true;
    boolean esElProfeDivertido = false;
    System.out.println(esJavaDivertido);     // Muestra true
    System.out.println(esElProfeDivertido);   // Muestra false

    //Potencias
    float f1 = 35e3f;
    double d1 = 12e4d;
    System.out.println(f1);
    System.out.println(d1);


    int numero = 5;

    System.out.println("El valor de la variable es " + numero);

    double x;
    double y;

    x = 7;
    y = 25.75;

    System.out.println("x vale " + x);
    System.out.println("y vale " + y);

    //Char
    char letra1 = 'c';
    char letra2 = 'a';
    char letra3 = 's';
    char letra4 = 'a';

    System.out.println("La primera letra es " + letra1);    // Muestra: La primera letra es c
    System.out.println("Todas las letras concatenadas forman la palabra " + letra1 + letra2 + letra3 + letra4);   // Muestra: Todas las letras concatenadas forman la palabra casa

    System.out.println(letra1);                   // Muestra: c
    System.out.println(letra2);                   // Muestra: a
    System.out.println(letra1 + letra2);          // Muestra: 196 (la suma de 99 y 97 código ASCII)
    System.out.println(letra1 + "" + letra2);     // Muestra: ca (sin cadena vacía realizaría la suma igual que antes)
    
    char myVar1 = 99;                             // El código ASCII 99 se corresponde con la letra c
    char myVar2 = 97;                             // El código ASCII 97 se corresponde con la letra a
    char myVar3 = 115;                            // El código ASCII 15 se corresponde con la letra s
    char myVar4 = 97;                             // El código ASCII 97 se corresponde con la letra a
    System.out.print(myVar1);
    System.out.print(myVar2);
    System.out.print(myVar3);
    System.out.println(myVar4);

    
    //String
    String cadenaVacia = "";
    String miSerie = "Peaky Blinders";
    String miPelicula = "El Señor de los Anillos";

    System.out.println("Mi serie favorita es " + miSerie);
    System.out.println("Mi película favorita es " + miPelicula);


    //Casting
    int a = 2;
    int b = 9;

    double division;

    division = b / a;                      //da como resultado 4.0 (división de dos enteros -> entero)
    System.out.println(division);

    division = (double) b / (double) a;    //da como resultado 4.5 (división de dos reales -> real)
    System.out.println(division);

    division = (double) b / a;             //da como resultado 4.5 (división de un real y un entero -> real)
    System.out.println(division);

    division = b / (double) a;             //da como resultado 4.5 (división de un entero y un real -> real)
    System.out.println(division);
  }
}