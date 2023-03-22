/*
Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
e imprima el número ingresado seguido de tantos asteriscos como indique su valor. 
Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package Ejerciciosguia3;
import java.util.Scanner;
public class Ejercicio9h10Guia {

    /**
     * @param args the command line arimport java.utilScannerguments
     */
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
  int num1;
  int num2;
  int num3;
  int num4;
   
     
 do {
       System.out.println("Ingrese 4 números entre 1 y 20");
  num1 = leer.nextInt();
  num2 = leer.nextInt();
  num3 = leer.nextInt();
  num4 = leer.nextInt(); 
 if(num1>0 && num1<=20 || num2>0 && num2<=20 || num3>0 && num3<=20 || num4>0 && num4<=20){ 
  /*Si reemplazo los "||" entre num1 y num2 o num2 y num3 o num3 y num4 por "&&"
     no ejecuta ninguna linea. Asi como esta ahora ejecuta los numeros dentro de los parametros*/ 
  for (int i = 0; i < num1 ; i++) {
           if (i == 0){
                System.out.print(num1);
           } System.out.print("*");
        } System.out.println("");
           
  for (int i = 0; i < num2; i++) {
            if (i == 0){
                System.out.print(num2);
           } System.out.print("*");
        } System.out.println(" ");
  for (int i = 0; i < num3; i++) {
            if (i == 0){
               System.out.print(num3);
            } System.out.print("*");
        } System.out.println(" ");
       for (int i = 0; i < num4; i++) {
            if (i == 0){
                System.out.print(num4);
           } System.out.print("*");
       }
   
        System.out.println("");  
 } else 
         System.out.println("Los números no estan dentro de los parametros");
 } while(num1<1 || num1>20 && num2<1 || num2>20 && num3<1 || num3>20 && num4<1 || num4>20);
 
    }
    }