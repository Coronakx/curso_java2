/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio8;

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
        double num;
        System.out.println("Ingrese un número");
        Scanner leer= new Scanner(System.in);
        num=leer.nextDouble();
          
        if (num%2==0){
            System.out.println("El número es PAR");
        }
        else {
            System.out.println("El número es IMPAR");
        }
        
        
        
    }
    
}
