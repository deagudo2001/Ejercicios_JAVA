package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 25/1/22
 */

public class Ej19at {

  static String ENERO = "enero";
  static String FEBRERO = "febrero";
  static String MARZO = "marzo";
  static String ABRIL = "abril";
  static String MAYO = "mayo";
  static String JUNIO = "junio";
  static String JULIO = "julio";
  static String AGOSTO = "agosto";
  static String SEPTIEMBRE = "septiembre";
  static String OCTUBRE = "octubre";
  static String NOVIEMBRE = "noviembre";
  static String DICIEMBRE = "diciembre";

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Dime un número para saber el mes: ");
    int mes = s.nextInt();

    if (mes == 1) {
      System.out.print("Mes: " + ENERO);
    } else if (mes == 2) {
      System.out.print("Mes: " + FEBRERO);
    } else if (mes == 3) {
      System.out.print("Mes: " + MARZO);
    } else if (mes == 4) {
      System.out.print("Mes: " + ABRIL);
    } else if (mes == 5) {
      System.out.print("Mes: " + MAYO);
    } else if (mes == 6) {
      System.out.print("" + JUNIO);
    } else if (mes == 7) {
      System.out.print("" + JULIO);
    } else if (mes == 8) {
      System.out.print("" + AGOSTO);
    } else if (mes == 9) {
      System.out.print("" + SEPTIEMBRE);
    } else if (mes == 10) {
      System.out.print("" + OCTUBRE);
    } else if (mes == 11) {
      System.out.print("" + NOVIEMBRE);
    } else if (mes == 12) {
      System.out.print("" + DICIEMBRE);
    } else {
      System.out.print("Número de mes no válido");
    }

    s.close();
  }

}
