import clases.Coleccion;
import clases.Disco;


public class DiscManager {
  
  // Constantes del menú
  private static final int LISTAR = 1;
  private static final int NUEVO_DISCO = 2;
  private static final int MODIFICAR_DISCO = 3;
  private static final int BORRAR_DISCO = 4;
  private static final int SALIR = 5;

  private static Coleccion coleccion;

  public static void main(String[] args) {
    
    // Creamos e inicializamos por defecto la opción SALIR
    int opcion = SALIR;

    //Inicializamos la coleccion
    coleccion = new Coleccion();

    //Guardamos algunos discos
    coleccion.guardar(new Disco("DISC01", "Viento de cara", "Supersubmarina", "pop rock", 45));
    coleccion.guardar(new Disco("DISC02", "Dookie", "Green Day",  "rock", 38));
    coleccion.guardar(new Disco("DISC03", "Origin of Symmetry", "Muse",  "rock", 55));
    coleccion.guardar(new Disco("DISC04", "El amor de la clase que sea", "Viva Suecia",  "indie", 40));

    do {

      try {
        // Mostramos el menú de la aplicación
        menu();
        // Leemos la opción
        opcion = Integer.parseInt(System.console().readLine());
        // Comprobamos la opción introducida
        switch(opcion) {
          case LISTAR:
            listarDiscos(); 
            break;

          case NUEVO_DISCO:
            crearNuevoDisco();
            break;

          case MODIFICAR_DISCO:
            break;
          
          case BORRAR_DISCO:
            borrarDisco();
            break;
          
          case SALIR: 
            break;

          default:
                System.out.println("La opción elegida no existe.\n");
        }

      } catch (NumberFormatException e) {
        System.out.println("Debe introducir un valor numérico.\n");
      }
      
    } while (opcion != SALIR);

    System.out.println("Gracias por utilizar DiscManager");
  } // Fin de la aplicación

  /**
     * Menú de la aplicación
     */
  private static void menu() {

    System.out.println("\nCOLECCIÓN DE DISCOS\n===================");
    System.out.println("1. Listado");
    System.out.println("2. Nuevo disco");
    System.out.println("3. Modificar");
    System.out.println("4. Borrar");
    System.out.println("5. Salir");

    System.out.println("Opción? ");
  }

  /** */
  private static void listarDiscos() {

    if (coleccion.esVacia()) {
      System.out.println("No hay discos que listar.\n");
    } else {
      System.out.println("LISTADO\n=======") ;
      coleccion.listar() ;
    }
  }

  /** */
  private static void crearNuevoDisco() {

    String codigo;
    String autor;
    String titulo;
    String genero;
    int duracion;

    if (coleccion.esLlena()) {
        System.out.println("Lo siento. La colección está completa.\n");
    } else {

      System.out.println("NUEVO DISCO\n===========") ;
      System.out.println("Por favor, introduzca los datos del disco.");
      System.out.print("Código: ");
      codigo = System.console().readLine();
      System.out.print("Autor: ");
      autor = System.console().readLine();
      System.out.print("Título: ");
      titulo = System.console().readLine();
      System.out.print("Género: ");
      genero = System.console().readLine();
      System.out.print("Duración: ");
      duracion = Integer.parseInt(System.console().readLine());        
      
      // creamos y guardamos el disco en la colección
      coleccion.guardar(new Disco(codigo, titulo, autor, genero, duracion)) ;
    }
  }

  /** */
  private static void borrarDisco() {

    String codigo ;
    if (coleccion.esVacia()) {
      System.out.println("La coleccióne está vacía. No hay discos que borrar.\n") ;
    } else {

      System.out.println("BORRAR\n======") ;
      System.out.println("Por favor, introduzca el código del disco que desea borrar: ") ;            
      codigo = System.console().readLine() ;
      
      coleccion.borrar(codigo) ;
    }

  }

}
