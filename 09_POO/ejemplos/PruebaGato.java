public class PruebaGato {
  public static void main(String[] args) {
    // Gato garfield = new Gato("Garfield");
    // System.out.println(garfield.nombre);
    // Gato botas = new Gato("Botas", "Negro", "Egipcio", "Macho", 5, 4.2);
    // System.out.println(botas.nombre);
    // System.out.println(botas.color);
    // System.out.println(botas.raza);
    // System.out.println(botas.sexo);
    // System.out.println(botas.edad);
    // System.out.println(botas.peso);
    // Gato missy = new Gato();
    // missy.sexo = "hembra";

    // garfield.come("carne");
    // garfield.maulla();
    // garfield.ronronea();
    // garfield.peleaCon(botas);
    // botas.peleaCon(missy);

    System.out.print("¿Cuántos gatos quieres crear?: ");
    int num = Integer.parseInt(System.console().readLine());

    Gato[] gaticos = new Gato[num];
    String[] nombres = {"Garfield", "Botas", "Willy", "Pancho", "Misifú"};
    String[] colores = {"Marrón", "Negro", "Pardo"};
    
    for (int i = 0; i < num; i++) {
      int nombreAleatorio = (int)(Math.random()*5);
      int colorAleatorio = (int)(Math.random()*3);
      System.out.print("¿Qué raza deseas?: ");
      String raza = System.console().readLine();
      gaticos[i] = new Gato(nombres[nombreAleatorio], colores[colorAleatorio], raza, "Macho", 0, 0);
    }

    for (int i = 0; i < gaticos.length; i++) {
      System.out.println(gaticos[i].nombre);
      System.out.println(gaticos[i].color);
    }
    
    
    
  }
}
