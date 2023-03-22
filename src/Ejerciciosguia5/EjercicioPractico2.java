/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido.

 */
package Ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class EjercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
       
       int n, numero, cont=0;
        System.out.println("Ingrese el tamaño de vector");
        n= leer.nextInt();
        int[] vector= new int [n];
        //int[] vectorNuevo = new int[];
        //probar haciendolo con un vector, para mostrar los repetidos!
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*100);
            System.out.print("[" + vector[i] + "]");       
        }
        System.out.println("");
      
        System.out.println("Ingrese el valor que desea buscar");
        numero= leer.nextInt();
        
        
        for (int i = 0; i < vector.length; i++) {
            
            if(vector[i]==numero)
              if(cont==0){
                cont++;
                System.out.println("El numero se encuentra en la posicion " + i );
                
              }else{
                 cont++;
               System.out.println("El numero se encuentra en la posicion " + i );   
              }
            
              
        }
        if(cont==0){
            System.out.println("El numero ingresado no se encontro");

        }else{
            System.out.println("El numero se repitio: " + cont);
        }
    }
    
}
