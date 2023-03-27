/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5.
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división.
Nota: recordar que las variables de tipo entero truncan los números o resultados.
 */
package Ejerciciosguia3;
import java.util.Scanner;
/**
 *
 * @author Elio
 */
public class EjercicioExtra_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 1 ;
        System.out.println("Ingrese un número entero para saber la cantidad de dígitos");
         int num = leer.nextInt();
         while(num>=10){
             num = num / 10;
             cont++;
         }
         System.out.println("El número de dígitos que componen el número ingresado es de: " + cont);
         
    }
    
}
