/*
Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro. 
Después haremos otra función o procedimiento que imprima el vector.

 */
package Ejerciciosguia5;

/**
 *
 * @author Elio
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] vector = new int[6];
       llenarVector(vector);
       mostrarVector(vector);
        System.out.println("");
    }
    public static void llenarVector( int vector[]){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()* 10 );
            
        }
   
    }
    public static void mostrarVector( int vector[]){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
            
        }
    }
}
