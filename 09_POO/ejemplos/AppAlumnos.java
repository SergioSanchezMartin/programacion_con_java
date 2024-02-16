public class AppAlumnos {
  public static void main(String[] args) {
    Alumno[] alumnos = new Alumno[5];     //Creamos el array de objetos
    int posicionIntroducida;
    int opcionMenu;
    String nombreIntroducido;
    double notaMediaIntroducida;
    
    // Carga varios alumnos
    alumnos[0] = new Alumno("Sergio", 8.7);
    alumnos[1] = new Alumno("Irene", 2.7);
    alumnos[2] = new Alumno("Paco", 4.3);


    do {
      System.out.println("\nGESTION ALUMNADO");
      System.out.println("================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo alumno");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcionMenu = Integer.parseInt(System.console().readLine());

      switch (opcionMenu) {
        case 1:
          System.out.println("\nLISTADO");
          System.out.println("=======");
          for (Alumno alu : alumnos) {
            if (alu != null) {
              System.out.println(alu.toString());
            }
          }
          break;
        
        case 2:
          System.out.println("\nNUEVO ALUMNO");
          System.out.println("=======");

          // Busca la primera posición libre del array
          int primeraLibre = -1;
          do {
            primeraLibre++;
            System.out.println(primeraLibre);
          } while (alumnos[primeraLibre] != null);
          System.out.println("Por favor, introduzca los datos del alumno.");  
          System.out.print("Nombre: ");
          nombreIntroducido = System.console().readLine();
          System.out.print("Nota media: ");
          notaMediaIntroducida = Double.parseDouble(System.console().readLine());
          alumnos[primeraLibre] = new Alumno(nombreIntroducido, notaMediaIntroducida);
          break;
        
        case 3:
          System.out.println("\nMODIFICAR");
          System.out.println("===========");
          System.out.print("Introduce el número de alumno a modificar: ");
          posicionIntroducida = Integer.parseInt(System.console().readLine());
          System.out.println("Por favor, introduzca los nuevos datos del alumno.");  
          System.out.print("Nombre: ");
          nombreIntroducido = System.console().readLine();
          System.out.print("Nota media: ");
          notaMediaIntroducida = Double.parseDouble(System.console().readLine());
          alumnos[posicionIntroducida] = new Alumno(nombreIntroducido, notaMediaIntroducida);
          break;

        case 4:
          System.out.println("\nBORRAR");
          System.out.println("=======");
          System.out.print("Introduce el número de alumno a borrar: ");
          posicionIntroducida = Integer.parseInt(System.console().readLine());
          alumnos[posicionIntroducida] = null;
      
        default:
          System.out.println("ERROR: Opción no válida");
          break;
      }
      
    } while (opcionMenu != 5);

  
    //Creación de alumnos
    // for (i = 0; i < alumnos.length; i++) {
    //   alumnos[i] = new Alumno();
    //   System.out.print("Nombre del alumno " + i + ": ");
    //   nombre = System.console().readLine();
    //   alumnos[i].setNombre(nombre);
    //   System.out.print("Nota media del alumno " + i + ": ");
    //   notaMedia = Double.parseDouble(System.console().readLine());
    //   alumnos[i].setNotaMedia(notaMedia);
    // }

    //Lectura con toString
    // for (Alumno alu : alumnos) {
    //   System.out.println(alu.toString());
    // }

    //Lectura con getters
    // for (Alumno alu : alumnos) {
    //   System.out.print("Nombre del alumno: " + alu.getNombre());
    //   System.out.println("\tNota media del alumno: " + alu.getNotaMedia());
    // }

    //Borrar alumno
    // System.out.print("Introduce el número de alumno a borrar: ");
    // i = Integer.parseInt(System.console().readLine());
    // alumnos[i] = null;

    //Lectura con getters
    // System.out.println("\nLISTADO");
    // System.out.println("=======");

    // for(Alumno alu : alumnos) {
    //   // if (!(alu == null)) {
    //     System.out.println(alu);
    //   // }  
    // }


  }
}
