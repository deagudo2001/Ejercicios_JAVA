package Repetitivas;

import java.util.Scanner;

public class Ej2rt {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Dime la cantidad de números que quieres introducir: ");
    int nums = s.nextInt();

    int num = 0;
    int c_p = 0;
    int c_n = 0;
    int c = 0;

    for (int i = 0; i <= nums; i++) {
      System.out.print("Dime un número: ");
      num = s.nextInt();

      if (num == 0) {
        c = c+1;
      } else if (num < 0) {
        c_n = c_n+1;
      } else {
        c_p = c_p+1;
      }
    }
    System.out.println("" + c + " números iguales que 0");
    System.out.println("" + c_n + " números menores que 0");
    System.out.print("" + c_p + " números mayores que 0");

    s.close();
  }

}
