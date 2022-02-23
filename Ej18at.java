package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 25/1/22
 */

public class Ej18at {

  static String LUNES = "lunes";
  static String MARTES = "martes";
  static String MIÉRCOLES = "miércoles";
  static String JUEVES = "jueves";
  static String VIERNES = "viernes";
  static String SÁBADO = "sábado";
  static String DOMINGO = "domingo";

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Dime el día de la semana (1-7): ");
    int dia = s.nextInt();

    if (dia == 1) {
      System.out.print("El día es " + LUNES);
    } else if (dia == 2) {
      System.out.print("" + MARTES);
    } else if (dia == 3) {
      System.out.print("El día es " + MIÉRCOLES);
    } else if (dia == 4) {
      System.out.print("El día es " + JUEVES);
    } else if (dia == 5) {
      System.out.print("El día es " + VIERNES);
    } else if (dia == 6) {
      System.out.print("El día es " + SÁBADO);
    } else if (dia == 7) {
      System.out.print("El día es " + DOMINGO);
    } else {
      System.out.print("ERROR, número incorrecto");
    }

    s.close();
  }

}
