package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 28/12/2021
 */

public class Ej5sc {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime los grados Celsius: ");
    double celsius = s.nextDouble();
    
    double f = (celsius * (9/5) + 32);
    
    System.out.print("Grados Celsius: " + celsius + ", Grados Farenheit: " + f);

    s.close();
  }

}
