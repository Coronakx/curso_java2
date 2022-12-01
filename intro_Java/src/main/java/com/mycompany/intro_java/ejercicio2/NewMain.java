/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio2;

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
        int num1, num2, suma;
        System.out.println("Ingrese el primer número: ");
        Scanner leer = new Scanner(System.in);
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2=leer.nextInt();
        suma=num1+num2;
        System.out.println("Elresultado de la suma es "+suma);
        
         
        
    }
    
}
