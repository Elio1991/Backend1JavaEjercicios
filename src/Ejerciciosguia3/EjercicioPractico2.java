/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
 */
package Ejerciciosguia3;

import java.util.Scanner;
public class EjercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese la palabra 'magica'");
        String palabra = leer.nextLine();
       if(palabra.toLowerCase().equals("eureka")){
           System.out.println("Correcto");
       }else
            System.out.println("Incorrecto");
    }
}
