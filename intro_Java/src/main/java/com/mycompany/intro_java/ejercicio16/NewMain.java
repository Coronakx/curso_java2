
package com.mycompany.intro_java.ejercicio16;

import java.util.Scanner;


public class NewMain {


    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    int num, suma;
    suma=0;
    for (int i=1; i<=5; i++) {
        System.out.println("Ingresa un número diferente de cero");
        num = leer.nextInt();
            
         if (num>=0){
            suma=suma+num;
        }
        if (num==0) {
            break;
        }
        }

    System.out.println("La suma de los números es: "+suma);

        
  
    }
    
}
