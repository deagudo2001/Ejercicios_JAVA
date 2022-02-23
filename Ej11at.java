package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 25/1/22
 */

public class Ej11at {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime el valor de A: ");
    double vA = s.nextDouble();

    System.out.print("Dime el valor de C: ");
    double vB = s.nextDouble();
    
    System.out.print("Dime el valor de la hippotenusa: ");
    double h = s.nextDouble();
    
    double operacion = (Math.pow(vA, 2) + Math.pow(vB, 2));
    
    if (vA == h && h == vB && vA == vB) {
      System.out.print("El triángulo es equilátero.");
    } else if (vA == vB || h == vA){
      System.out.print("El triángulo es isósceles.");
    } else if (operacion == Math.pow(h, 2)) {
      System.out.print("El triángulo es rectángulo.");
    } else {
      System.out.print("El triángulo es escaleno.");
    }
    
    s.close();
  }

}
