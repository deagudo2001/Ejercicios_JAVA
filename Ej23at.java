package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 25/1/22S
 */

public class Ej23at {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Dime un número: ");
    int n1 = s.nextInt();

    System.out.print("Dime otro número: ");
    int n2 = s.nextInt();

    System.out.print("Dime otro número: ");
    int n3 = s.nextInt();

    System.out.print("Dime otro número: ");
    int n4 = s.nextInt();

    System.out.print("Dime otro número: ");
    int n5 = s.nextInt();

    int d4 = Math.abs(n1 - n5);
    int d3 = Math.abs(n1 - n4);
    int d2 = Math.abs(n1 - n3);
    int d1 = Math.abs(n1 - n2);

    int ncercano = 0;

    if (d1 < d2 && d1 < d3 && d1 < d4) {
      ncercano = n2;
      System.out.print("El número más cercano al " + n1 + " es " + ncercano);
    } else if (d2 < d1 && d2 < d3 && d2 < d4) {
      ncercano = n3;
      System.out.print("El número más cercano al " + n1 + " es " + ncercano);
    } else if (d3 < d1 && d3 < d2 && d3 < d4) {
      ncercano = n4;
      System.out.print("El número más cercano al " + n1 + " es " + ncercano);
    } else {
      ncercano = n5;
      System.out.print("El número más cercano al " + n1 + " es " + ncercano);
    }

    s.close();
  }

}
