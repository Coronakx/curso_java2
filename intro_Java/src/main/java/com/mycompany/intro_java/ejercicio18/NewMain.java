
package com.mycompany.intro_java.ejercicio18;

import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio 2 Extra
        int aux, a, b, c, d;
        
        a=10;
        b=15;
        c=20;
        d=30;
        
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        

        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        
    }
    
}
