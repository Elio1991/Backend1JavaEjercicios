/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
con los valores ingresados por el usuario.
 */
package Ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int[] vector = new int[5];
        do {
            System.out.println("Ingrese un valor para la posición: " + (cont+1));
            vector[cont] = leer.nextInt();
            cont++;

        } while (cont < 5);

        System.out.print("[" + vector[0] + "]");
        System.out.print("[" + vector[1] + "]");
        System.out.print("[" + vector[2] + "]");
        System.out.print("[" + vector[3] + "]");
        System.out.println("[" + vector[4] + "]");
        int aux = vector[0] + vector[1] + vector[2] + vector[3] + vector[4];
        System.out.print("La suma de todos los elementos del vector es: [" + aux + "]");
        System.out.println("");
    }
}
