/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejerciciosguia3;

import java.util.Scanner;
public class EjercicioPractico_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    

        System.out.println("Ingrese la cantidad de *: ");
        Scanner leer=new Scanner(System.in);
        int N = leer.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if(i>1 && i<N && j>1 && j<N){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
                
            }
            System.out.println(" "); 
        }
    }
    
}
