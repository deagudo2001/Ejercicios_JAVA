package Secuenciales;

import java.util.Scanner;

/*
 * Fecha: 21/1/22
 */

public class Ej17sc {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime la hora de salida de la ciudad A: ");
    int hsalida = s.nextInt();
    
    System.out.print("Dime los minutos de la salida de la ciudad A: ");
    int msalida = s.nextInt();
    
    System.out.print("Dime los segundos de la salida de la ciudad A: ");
    int ssalida = s.nextInt();
    
    System.out.print("Dime los segundos que ha tardado en llegar a B: ");
    int t = s.nextInt();
    
    // Conversión
    int sinicial = hsalida * 3600 + msalida * 60 + ssalida;
    int sfinal = sinicial + t;
    
    // Conversión a tiempo real
    int hllegada = sfinal / 3600;
    int mllegada = (sfinal % 3600) / 60;
    int sllegada =(sfinal % 3600) % 60;
    
    System.out.print("La hora de llegada a la ciudad B es de: " + hllegada + ":" + mllegada  + ":" + sllegada);
    
    s.close();
  }

}
