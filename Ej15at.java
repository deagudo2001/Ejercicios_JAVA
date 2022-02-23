package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 25/1/22
 */

public class Ej15at {

  static int PRIMERATANDA = 65;
  static int SEGUNDATANDA = 70;
  static int TERCERATANDA = 95;
  static int CUARTATANDA = 4000;

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Dime el número de alumnos que van a ir al viaje: ");
    int alumnos = s.nextInt();

    int precio = 0;

    if (alumnos >= 100) {
      precio = alumnos * PRIMERATANDA;
      System.out.print("El precio del viaje por alumno es de " + precio + " €");
    } else if (alumnos >= 50 && alumnos <= 99) {
      precio = alumnos * SEGUNDATANDA;
      System.out.print("El precio del viaje por alumno es de " + precio + " €");
    } else if (alumnos >= 30 && alumnos <= 49) {
      precio = alumnos * TERCERATANDA;
      System.out.print("El precio del viaje por alumno es de " + precio + " €");
    } else {
      precio = CUARTATANDA;
      System.out.print("El precio del viaje en autobús es de " + precio + " €");
    }

    s.close();
  }

}
