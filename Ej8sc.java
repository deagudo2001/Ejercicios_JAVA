package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 20/1/22
 */

public class Ej8sc {
  
  public static double EXTRA = 0.10;

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime tu sueldo base: ");
    double base = s.nextDouble();
    
    System.out.print("Dime el número de ventas que realizaste: ");
    int ventas = s.nextInt();
    
    double comision = 0;
    
    if (ventas >= 0) {
      comision = base + (ventas * EXTRA);
      System.out.println("Este será tu sueldo final: " + String.format("%.2f",comision)+ " €");
    } else {
      System.out.println("El sueldo no puede ser calculado");
    }
    
    s.close();
  }

}
