/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
 */
package Ejerciciosguia2;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
    int numero1, numero2 ;
        System.out.println("Ingrese dos numeros");
        Scanner sc = new Scanner (System.in);
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        System.out.println("la suma es " + (numero1 + numero2));
}
}