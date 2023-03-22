/*
 Escriba un programa que lea 20 números. 
Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje:
"Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.

 */
package Ejerciciosguia3;

import java.util.Scanner;

public class Ejercicio9Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int resultado = 0;
         int contador = 0;
         int num;
     Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese 20 numeros");
        do {
            
        num = leer.nextInt();
         contador++;
            if(num>0){
               resultado = resultado + num;
            }
            if(contador>=20){
                break;
            }
         
        }while(num!=0); 
            System.out.println("Se capturo el numero cero");
            System.out.println("Total de la suma " + resultado);
    }
    }         


        
        
    

