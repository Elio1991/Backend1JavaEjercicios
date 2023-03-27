/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres.
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java:
substring(), Length() y Math.random().
 */
package Ejerciciosguia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class EjercicioExtra_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
               
        String[] palabras = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese una palabra de 3 a 5 caracteres: ");
            palabras[i] = input.nextLine();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.print("Error. Ingrese una palabra de 3 a 5 caracteres: ");
                palabras[i] = input.nextLine();
            }
        }
               
        char[][] sopa = new char[20][20];
        Random rand = new Random();
        int fila = rand.nextInt(20);
        int columna = rand.nextInt(16);
        int palabraSeleccionada = rand.nextInt(5);
        String palabra = palabras[palabraSeleccionada];
        for (int i = 0; i < palabra.length(); i++) {
            sopa[fila][columna+i] = palabra.charAt(i);
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char) (rand.nextInt(10) + '0');
                }
            }
        }
                
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }

}
    
    

