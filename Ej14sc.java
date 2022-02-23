package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 20/1/22
 */

public class Ej14sc {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime un número: ");
    int num = s.nextInt();
    
    int invertido1 = num / 10;
    int invertido2 = num % 10;
    
    
    System.out.print("Este es el número invertido " + invertido2 + invertido1);;
    
    s.close();
  }

}
