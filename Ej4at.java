package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 24/1/22
 */

public class Ej4at {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime un número: ");
    int n1 = s.nextInt();
    
    System.out.print("Dime otro número: ");
    int n2 = s.nextInt();
    
    if (n2 != 0) {
      double division = n1 / n2;
      System.out.print("División entre los números " + division);
    } else {
      System.out.print("AVISO!");
    }
    
    s.close();
  }

}
