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
        // Ejercicio 9 extra

        Scanner leer = new Scanner (System.in);     
        int dividendo, divisor, cociente, residuo;
        cociente=0;
        residuo=0;

        System.out.println("Ingresa el dividendo");
        System.out.println("Ingresa el divisor");

        do {
            residuo=dividendo-divisor;
            dividendo=residuo;
            cociente++
        } while (residuo>divisor)

    System.out.println("Resultado="+residuo);     
    System.out.println("Número de restas realizadas:"+cociente);
  
    
}
}
