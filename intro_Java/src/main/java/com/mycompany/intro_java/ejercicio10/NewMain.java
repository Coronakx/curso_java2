/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio10;

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
                String frase;
                int longitud;
        System.out.println("Ingresa una frase");
        Scanner leer = new Scanner (System.in);
        frase = leer.nextLine();
        longitud=frase.length();
        System.out.println(longitud);
        if (longitud==8){
            System.out.println("CORRECTO");  
        }
        else {
            System.out.println("INCORRECTO");
}
        
        
        
        
        
        
    }
    
}
