package Secuenciales;

import java.util.Scanner;

public class Ej1libro {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime tu nombre: ");
    String nombre = s.next();
    
    System.out.print("Dime tu dirección: ");
    String direccion = s.next();
    
    System.out.print("Dime tu número de teléfono: ");
    String tel = s.next();
        
    s.nextLine();
    
    System.out.println("Tu nombre es " + nombre);
    System.out.println("Tu dirección es " + direccion);
    System.out.print("Tu número de teléfono es " + tel);
    
    s.close();
  }

}
