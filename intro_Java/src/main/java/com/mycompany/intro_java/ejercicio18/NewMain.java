
package com.mycompany.intro_java.ejercicio18;

import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) {
        // TODO code application logic here
           int num, cont;
        System.out.println("Ingrese una cifra de tres dígitos");
        Scanner leer=new Scanner (System.in);
        num = leer.nextInt();
        String tres="3"
        int contador=0;

        for (int i=0; i<=9; i++) {
            for (int j=1; j<=3; j++) {
                if (i=3) {
                    System.out.print("E");
                }
                else {
                    System.out.print(i);
                } 
            }
        }





       /* String numCadena=String.valueOf(num);

        for (int i=0; i<numCadena.length(); i++)
        if numCadena.substring(i,i+1).equals(tres) {
            System.out.print("E");
        }
        else {
            System.out.print(numCadena.lenght(i)+"-");
        } */

        
    }
        
    }
    
}
