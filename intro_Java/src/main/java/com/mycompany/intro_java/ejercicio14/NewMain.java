/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio14;

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
        int lim, num1, suma;
      
        System.out.println("Ingresa un límite");
        Scanner leer=new Scanner(System.in);
        lim=leer.nextInt();
        suma=0;
        do {
        System.out.println("Ingresa un número");
        num1=leer.nextInt();
        suma=suma+num1;
            System.out.println("la suma es "+suma);
        }while(suma<lim);


}
    
}
