/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_ejercicios_extra.ejercicio12;

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
        //Escalera de números

        int altura, x, i;
        System.out.println("Ingresa la altura de la escalera");
        Scanner leer = new Scanner(System.in);
        altura= leer.nextInt();
        
        
        for(x=1; x<=altura; x++){
            for (i=1; i<=x; i++){
            System.out.print(" "+i);
            }
        System.out.println("");
        }
        
    }
    
    
    
    
}
