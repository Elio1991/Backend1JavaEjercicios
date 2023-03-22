/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejerciciosguia3;
import java.util.Scanner;

public class EjercicioPractico_7 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String cadena;
        String FDE = "&&&&&";
        int corr = 0;
        int inco = 0;
       do{
        do{
            System.out.println("Ingrese el codigo: "); 
            cadena = leer.nextLine();
            
        }while(cadena.length()!= (5));
         if ((cadena.toUpperCase().substring(0,1).equals("X")) && (cadena.toUpperCase().substring(4,5).equals("O"))){
             corr++;
         }else if(cadena.equals("&&&&&")){
                   System.out.println("Finalizaste.");
         }else{
             inco++;
         }
                 
        
        }while(!cadena.equals(FDE));
        System.out.println("Las correctas fueron: " +corr);
        System.out.println("Las incorrectas fueron : "+inco);
    }
}     
  