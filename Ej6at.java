package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 24/1/22
 */

public class Ej6at {
  
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime una letra: ");
    String letra = s.next();
    
    if (letra == letra.toUpperCase()) {
      System.out.print("La letra es mayúscula");
    } else {
      System.out.print("La letra no es mayúscula");
    }
    
    s.close();
  }

}
