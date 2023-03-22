/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 99999);
            System.out.print( "[" + vector[i] + "]");
        }
        int cont, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0;
        int var;

        for (int i = 0; i < vector.length; i++) {
            cont = 0;
            var = vector[i];

            while (var > 0) {
                var = (int) var / 10;
                cont++;
            }
            switch (cont) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;

            }
        }
        System.out.println("");
        System.out.println("Se encontraron " + cont1 + " de un dígito");
        System.out.println("Se encontraron " + cont2 + " de dos dígitos");
        System.out.println("Se encontraron " + cont3 + " de tres dígitos");
        System.out.println("Se encontraron " + cont4 + " de cuatro dígitos");
        System.out.println("Se encontraron " + cont5 + " de cinco dígitos");
    }

}
