package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 25/1/22
 */

public class Ej13at {

  public static int QUINIENTOS = 500;
  public static int DOSCIENTOS = 200;
  public static int CIEN = 100;
  public static int CINCUENTA = 50;
  public static int VEINTE = 20;
  public static int DIEZ = 10;
  public static int CINCO = 5;
  public static double DOS = 2;
  public static int UNO = 1;

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Dime el dinero que tienes: ");
    int dinero = s.nextInt();

    int c = 0;

    if (dinero % QUINIENTOS == 0) {
      c++;
      System.out.print(c + " billetes de " + QUINIENTOS);
    } else if (dinero % DOSCIENTOS == 0) {
      c++;
      System.out.print(c + " billetes de " + DOSCIENTOS);
    } else if (dinero % CIEN == 0) {
      c++;
      System.out.print(c + " billetes de " + CIEN);
    } else if (dinero % CINCUENTA == 0) {
      c++;
      System.out.print(c + " billetes de " + CINCUENTA);
    } else if (dinero % VEINTE == 0) {
      c++;
      System.out.print(c + " billetes de " + VEINTE);
    } else if (dinero % DIEZ == 0) {
      c++;
      System.out.print(c + " billetes de " + DIEZ);
    } else if (dinero % CINCO == 0) {
      c++;
      System.out.print(c + " billetes de " + CINCO);
    } else if (dinero % DOS == 0) {
      c++;
      System.out.print(c + " monedas de " + DOS);
    } else if (dinero % UNO == 0) {
      c++;
      System.out.print(c + " monedas de " + UNO);
    }

    s.close();
  }

}
