package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 27/12/2021
 */

public class Ej1sc {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime tu nombre: ");
    String nombre = s.next();
    
    System.out.print("Hola " + nombre);
    
    s.close();

  }

}
