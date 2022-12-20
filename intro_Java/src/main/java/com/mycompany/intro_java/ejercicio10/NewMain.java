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

    /*import java.util.Random; //Esto importa la clase Random de java.util

    publicclassMathMatchRandom { //Esto crea una instancia de la clase Random
        Random claseRandom = new Random();
        claseRandom.nextInt(11); //Genera un número entre 0 y 10
    }   
}    */
        
     
    Scanner leer=new Scanner (System.in);  
    int numero, aleatorio;
    int contador=0;

    aleatorio= (int) (Math.random()*100); 
    
    do {
        System.out.println("Adivina el resultado de la multiplicación de dos números de 0-100");
        numero=leer.nextInt();
        if (aleatorio>numero) {
            System.out.println("Digita un número mayor");
        }
        else {
            System.out.println("Digita un número menor");
        }
        contador++;

    }while (numero !=aleatorio);
    System.out.println("¡¡¡¡Adivinaste el resultado!!!!!!! en " +contador+"intentos");
          
        
        
        
        
    }
    
}
