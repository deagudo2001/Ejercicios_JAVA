package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 20/1/22
 */

public class Ej11sc {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime un número: ");
    double num1 = s.nextDouble();
    
    System.out.print("Dime el segundo número: ");
    double num2 = s.nextDouble();
    
    double distancia = num2 - num1;
    
    if (distancia < 0) {
      distancia = distancia * (-1);
      System.out.print("La distancia entre los números introducidos es de " + String.format("%.0f", distancia));
    } else {
      System.out.print("La distancia entre los números introducidos es negativa.");
    }
    
    s.close();
  }

}
