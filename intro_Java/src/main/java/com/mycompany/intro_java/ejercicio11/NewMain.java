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
        //Ejercicio 11 extra
      
        Scanner leer=new Scanner (System.in);   
        int numero;
        int contador=0;
        
        System.out.println("Ingresa un número");
        Scanner leer = new Scanner (System.in);
        frase = leer.nextInt();
       
       while (numero>=1) {
        numero=Math.trunc(numero/10);
        contador++;
       }
        System.out.println("El número tiene "+contador+"cifras");
        
    }
    
}
