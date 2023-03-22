/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts.
y el promedio de estaturas en general.

 */
package Ejerciciosguia3;

import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class EjercicioExtra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Elije la cantidad de personas para saber el promedio de altura");
        float num1 = leer.nextFloat();
        float promedio1 = 0;
        float general = 0;
        int cont1 = 0;
        
        for (int i = 0; i < num1; i++) {
            System.out.println("Ingrese la altura");
            float altura = leer.nextFloat();
            general = general + altura;
           
            
            if (altura < 1.60) {
                promedio1 = promedio1 + altura;

                cont1++;
            }
            
        }
       
        System.out.println("La altura promedio general es: " + general/num1);
        // De esta manera esta limitado hasta 5 personas.
        /* if(cont1 == 1){
            System.out.println("El promedio de altura por debajo de 1.60 es: "+ promedio1);
        }
        if(cont1 == 2){
            System.out.println("El promedio de altura por debajo de 1.60 es: "+ promedio1/2);
        }
        if(cont1 == 3){
            System.out.println("El promedio de altura por debajo de 1.60 es: "+ promedio1/3);
        }
        if(cont1 == 4){
            System.out.println("El promedio de altura por debajo de 1.60 es: "+ promedio1/4);
        }
        if(cont1 == 5){
            System.out.println("El promedio de altura por debajo de 1.60 es: "+ promedio1/5);
        }
        
        */
        
        //  Utilizando un "for" podemos calcular el promedio según la cantidad de personas ingresada.
        for (int j = 0; j < num1; j++) {
           if(cont1==j){
            System.out.println("El promedio de altura por debajo de 1.60 es: "+ promedio1/j);
        }
    }
    }
}
