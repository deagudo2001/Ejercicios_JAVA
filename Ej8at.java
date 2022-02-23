package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 24/1/22
 */

public class Ej8at {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime una nota: ");
    int nota = s.nextInt();
    
    System.out.print("Dime una edad: ");
    int edad = s.nextInt();
    
    System.out.print("Dime el sexo: ");
    String sexo = s.next();
    
    sexo = sexo.toUpperCase();
    
    if (nota >= 5) {
      if (edad >= 18) {
        if (sexo == "F") {
          System.out.print("ACEPTADA");
        } else {
          System.out.print("POSIBLE");
        }
      } else {
        System.out.print("NO ACEPTADA");
      }
    } else {
      System.out.print("NO ACEPTADA");
    }
    
    s.close();
  }

}
