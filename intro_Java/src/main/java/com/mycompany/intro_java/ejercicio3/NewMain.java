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
      String nombre;
        System.out.print("Ingresa tu nombre: ");
        Scanner leer = new Scanner(System.in);
        nombre = leer.nextLine();
        System.out.println("Tu nombre es: "+nombre);
    }
    
}
