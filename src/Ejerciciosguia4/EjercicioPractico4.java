/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejerciciosguia4;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class EjercicioPractico4 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número para saber si es primo: ");
        int num = leer.nextInt();
        boolean resultado;
        resultado = primos(num);
        System.out.println("El resultado es: " + resultado);
    }

      public static boolean primos(int num) {
        if (num < 1) {
            return false;
        } else if (num == 2) {
            return true;
        } else {
            int cont = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
           return true;
      }
    }
}
