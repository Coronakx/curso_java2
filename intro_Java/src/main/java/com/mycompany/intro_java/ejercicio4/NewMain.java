/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio4;

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
        String frase, frase1, frase2;
        System.out.print("Ingresa una frase y termina con un punto: ");
        Scanner leer = new Scanner(System.in);
        frase = leer.nextLine();
        frase1=frase.toUpperCase();
        System.out.println(frase1);
        frase2=frase.toLowerCase();
        System.out.println(frase2);
        
    }
    
}
