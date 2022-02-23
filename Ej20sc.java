package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 21/11/22
 */

public class Ej20sc {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("¿Cuántas monedas de 2€ tienes? ");
    int euro2 = s.nextInt();
    
    System.out.print("¿Cuántas monedas de 1€ tienes? ");
    int euro1 = s.nextInt();
    
    System.out.print("¿Cuántas monedas de 10 céntimos tienes? ");
    int centimo1 = s.nextInt();
    
    System.out.print("¿Cuántas monedas de 20 céntimos tienes? ");
    int centimo2 = s.nextInt();
    
    System.out.print("¿Cuántas monedas de 50 céntimos tienes? ");
    int centimo3 = s.nextInt();
    
    int euros = euro2 + euro1;
    double centimos = centimo1 + centimo2 + centimo3;
    
    if (centimos > 100) {
      euros++;
      System.out.print("Tienes " + euros + " € y " + centimos + " céntimos");
    } else {
      System.out.print("Tienes " + euros + "€ y " + Math.round(centimos) + " céntimos");
    }

    s.close();
  }

}
