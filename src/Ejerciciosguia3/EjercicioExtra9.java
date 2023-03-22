/*
Simular la división usando solamente restas. 
Dados dos números enteros mayores que uno, 
realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

 */
package Ejerciciosguia3;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class EjercicioExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int coc = 0;
        int resi = 0;
        System.out.println("Ingrese dos números enteros para calcular el cociente y el residuo");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        while (num1 >= num2) {
            resi = num1 - num2;
            num1 = resi;
            coc++;
            
        }
        System.out.println("El cociente es: " + coc);
        System.out.println("EL residuo es: " + resi);
    }

}
