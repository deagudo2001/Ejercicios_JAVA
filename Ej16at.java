package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 25/1/22
 */

public class Ej16at {

  static double DOMINGO = 0.30;
  static double DIA = 0.15;
  static double TARDE = 0.10;

  static double CINCOM = 1.00;
  static double TRESM = 0.80;
  static double DOSM = 0.70;
  static double DIEZM = 0.50;

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Dime si es domingo o no (S/N): ");
    String domingo = s.next();

    System.out.print("Dime si es turno de mañana o tarde (M/T): ");
    String turno = s.next();

    System.out.print("Dime el tiempo de la llamada (minutos): ");
    int minutos = s.nextInt();

    double precio = 0;
    domingo = domingo.toUpperCase();
    turno = turno.toUpperCase();

    if (minutos <= 5) {
      if (domingo == "S") {
        precio = minutos * CINCOM * DOMINGO;
        System.out.print("El precio de tu llamada es: " + precio);
      } else {
        if (turno == "M") {
          precio = minutos * CINCOM * DIA;
          System.out.print("El precio de tu llamada es: " + precio);
        } else {
          precio = minutos * CINCOM * TARDE;
          System.out.print("El precio de tu llamada es: " + precio);
        }
      }
    } else if (minutos > 5 && minutos <= 8) {
      if (domingo == "S") {
        precio = minutos * (CINCOM + TRESM) * DOMINGO;
        System.out.print("El precio de tu llamada es: " + precio);
      } else {
        if (turno == "M") {
          precio = minutos * (CINCOM + TRESM) * DIA;
          System.out.print("El precio de tu llamada es: " + precio);
        } else {
          precio = minutos * (CINCOM + TRESM) * TARDE;
          System.out.print("El precio de tu llamada es: " + precio);
        }
      }
    } else if (minutos > 8 && minutos <= 10) {
      if (domingo == "S") {
        precio = minutos * (CINCOM + TRESM + DOSM) * DOMINGO;
        System.out.print("El precio de tu llamada es: " + precio);
      } else {
        if (turno == "M") {
          precio = minutos * (CINCOM + TRESM + DOSM) * DIA;
          System.out.print("El precio de tu llamada es: " + precio);
        } else {
          precio = minutos * (CINCOM + TRESM + DOSM) * TARDE;
          System.out.print("El precio de tu llamada es: " + precio);
        }
      }
    } else if (minutos > 10){
      if (domingo == "S") {
        precio = minutos * (CINCOM + TRESM + DOSM + DIEZM) * DOMINGO;
        System.out.print("El precio de tu llamada es: " + precio);
      } else {
        if (turno == "M") {
          precio = minutos * (CINCOM + TRESM + DOSM + DIEZM) * DIA;
          System.out.print("El precio de tu llamada es: " + precio);
        } else {
          precio = minutos * (CINCOM + TRESM + DOSM + DIEZM) * TARDE;
          System.out.print("El precio de tu llamada es: " + precio);
        }
      }
    } else {
      System.out.print("El precio es 0.");
    }

    s.close();
  }

}
