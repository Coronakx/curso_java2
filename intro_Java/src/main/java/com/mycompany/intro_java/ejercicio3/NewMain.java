/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio3;

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
       //Ejercicio 3 extra
       string letra;

        System.out.println("Ingresa una letra");
        Scanner leer=new Scanner(System.in);
        letra=leer.nextLine();
        if (!letra.equalsIgnoreCase("A")||!letra.equalsIgnoreCase("e")||!letra.equalsIgnoreCase("I")||
       !letra.equalsIgnoreCase("O")||!letra.equalsIgnoreCase("U")) {
        System.out.println("La letra no es una vocal");
       } 
        
        
    }
    
}
