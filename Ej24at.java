package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 26/1/22
 */

public class Ej24at {

  static String DIEZ = "Matrícula de honor";
  static String NUEVE = "Sobersaliente";
  static String SIETE = "Notable";
  static String CINCO = "Aprobado";
  static String CUATRO = "Suspenso";

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Introduce tu nota: ");
    int nota = s.nextInt();

    if (nota < 5) {
      System.out.print(CUATRO);
    } else if (nota >= 5 && nota < 7) {
      System.out.print(CINCO);
    } else if (nota >= 7 && nota < 9) {
      System.out.print(SIETE);
    } else if (nota >= 9 && nota < 10) {
      System.out.print(NUEVE);
    } else {
      System.out.print(DIEZ);
    }

    s.close();
  }

}
