package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 20/1/22
 */

public class Ej15sc {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime el valor de A: ");
    int A = s.nextInt();
    
    System.out.print("Dime el valor de B: ");
    int B = s.nextInt();
    
    int auxiliar = 0;
    auxiliar = A;
    
    System.out.print("Las variables invertidas " + B + auxiliar);
    
    s.close();
  }

}
