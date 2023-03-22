/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. 
Nota: investigar la función equals() de la clase String.

 */
package Ejerciciosguia3;

import java.util.Scanner;
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Scanner leer = new Scanner(System.in);
        String letra;

        do {
            System.out.println("Ingrese una letra: ");
            letra = leer.nextLine();
        } while (letra.length() != 1);
        letra = letra.toUpperCase();
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U)")) {
            System.out.println("Tu letra es una vocal.");
        } else {
            System.out.println("Tu letra no es una vocal.");
        }

    }
    
    
}
