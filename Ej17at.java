package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 25/1/22
 */

public class Ej17at {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Dime el número que has obtenido al lanzar el dado: ");
    int dado = s.nextInt();

    if (dado == 1) {
      System.out.print("El opuesto es 6");
    } else if (dado == 2) {
      System.out.print("El opuesto es 5");
    } else if (dado == 3) {
      System.out.print("El opuesto es 4");
    } else if (dado == 4) {
      System.out.print("El opuesto es 3");
    } else if (dado == 5){
      System.out.print("El opuesto es 2");
    } else if (dado == 6) {
      System.out.print("El opuesto es 1");
    } else {
      System.out.print("ERROR: número incorrecto");
    }

    s.close();
  }

}
