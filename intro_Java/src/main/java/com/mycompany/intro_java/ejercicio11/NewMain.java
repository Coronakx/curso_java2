/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio11;

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
        String frase, letra;
        System.out.println("Ingresa una frase");
        Scanner leer = new Scanner (System.in);
        frase = leer.nextLine();
        letra = "A";
    //En Java la posición va de la posición anterior a la que se quiere igualar
    //También se puede usar .startsWith
        if (frase.substring(0,1).equals(letra)){
            System.out.println("CORRECTO");
    }
        else {
            System.out.println("INCORRECTO");
        }
        
    }
    
}
