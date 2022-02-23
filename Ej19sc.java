package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 21/1/22
 */

public class Ej19sc {
  
  public static int CORRECT = 5;
  public static int FALLIDAS = -1;
  public static int NULAS = 0;

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime el número de respuestas correctas de 10: ");
    int correctas = s.nextInt();
    
    System.out.print("Dime el número de respuestas incorrectas de 10: ");
    int incorrectas = s.nextInt();
    
    int nota = (correctas * CORRECT) + (incorrectas * (FALLIDAS));
    
    System.out.print("Nota final: " + nota);
    
    s.close();
  }

}
