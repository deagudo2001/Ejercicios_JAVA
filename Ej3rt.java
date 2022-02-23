package Repetitivas;

import java.util.Scanner;

public class Ej3rt {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Dime una vocal (introduce un espacio para acabar): ");
    String voc = s.next();

    while (voc.length()!=1) {
      System.out.print("Dime una vocal (introduce un espacio para acabar): ");
      voc = s.next();
    }

    voc = voc.toLowerCase();

    while (!voc.equals(" ")) {
      if (voc.equals("a") || voc.equals("e") || voc.equals("i") || voc.equals("o") || voc.equals("u")) {
        System.out.print("Es una vocal");
      } else {
        System.out.print("No es una vocal");
      }
      while (voc.length()!=1) {
        System.out.print("Dime una vocal (introduce un espacio para acabar): ");
        voc = s.next();
      }
    } 
    s.close();
  }

}
