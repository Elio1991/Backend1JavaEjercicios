/*
Realice un programa para que el usuario adivine el resultado
de una multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
El programa debe indicar al usuario si su respuesta es o no correcta. 
En caso que la respuesta sea incorrecta se debe permitir al usuario 
ingresar su respuesta nuevamente. 
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */
package Ejerciciosguia3;
 import java.util.Scanner;

public class EjercicioExtra_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      


        Scanner leer=new Scanner(System.in);
        int num1 = (int) (Math.random() *10);
        int num2 = (int) (Math.random() *10);
        int mul = (num1 * num2);
        int val ;
        System.out.println(mul);
        
        do{
            System.out.println("Ingrese un valor: ");
            val =  leer.nextInt();
        if(val == mul){
            System.out.println("Tu respuesta es CORECTA! :)");
        }else{
            System.out.println("Incorrecto, segui intentando ");
        }
        }while(mul != val);
      
                
    }
    
}
    
    

