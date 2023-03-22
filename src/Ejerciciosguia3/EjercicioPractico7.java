/* Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: 
tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan
las siguientes funciones de Java Substring(), Length(), equals(). */
package Ejerciciosguia3;

import java.util.Scanner;

public class EjercicioPractico7 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        String cadena;

        do {
            System.out.print("Ingrese una cadena (&&&&& para salir): ");
            cadena = scanner.nextLine();

            if (cadena.equals("&&&&&")) {
                break;
            }

            if (cadena.length() != 5 || cadena.charAt(0) != 'X' || cadena.charAt(4) != 'O') {
                incorrectas++;
                System.out.println("La cadena ingresada no cumple con el formato requerido.");
            } else {
                correctas++;
                System.out.println("La cadena ingresada cumple con el formato requerido.");
            }

        } while (true);

        System.out.println("\nInforme:");
        System.out.println("Cadenas correctas recibidas: " + correctas);
        System.out.println("Cadenas incorrectas recibidas: " + incorrectas);
    }
} 
  