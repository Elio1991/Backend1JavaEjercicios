/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package Ejerciciosguia3;

import java.util.Scanner;


public class EjercicioPractico8 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado:");
        int num = leer.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || j == 0 || j == num - 1 || i == num - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
    
    

