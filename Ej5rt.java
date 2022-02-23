package Repetitivas;

import java.util.Scanner;

public class Ej5rt {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Límite inferior: ");
    int inferior = s.nextInt();

    System.out.print("Límite superior: ");
    int superior = s.nextInt();

    while (inferior > superior) {
      System.out.println("Límite inferior: ");
      inferior = s.nextInt();
    }

    int numero = 0;
    int suma = 0;
    int fuera_intervalo = 0;
    int igual_intervalo = 0;
    
    do {
      System.out.print("Dime un número (introduce 0 para salir): ");
      numero = s.nextInt();
    }
    while (numero != 0);
    
    System.out.println("Suma: " + suma);
    System.out.println("Números fuera del intervalo: " + fuera_intervalo);
    System.out.println("Números iguales a los intervalos: " + igual_intervalo);

    s.close();
  }

}
