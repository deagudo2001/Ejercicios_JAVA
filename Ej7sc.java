package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 28/12/2021
 */

public class Ej7sc {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime una cantidad de minutos: ");
    int minutos = s.nextInt();
    
    double h = minutos / 60;
    double minutes = minutos % 60;
    
    System.out.print(String.format("%.0f", h) + " h y " + String.format("%.0f", minutes)  + " minutos");
    
    s.close();
  }

}
