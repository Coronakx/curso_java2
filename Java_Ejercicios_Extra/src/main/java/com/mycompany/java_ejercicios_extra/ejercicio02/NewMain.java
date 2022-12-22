/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio02;

import java.util.Scanner;

/**
 *
 * @author progr
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
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
