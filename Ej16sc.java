package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 20/1/22
 */

public class Ej16sc {
  
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime la velocidad del vehículo más lento(km/h): ");
    int v1 = s.nextInt();
    
    System.out.print("Dime la velocidad del otro vehículo (km/h): ");
    int v2 = s.nextInt();
    
    System.out.print("Dime la distancia entre los coches (km): ");
    double distance = s.nextDouble();
    
    double t = (distance / (v2 - v1)) * 10;
    
    System.out.print("Lo alcanzará en " + t + " minutos");

    s.close();
  }

}
