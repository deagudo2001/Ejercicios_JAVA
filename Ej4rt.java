package Repetitivas;

import java.util.Scanner;

public class Ej4rt {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Dime el primer número para comenzar: ");
    int num1 = s.nextInt();

    System.out.println("Dime el segundo número para terminar: ");
    int num2 = s.nextInt();

    int c = 0;
    
    for (int i = num1; i < num2; i++) {
      if (i % 2 == 0) {
        c++;
        System.out.println("Números pares " + i);
      }
    }
    System.out.println("Total " + c);

    s.close();
  }

}
