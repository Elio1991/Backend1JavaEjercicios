/*
 Realice un programa que calcule y visualice el valor máximo, 
el valor mínimo y el promedio de n números (n>0). 
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.

 */
package Ejerciciosguia3;

import java.util.Scanner;
//@author Elio

public class EjercicioExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int num2;
        int numMax = 0;
        int numMin = 0;
        int aux = 0;
        int aux1 = 0;
        float promedio;
        int cont = 0;
        do {
            System.out.println("cuantos números desea ingresar? (entre 1 y 10)");
            num = leer.nextInt();
            if (num < 1 || num > 10) {
                System.out.println("Ingrese un número válido");
            }
        } while (num < 1 || num > 10);

        while (cont < num) {
            
                System.out.println("Ingrese el valor de los números ");
                num2 = leer.nextInt();
                aux = aux + num2;
                cont++;

                if (num2 > numMax) {
                    numMax = num2;
                }
                if (cont == 1) {
                    numMin = num2;
                }
                if (num2 < numMin) {
                    numMin = num2;
                }
            
        }
        promedio = (float) aux / num;
        System.out.println("El promedio de todos los números ingresados es: " + promedio);
        System.out.println("El valor minimo ingresado es de: " + numMin);
        System.out.println("El valor máximo ingresado es de: " + numMax);
    }
}
    /*    Scanner leer = new Scanner(System.in);
        int num;
        int num2;
        int numMax = 0;
        int numMin = 0;
        int aux = 0;
        int aux1 = 0;
        float promedio;
        int cont = 0;
        do {
            System.out.println("cuantos números desea ingresar? (entre 1 y 10)");
            num = leer.nextInt();
            if (num < 1 || num > 10) {
                System.out.println("Ingrese un número válido");
            }
        } while (num < 1 || num > 10);

        do {System.out.println("Ingrese el valor de los números ");
            num2 = leer.nextInt();
            aux = aux + num2;
            cont++;
            if (num2>numMax){
            numMax = num2;
            }
            if (cont==1){
            numMin = num2;
            }
            if (num2<numMin){
            numMin = num2;
            }
        } while (cont!=num);
         promedio = (float)aux / num; 
        System.out.println("El promedio de todos los números ingresados es: " + promedio);
        System.out.println("El valor minimo ingresado es de: " + numMin);
         System.out.println("El valor máximo ingresado es de: " + numMax);
    }
}
*/
