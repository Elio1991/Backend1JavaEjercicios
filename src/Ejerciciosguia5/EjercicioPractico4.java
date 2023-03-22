/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
            | 1 | 0 | 4 |                   | 1 | 0 | 6 |
 MATRIZ A   | 0 | 5 | 0 |         MATRIZ B  | 0 | 5 | 0 |
            | 6 | 0 |-9 |                   | 4 | 0 |-9 |
 */
package Ejerciciosguia5;

/**
 *
 * @author Elio
 */
public class EjercicioPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz;
        matriz = new int[3][3];
        System.out.println("Matriz Original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 9);
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("Matriz Traspuesta");
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }
    }

}
