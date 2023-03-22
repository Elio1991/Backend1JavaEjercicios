/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, 
pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada
y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, 
no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, 
y luego un valor real que represente el costo del tratamiento 
(previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

 */
package Ejerciciosguia3;

import java.util.Scanner;

public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Que Clase de Socio quieres elegir?");

        System.out.println("Tipo A. Premium (50% de descuento en todos los tratamientos)");
        System.out.println("Tipo B. Moderate(35% de descuento en todos los tratamientos)");
        System.out.println("Tipo C. Basic (no existen descuentos en los tratamientos)");

        String opc = leer.nextLine();

            if (opc.toUpperCase().equals("A")) {

                System.out.println("Ingrese el valor del tratamiento para conocer el costo final con el descuento ");
                int num1 = leer.nextInt();
                System.out.println("El costo del tratamiento con descuento es: $" + num1 * 50 / 100);
            }
            if (opc.toUpperCase().equals("B")) {
                System.out.println("Ingrese el valor del tratamiento para conocer el costo final con el descuento ");
                int num2 = leer.nextInt();
                System.out.println("El costo del tratamiento con descuento es: $" + num2 * 35 / 100);
            }
            if (opc.toUpperCase().equals("C")) {
                System.out.println("La categoría no recibe ningún descuento en los tratamientos");
            }
    }
}
