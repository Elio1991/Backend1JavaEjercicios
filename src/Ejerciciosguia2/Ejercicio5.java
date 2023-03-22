/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 */
package Ejerciciosguia2;

import java.util.Scanner;

public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un número para el calculo");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        System.out.println("El doble de " + num1 +" es: "+num1*2);
        System.out.println("El triple de " + num1 +" es: "+num1*3);
        System.out.println("La raíz cuadrada de " + num1 + " es: "+Math.sqrt(num1));
    }
    
}
