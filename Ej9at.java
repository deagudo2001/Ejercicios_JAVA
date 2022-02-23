package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 24/1/22
 */

public class Ej9at {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Dime un carácter: ");
    String ch = s.next();

    ch = ch.toUpperCase();

    int longitud = ch.length();

    if (longitud > 1) {
      System.out.print("ERROR, Sólo tienes que introducir uno");
    } else if (ch.equals("A") || ch.equals("E") || ch.equals("I") || ch.equals("O") || ch.equals("U")) {
      System.out.print("Es una letra");
    } else if (ch.equals("0") || ch.equals("1") || ch.equals("2") || ch.equals("3") || ch.equals("4") || ch.equals("5") || ch.equals("6") || ch.equals("7") || ch.equals("8") || ch.equals("9")){
      System.out.print("Es un dígito");
    } else {
      System.out.print("Es un signo de puntuación");
    }

    s.close();
  }

}
