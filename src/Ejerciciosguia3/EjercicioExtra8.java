/*
 Escriba un programa que lea números enteros. 
Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos, 
la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
Nota: recordar el uso de la sentencia break.
 */
package Ejerciciosguia3;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class EjercicioExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int totalNum = 0;
        int par = 0;
        int impar = 0;
        System.out.println("Ingrese valores numericos");
        System.out.println("###########################");
        num = leer.nextInt();

        while (num % 5 == 0) {
            System.out.println("Ingrese otro número diferente por favor");
            num = leer.nextInt();
        }

        while (num > 0) {

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            System.out.println("Ingrese otro número");
            num = leer.nextInt();
            if (num % 5 == 0) {
                System.out.println("Ha ingresado un número multiplo de 5 y la ejecución se ha detenido ");
                break;
            }
        }
        System.out.println("La cantidad de números pares es: " + par);
        System.out.println("La cantidad de números impares es: " + impar);
    }

}
