/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_ejercicios_extra.ejercicio16;

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
             // Ejercicio 16 extra
        Scanner leer=new Scanner (System.in);  
        int num;
        boolean primo=true;

    
        System.out.println("Ingresa un número");
        num=leer.nextInt();
        numPrimo(int num);

    }

    public void numPrimo(int num) {
        for (int i=2; i<num && primo==true; i++) {
        if (num%i==0) {
           primo=false;
        }   
        }
        if (primo=true) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número NO es primo");
        }
    
    }
    
}        
        
 
