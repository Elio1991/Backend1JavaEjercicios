/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo 
se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.

 */
package Ejerciciosguia3;

import java.util.Scanner;
public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        do{
            System.out.println("Ingrese una palabra o frase de 8 de largo");
         frase = leer.nextLine();
        if  (frase.length()==8){
                System.out.println("Correcto");
        }else
            System.out.println("Incorrecto");
        
        }while(frase.length()!=8 );
    
      }
    }
