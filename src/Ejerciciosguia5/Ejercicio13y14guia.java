/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo
y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.

 */
package Ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class Ejercicio13y14guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] Equipo = {"Caro","Jose","Marcelo"};
        String aux = "";
        for (String elemento:Equipo) {
            aux+= elemento + ", ";
          
        }
         System.out.println(aux);
    }
    
}
