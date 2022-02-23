package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 24/1/22
 */

public class Ej7at {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Escribe la base de la potencia: ");
    int base = s.nextInt();
    
    System.out.print("Dime el exponente: ");
    int exponente = s.nextInt();
    
    if (exponente >= 1) {
      System.out.print("Resultado: " + Math.pow(base, exponente));
    } else if(exponente < 0) {
      double potencia = 1 / (Math.pow(base, exponente));
      System.out.print("Resultado: " + potencia);
    } else {
      System.out.print("El resultado es 1");
    }
    
    s.close();
  }

}
