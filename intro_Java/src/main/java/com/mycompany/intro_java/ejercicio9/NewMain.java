/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio9;

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
        String frase, frase2;
        System.out.println("Ingresa una frase");
        Scanner leer = new Scanner (System.in);
        frase = leer.nextLine();
        frase2 = "Eureka";
     //IGNORE CASE para que no distinga mayúsculas y minúsculas
     //frase.equals sí distinguiría mayúsculas y minúsculas 
        if(frase.equalsIgnoreCase(frase2)){
            System.out.println("CORRECTO");
        }
        else {
            System.out.println("INCORRECTO");
        }  
  
    
}
}