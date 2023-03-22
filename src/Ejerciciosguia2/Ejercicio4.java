/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
package Ejerciciosguia2;

import java.util.Scanner;


public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese la temperatura en °C:");
        Scanner leer = new Scanner(System.in);
            int temp = leer.nextInt();
            int F =  32 + (9 * temp / 5);
            System.out.println(F +"° Farenheit");

    }
    
}
