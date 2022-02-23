package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 24/1/22
 */

public class Ej1at {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime un número: ");
    int n1 = s.nextInt();
    
    System.out.print("Dime otro número: ");
    int n2 = s.nextInt();
    
    if (n1 > n2) {
      System.out.print(" " + n1 + " es más grande que " + n2);
    } else {
      System.out.print(" " + n2 + " es más grande que " + n1);
    }
    
    s.close();
  }

}
