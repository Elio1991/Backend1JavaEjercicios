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
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             String[][] matriz = new String[20][20];
      int [] vectorAleatorio = new int [20];
      
      for (int i = 0; i < 20; i++) {
        vectorAleatorio[i]=21; 
        
        
        
      RellenodeMatriz(matriz);
      LlenarPalabras(matriz,vectorAleatorio);
      Mostrar(matriz);
      
    }
      
    }
    
public static void RellenodeMatriz(String matriz[][]){
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            matriz[i][j]= "*";
            
        }
 
    }
}    
public static void LlenarPalabras(String matriz[][],int vectorAleatorio[]){
    Scanner leer = new Scanner(System.in);
    
    String palabra = "";
    int ind = 0;
    int fila = 0;
    
    do{
        System.out.println("Ingrese una palabra de minimo 3 y hasta 5 caracteres.");
        palabra = leer.next();
        int cont = 0;
        if (palabra.length() > 2 || palabra.length() < 5) {
           
        Aleatorio(vectorAleatorio);
                for (int i = 0; i < 10; i++) {
                for (int j = 0; j < matriz.length; j++) {
               matriz[i][j] = palabra.substring(cont, (cont+1));
                cont++;
              }  
            }
           ind++; 
        }else{
            System.out.println("La palabra es demasiado larga.");
        }
        
}while(ind<5);
}
public static int Aleatorio(int vectorAleatorio[]){
    Random random = new Random();
   
    int retorno=0;
    int cont=0;
    retorno = random.nextInt(20);
    int r =0;
    do {
    for (int i = 0; i < 20; i++) {
        if (retorno == vectorAleatorio[i]) {
         r=1;   
        }
    }
    } while (r!=0);
    
    do {
        cont++;
    } while (vectorAleatorio[cont] !=21);
    
    
    
        return retorno;
        
    
}

public static void Mostrar(String matriz[][]){
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            System.out.print(matriz[i][j]);
            
        }
        System.out.println("");
    }
}
}
    
