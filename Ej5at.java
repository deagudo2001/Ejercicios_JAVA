package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 24/1/22
 */

public class Ej5at {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime la edad de una persona: ");
    int edad1 = s.nextInt();
    
    System.out.print("Dime la edad de otra persona: ");
    int edad2 = s.nextInt();
    
    if (edad1 < edad2) {
      System.out.print("La persona con la edad " + edad1 + " es más joven que la otra.");
    } else {
      System.out.print("La persona con la edad " + edad2 + " es más joven que la otra.");
    }
    
    s.close();
  }

}
