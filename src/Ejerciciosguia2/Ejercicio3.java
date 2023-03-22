/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java. 
*/
package Ejerciciosguia2;

import java.util.Scanner;


public class Ejercicio3 {

   
    public static void main(String[] args) {
       System.out.println("ingrese una frase");   
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        System.out.println("la frase original es " + frase );
        System.out.println("la frase en mayuscula es "+ frase.toUpperCase());
        System.out.println("la frase en miniscula es "+ frase.toLowerCase());
    }
    
}
