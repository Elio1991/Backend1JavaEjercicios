/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena,
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package Ejerciciosguia4;

import java.util.Scanner;




public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double moneda;
        Scanner leer = new Scanner(System.in);
        int opt;
        System.out.println("Ingrese la cantidad de EUROS");
        moneda = leer.nextDouble();

        do {
            System.out.println("MENU:");
            System.out.println("1. Cambio a dólares.");
            System.out.println("2. Cambio a yenes.");
            System.out.println("3. Cambio a libras.");
            System.out.println("4. Salir.");
            opt = leer.nextInt();

            while (opt < 1 || opt > 4) {

                System.out.println("La opcion ingresada no es valida.");
                System.out.println("Intente nuevamente");
                opt = leer.nextInt();
            }
            if (opt == 4) {
                break;
            }
            cambio(moneda, opt);

        } while (opt > 0 && opt < 4);

    }

    public static void cambio(double moneda, int opt) {

        switch (opt) {
            case 1:

                System.out.println(" la conversion a dolares es: " + (moneda * 1.28611));
                break;
            case 2:
                System.out.println(" la conversion a yenes es: " + (moneda * 129.852));
                break;
            case 3:
                System.out.println(" la conversion a libras es: " + (moneda * 0.86));
                break;

            default:
                break;

        }

    }
    }
