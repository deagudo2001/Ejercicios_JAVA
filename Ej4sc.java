package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 27/12/2021
 */

public class Ej4sc {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.print("Dime un número: ");
    double num1 = s.nextDouble();
    
    System.out.print("Dime otro número: ");
    double num2 = s.nextDouble();
    
    double suma = num1 + num2;
    double resta = num1 - num2;
    double multi = num1 * num2;
    double div = num1 / num2;
    
    System.out.println("Suma: " + suma);
    System.out.println("Resta: " + resta);
    System.out.println("Multiplicación: " + multi);
    System.out.println("División: " + div);
    
    s.close();
  }

}
