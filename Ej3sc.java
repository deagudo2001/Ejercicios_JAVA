package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 27/12/2021
 */

public class Ej3sc {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime lo que mide un cateto: ");
    double cateto1 = s.nextDouble();
    
    System.out.print("Dime lo que mide el otro cateto: ");
    double cateto2 = s.nextDouble();
    
    double h = Math.pow(cateto1 + cateto2, 2);
    
    System.out.print("Hipotenusa: " + h);

    s.close();
  }

}
