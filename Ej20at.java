package Alternativas;

import java.util.Scanner;

/*
 * Fecha: 25/1/22
 */

public class Ej20at {

  static int AMN = 24;
  static int AMC = 20;
  static int AMS = 21;
  static int ASIA = 18;
  static int EUROPA = 10;

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("ZONA |    UBICACIÓN      | COSTO/GRAMO");
    System.out.println("---------------------------------------");
    System.out.println("1    | América del Norte |    24€");
    System.out.println("2    | América Central   |    20€");
    System.out.println("3    | América del Sur   |    21€");
    System.out.println("4    |      Asia         |    18€");
    System.out.println("5    |     Europa        |    10€");

    System.out.print("Dime la zona a la que quieres enviar el paquete: ");
    int zona = s.nextInt();

    System.out.print("Dime el peso del paquete: ");
    double peso = s.nextDouble();

    double precio = 0;

    if (peso > 5) {
      System.out.print("El peso indicado no es permitido");
    } else {
      if (zona == 1) {
        precio = AMN * peso;
        System.out.print("El precio para tu envío es " + precio + " €");
      } else if (zona == 2) {
        precio = peso * AMC;
        System.out.print("El precio para tu envío es " + precio + " €");
      } else if (zona == 3) {
        precio = AMS * peso;
        System.out.print("El precio para tu envío es " + precio + " €");
      } else if (zona == 4) {
        precio = ASIA * peso;
        System.out.print("El precio para tu envío es " + precio + " €");
      } else if (zona == 5) {
        precio = EUROPA * peso;
        System.out.print("El precio para tu envío es " + precio + " €");
      } else {
        System.out.print("La zona elegida no existe");
      }
    }

    s.close();
  }

}
