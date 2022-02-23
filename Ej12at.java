package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 25/1/22
 */

public class Ej12at {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Escribe un año: ");
    int year = s.nextInt();

    if (year % 4 == 0 || year % 400 == 0 && !(year % 100 == 0)) {
      System.out.print("El año es bisiesto");
    } else {
      System.out.print("El año no es bisiesto");
    }

    s.close();
  }

}
