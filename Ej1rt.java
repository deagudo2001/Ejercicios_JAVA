package Repetitivas;

import java.util.Scanner;

public class Ej1rt {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    double num_ale = Math.random()*100+ 1;

    System.out.println("Adivina el número.");
    System.out.println("Tienes 10 intentos");
    int intentos = 10;

    System.out.print("Dime el número que piense que es: ");
    int num = s.nextInt();

    if (num == num_ale) {
      System.out.print("GANASTE!!");
      System.out.print("Tus " + intentos + " intentos quedaron impolutos");
    } 

    while (num != num_ale) {
        intentos--;
        System.out.println("El número es menor.");
        System.out.println("Intentos: " + intentos);
        System.out.print("Dime el número que piense que es: ");
    }

    s.close();
  }

}
