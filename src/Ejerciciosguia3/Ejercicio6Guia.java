/*
Implementar un programa que le pida dos números enteros al usuario y determine
si ambos o alguno de ellos es mayor a 25.

 */
package Ejerciciosguia3;

import java.util.Scanner;


public class Ejercicio6Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros");
    int num1 = leer.nextInt();
    int num2 = leer.nextInt();
    
    if (num1>25 && num2>25){
            System.out.println("Los dos numeros ingresados son mayor a 25");
    } 
    else if(num1>25 || num2>25){
        System.out.println("Uno de los dos numeros es mayor a 25"); 
    }
    }
}
