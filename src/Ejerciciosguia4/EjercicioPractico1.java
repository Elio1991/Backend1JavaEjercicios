/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática
y deben devolver sus resultados para imprimirlos en el main. 

 */
package Ejerciciosguia4;

import java.util.Scanner;


public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        int num1;
        int num2;
        int opt;

        do { System.out.println("Ingrese dos numeros");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opción");

            opt = leer.nextInt();
            menuopt(opt, num1, num2);
            if (opt == 5) {
                break;
            }
            if (opt > 5){
                System.out.println("La opción ingresada no es valida");
            }
        } while (opt > 0 || opt < 6);

        

    }

    public static void menuopt(int opt, int num1, int num2) {
        switch (opt) {
            case 1:
                System.out.println("El resultado de la suma es: ");
                System.out.println(suma(num1, num2));;
                break;
            case 2:
                System.out.println("El resultado de la resta es: ");
                 System.out.println(resta(num1, num2));;
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: ");
                 System.out.println(mult(num1, num2));;
                break;
            case 4:
                System.out.println("El resultado de la división es: ");
                 System.out.println(div(num1, num2));;
                break;
                
        }
    }

    public static int suma(int a, int b) {
        return (a + b);
    }

    public static int resta(int a, int b) {
        return (a - b);
    }

    public static int mult(int a, int b) {
        return (a * b);
    }

    public static double div(int a, int b) {
        return (a / b);
    }
    }
    

