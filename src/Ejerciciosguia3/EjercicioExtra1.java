/*
Dado un tiempo en minutos, calcular su equivalente en días y horas.
Por ejemplo, si el usuario ingresa 1600 minutos, 
el sistema debe calcular su equivalente: 1 día, 2 horas.

 */
package Ejerciciosguia3;

import java.util.Scanner;

public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tiempo en minutos");
        int num = leer.nextInt();
        int dias = 0;
        int horas = 0;
        while (num >= 1440){
          dias++;
          num-=1440;

                  }
        while (num >=60){
            horas++;
            num-=60;
                  
        }
        System.out.println("El total es: " + dias + " Dia/s, "+ horas + " Horas" );
        }
    }
