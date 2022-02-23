package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 25/1/22
 */

public class Ej22at {

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

    if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
      System.out.print("El número mayor es " + n1);
    } else if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) {
      System.out.print("El número mayor es " + n2);
    } else if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
      System.out.print("El número mayor es " + n3);
    } else if (n4 > n1 && n4 > n3 && n4 > n2 && n4 > n5) {
      System.out.print("El número mayor es " + n4);
    } else {
      System.out.print("El número mayor es " + n5);
    }

    s.close();
  }

}
