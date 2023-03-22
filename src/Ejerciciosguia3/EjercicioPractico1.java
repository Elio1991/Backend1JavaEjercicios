/*
 Crear un programa que dado un número determine si es par o impar.
 */
package Ejerciciosguia3;

import java.util.Scanner;


public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es par o impar");
     int num1 = leer.nextInt();
     if (num1%2==0){
         System.out.println("El número es par");
     }else
     System.out.println("El número es impar");
    }    
}
