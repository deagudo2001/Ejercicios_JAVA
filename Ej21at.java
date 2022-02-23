package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 25/1/22
 */

public class Ej21at {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Dime un número: ");
    int n1 = s.nextInt();

    System.out.print("Dime otro número: ");
    int n2 = s.nextInt();

    System.out.print("Dime otro número: ");
    int n3 = s.nextInt();

    if (n1 > n2 && n1 > n3) {
      System.out.print("El número mayor es " + n1);
    } else if (n2 > n1 && n2 > n3) {
      System.out.print("El número mayor es " + n2);
    } else {
      System.out.print("El número mayor es " + n3);
    }

    s.close();
  }

}
