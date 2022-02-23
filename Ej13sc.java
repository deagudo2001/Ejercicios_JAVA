package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 20/1/22
 */

public class Ej13sc {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime un número: ");
    double num = s.nextInt();
    
    double cuadrada = Math.sqrt(num);
    double cubica = Math.cbrt(num);
    
    System.out.println("Raíz cuadrada: " + String.format("%.2f", cuadrada));
    System.out.print("Raíz cúbica: " + String.format("%.2f", cubica));
    
    s.close();
  }

}
