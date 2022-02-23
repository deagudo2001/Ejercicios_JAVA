package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 20/1/22
 */

public class Ej12sc {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime el valor de x1: ");
    double x1 = s.nextDouble();
    
    System.out.print("Dime el valor de y1: ");
    double y1 = s.nextDouble();
    
    System.out.print("Dime el valor de x2: ");
    double x2 = s.nextDouble();
    
    System.out.print("Dime el valor de y2: ");
    double y2 = s.nextDouble();
    
    double distancia1 = x2 - x1;
    double distancia2 = y2 - y1;
    
    System.out.println("La distancia entre " + x1 + " y " + x2 + " es de " + distancia1);
    System.out.print("La distancia entre " + y1 + " y " + y2 + " es de " + distancia2);
    
    s.close();
  }

}
