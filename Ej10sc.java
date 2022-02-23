package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 20/1/22
 */

public class Ej10sc {

  public static double PARCIALES = 0.55;
  public static double EXAMENFINAL = 0.30;
  public static double TRABAJOFINAL = 0.15;
  
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime tu nota del primer parcial: ");
    double uno = s.nextDouble();
    
    System.out.print("Dime tu nota del segundo parcial: ");
    double dos = s.nextDouble();
    
    System.out.print("Dime tu nota del tercer parcial: ");
    double tres = s.nextDouble();
    
    System.out.print("Dime tu nota del examen final de Algoritmos: ");
    double notaexamen = s.nextDouble();
    
    System.out.print("Dime tu nota del trabajo final: ");
    double trabajo = s.nextDouble();
    
    double NOTAPARCIALES = PARCIALES * (uno + dos + tres);
    double NOTAEXAMEN = EXAMENFINAL * notaexamen;
    double NOTATRABAJO = TRABAJOFINAL * trabajo;
    
    double FINAL = NOTAPARCIALES + NOTAEXAMEN + NOTATRABAJO;
    
    System.out.print("Tu calificación final es: " + String.format("%.2f", FINAL));
    
    s.close();
  }

}
