package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 21/1/22
 */

public class Ej18sc {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime tu nombre: ");
    String nombre = s.next();
    
    System.out.print("Dime tu apellido: ");
    String apellido = s.next();
    
    nombre = nombre.toUpperCase();
    apellido = apellido.toUpperCase();
    
    System.out.print("Tus iniciales: " + nombre.substring(0,1) + apellido.substring(0,1));
    
    s.close();
  }

}
