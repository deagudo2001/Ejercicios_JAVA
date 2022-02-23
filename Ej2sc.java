package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 27/12/2021
 */

public class Ej2sc {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime la base del rectángulo: ");
    double b = s.nextDouble();
    
    System.out.print("Dime la altura del rectángulo: ");
    double h = s.nextDouble();
    
    double perimetro = (b * 2 + h * 2 );
    double area = (b * h);
    
    System.out.println("Perímetro: " + perimetro);
    System.out.println("Área: " + area);
    
    s.close();
  }

}
