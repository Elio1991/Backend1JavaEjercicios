/*
Escriba un programa que valide si una nota está entre 0 y 10, 
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package Ejerciciosguia3;

import java.util.Scanner;;
public class Ejercicio8Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese una nota numerica");
        float nota = leer.nextFloat();
    
        while (nota<0 || nota>10){
           System.out.println("Ingrese una nota numerica entre 0 y 10");
         nota = leer.nextFloat();
}
      
      System.out.println("La nota ingresada es: " + nota);
     }
   }
