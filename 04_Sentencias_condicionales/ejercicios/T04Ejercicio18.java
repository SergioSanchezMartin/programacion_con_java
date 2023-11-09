/**
 * Tema 4 - Sentencias condicionales
 * 
 * 18. Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 * @author Sergio Sánchez
 */

import java.util.Scanner;

public class T04Ejercicio18 {
  public static void main(String[] args) {
    int numero;
    int primera = 0;    //Almaceno la primera cifra del numero
    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor, introduce un número entero positivo (5 cifras como máximo): ");
    numero = sc.nextInt();

    //Numero de 1 cifra
    if (numero < 10){
      primera = numero;
    }

    //Numero de 2 cifras
    if ((numero >= 10) && (numero < 100)){
      primera = numero / 10;
    }

    //Numero de 3 cifras
    if ((numero >= 100) && (numero < 1000)){
      primera = numero / 100;
    }

    //Numero de 4 cifras
    if ((numero >= 1000) && (numero < 10000)){
      primera = numero / 1000;
    }

    //Numero de 5 cifras
    if ((numero >= 10000) && (numero < 100000)){
      primera = numero / 10000;
    }
    
    System.out.println("La primera cifra del número " + numero + " es el " + primera);

    sc.close();
  }
}
