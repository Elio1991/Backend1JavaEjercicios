/*
 Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. 
Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

 */
package Ejerciciosguia5;

import java.util.Random;

/**
 *
 * @author Elio
 */
public class EjercicioPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz;
        int max;
        Random random = new Random();
        matriz = new int[3][3];
        System.out.println("Matriz Original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 9);
                max = random.nextInt(2);
                if (max == 1) {
                    matriz[i][j] = (matriz[i][j] * -1);
                }
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        boolean bucle = true;
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] != -matriz[i][j]) {
                    bucle = false;
                    break;
                }

            }

        }
        if (bucle) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }
}
