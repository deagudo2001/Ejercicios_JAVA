package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 20/1/22
 */

public class Ej9sc {
  
  public static double DESCUENTO = 0.15;

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime el precio de tu compra: ");
    double compra = s.nextDouble();
    
    double DESCAPLICADO = compra * DESCUENTO;
    double DESCFINAL = compra - DESCAPLICADO;
    
    System.out.println("El precio de tu compra final es: " + DESCFINAL + " €");
    System.out.println("Tu descuento ha sido de " + DESCAPLICADO + " €"); 
    
    s.close();
  }

}
