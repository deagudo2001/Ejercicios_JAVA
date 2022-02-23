package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 24/1/22
 */

public class Ej3at {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime un número: ");
    int num = s.nextInt();
    
    if (num % 2 == 0) {
      System.out.print("Es par");
    } else {
      System.out.print("Es impar");
    }
    
    s.close();
  }

}
