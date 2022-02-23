package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 28/12/2021
 */

public class Ej6sc {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime un número: ");
    double num = s.nextDouble();
    
    System.out.print("Dime otro número: ");
    double num1 = s.nextDouble();
    
    System.out.print("Dime otro número: ");
    double num2 = s.nextDouble();
    
    double media = (num + num1 + num2)/3;
    
    System.out.print("Media: " + media);

    s.close();
  }

}
