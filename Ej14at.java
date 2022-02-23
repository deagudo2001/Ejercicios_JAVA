package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 25/1/22
 */

public class Ej14at {

  static double TIPOA1 = 0.20;
  static double TIPOA2 = 0.30;
  static double TIPOB1 = 0.30;
  static double TIPOB2 = 0.50;

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Dime cúantos kg de uva tienes: ");
    double kg = s.nextInt();

    System.out.print("¿De qué tamaño es la uva? (1/2) ");
    int tam = s.nextInt();
    
    System.out.print("¿De qué tipo es la uva? (A/B) ");
    String tipo = s.next();

    tipo = tipo.toUpperCase();
    double ganancia = 0;

    if (tam == 1 && tipo.equals("A")) {
      ganancia = TIPOA1 * kg;
      System.out.print("Ganancias obtenidas: " + ganancia + " €");
    } else if (tam == 1 && tipo.equals("B")) {
      ganancia = TIPOB1 * kg;
      System.out.print("Ganancias obtenidas: " + ganancia + " €");
    } else if (tam == 2 && tipo.equals("A")) {
      ganancia = TIPOA2 * kg;
      System.out.print("Ganancias obtenidas: " + ganancia + " €");
    } else {
      ganancia = TIPOB2 * kg;
      System.out.print("Ganancias obtenidas: " + ganancia + " €");
    }

    s.close();
  }

}
