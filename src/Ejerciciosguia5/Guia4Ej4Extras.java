/*
 * Los profesores del curso de programación de Egg necesitan llevar un registro
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
 * aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
 * notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las
 * ponderaciones de cada nota son: Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15% Primer Integrador 25% Segundo
 * integrador 50% Una vez cargadas las notas, se calcula el promedio y se guarda
 * en el arreglo. Al final del programa los profesores necesitan obtener por
 * pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo
 * aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso
 *
 *
 */
package Ejerciciosguia5;



/**
 
 * @author pablcastro
 */
public class Guia4Ej4Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int [][] numeros = {{6,7,5},{3, 8, 4}, {1,0,2}, {9,5,2}};
        double[][] Matriz = {{6, 7, 5, 7, 0}, {3, 8, 4, 7, 0}, {1, 0, 2, 7, 0}, {9, 5, 2, 7, 0}, {6, 7, 5, 6, 0}, {3, 8, 4, 6, 0}, {1, 0, 2, 6, 0}, {6, 7, 5, 6, 0}, {1, 0, 2, 7, 0}, {6, 7, 5, 8, 0}};
        double suma = 0;
        int aprob=0;
        int i = 0;
        do {
            for (int j = 0; j < 5; j++) {
                switch (j) {
                    case 0:
                        suma += (Matriz[i][j] * 1.1);
                        continue;
                    case 1:
                        suma += (Matriz[i][j] * 1.15);
                        continue;
                    case 2:
                        suma += (Matriz[i][j] * 1.25);
                        continue;
                    case 3:
                        suma += (Matriz[i][j] * 1.50);
                        continue;
                    case 4:
                        Matriz[i][j] = (suma / 4);
                }
            }
            suma = 0;
            i++;
        } while (i != 10);
        System.out.println(" ");
        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + Matriz[i][j] + "]");
            }
            System.out.println(" ");

        }
        for (i = 0; i < 10; i++) {
             {
                if (Matriz[i][4] >= 7) {
                    aprob++;
                }
            }
            
            
        }
        System.out.println(" ");
        System.out.println("Los Aprobados son: " + aprob + " Desaprobados son: " + (10-aprob));

    }
}
