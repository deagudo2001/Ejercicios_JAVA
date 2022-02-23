package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 25/1/22
 */

public class Ej10at {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Primera circunferencia
    System.out.print("Dime la primera coordenada x: ");
    int x1 = s.nextInt();

    System.out.print("Dime la segunda coordenada x: ");
    int x2 = s.nextInt();

    System.out.print("Dime la primera coordenada r: ");
    int r1 = s.nextInt();

    // Segunda circunferencia
    System.out.print("Dime la primera coordenada y:");
    int y1 = s.nextInt();

    System.out.print("Dime la segunda coordenada y:");
    int y2 = s.nextInt();

    System.out.print("Dime la segunda coordenada r: ");
    int r2 = s.nextInt();

    int difradios = r2 - r1;

    // Exteriores
    if (x1 < x2 || y1 < y2 && difradios == r2) {
      System.out.print("Son circunferencias exteriores");
    }
    // Interiores
    else if (x1 > x2 || y1 > y2 && difradios == r1) {
      System.out.print("Son circunferencias interiores");
    }
    // Tangentes interiores
    else if (x1 == x2 && y1 > y2 || x1 > x2 && y1 == y2 || x1 < x2 && y1 == y2 || x1 == x2 && y1 < y2) {
      System.out.print("Son circunferencias tangentes interiores");
    }
    // Tangentes exteriores
    else if () {
      System.out.print("Son circunferencias tangentes exteriores");
    }
    // Secantes
    else if () {
      System.out.print("Son circunferencias secantes");
    }
    // Concéntricas
    else if () {
      System.out.print("Son circunferencias concéntricas");
    }
    else {
      System.out.print("No son circunferencias");
    }

    s.close();    
  }

}
