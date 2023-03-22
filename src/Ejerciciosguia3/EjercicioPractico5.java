/*
Bucles y sentencias de salto break y continue.
Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario 
hasta que la suma de los números introducidos supere el límite inicial.

 */
package Ejerciciosguia3;

import java.util.Scanner;
public class EjercicioPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese un valor límite positivo");
        int num = leer.nextInt();
        int suma = 0;
        int num1;
        do {
            System.out.println("Ingrese un número ");
             num1 = leer.nextInt();
            if (suma<num){
                suma = suma + num1;
            }else
                break;
        }while(suma<num); 
        System.out.println("La suma total es: " + suma + " superando el límite inicial de: " + num);
    }
}   

