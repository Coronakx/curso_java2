/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio20;

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
        Scanner leer=new Scanner (System.in);
        int num, y;
        int[]vector = new int[4];
    
        
        for (int i=0; i<4;i++) {
            System.out.println("Ingrese el valor entre 1 y 20 del vector en la posición "+i);
            num = leer.nextInt();
            /*if (num<0 || num>20) {
                System.out.println("El número está fuera de rango");
            }
            else { */
            vector[i]=num; 
        
        }
                
        for (int i=0; i<4;i++) {
            System.out.print(vector[i]);
          for (y=0; y<vector[i]; y++) {
              System.out.print("*");
     
            }
            System.out.println("");
        }
        
        
    }
        
    
}
}