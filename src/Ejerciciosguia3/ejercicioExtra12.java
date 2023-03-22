/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), 
que muestre los números del 0-0-0 al 9-9-9, 
con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.

 */
package Ejerciciosguia3;



/**
 *
 * @author Elio
 */
public class ejercicioExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
//        int num;

        while (cont3 <= 9) {

            String letra1;
            if (cont3 == 3) {
                letra1 = "E";
            } else {
                letra1 = Integer.toString(cont3);
            }

            if (letra1.equals("3")) {
                letra1 = letra1.replace("3", "E");
            }
            String letra2;
            if (cont2 == 3) {
                letra2 = "E";
            } else {
                letra2 = Integer.toString(cont2);
            }

            if (letra2.equals("3")) {
                letra2 = letra2.replace("3", "E");
            }
            String letra3;
            if (cont1 == 3) {
                letra3 = "E";
            } else {
                letra3 = Integer.toString(cont1);
            }

            if (letra3.equals("3")) {
                letra3 = letra3.replace("3", "E");
            }

            System.out.println(letra1 + "-" + letra2 + "-" + letra3);
//            if (cont1 == 3) {
//                num = cont1;
//                String letra1 = Integer.toString(num);
//                if (letra1.equals("3")) {
//                    letra1 = letra1.replace("3", "E");
//                    System.out.print(cont3 + "-");
//                    System.out.print(cont2 + "-");
//                    System.out.print(letra1);
//                    System.out.println("");
//
//                }
//            }
//            if (cont2 == 3) {
//                num = cont2;
//                String letra2 = Integer.toString(num);
//                if (letra2.equals("3")) {
//                    letra2 = letra2.replace("3", "E");
//                    System.out.print(cont3 + "-");
//                    System.out.print(letra2 + "-");
//                    System.out.print(cont1);
//                    System.out.println("");
//                }
//            }
//            if (cont3 == 3) {
//                num = cont3;
//                String letra3 = Integer.toString(num);
//                if (letra3.equals("3")) {
//                    letra3 = letra3.replace("3", "E");
//                    System.out.print(letra3 + "-");
//                    System.out.print(cont2 + "-");
//                    System.out.print(cont1);
//                    System.out.println("");
//                }
//            }
//            //  if(cont1!=3){
//            System.out.print(cont3 + "-");
//            System.out.print(cont2 + "-");
//            System.out.print(cont1);
//            System.out.println("");
            cont1++;
//            /*  }
//		 "  if(cont2!=3){
//		 System.out.print(cont3 + "-");
//		 System.out.print(cont2 + "-");
//		 System.out.print(cont1);
//		 System.out.println("");
//		 cont1++;
//		    }
//		     if(cont3!=3){
//		 System.out.print(cont3 + "-");
//		 System.out.print(cont2 + "-");
//		 System.out.print(cont1);
//		 System.out.println("");
//		 cont1++;
//		    }*/

            if (cont1 == 10) {
                cont1 = 0;
                cont2++;
            }
            if (cont2 == 10) {
                cont2 = 0;
                cont3++;
            }
            if (cont3 == 10) {
                break;
            }
        }

    }

}

