/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio5;

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
        Float grados_c, grados_f;
        System.out.println("Ingresa los grados centígrados");
        Scanner leer=new Scanner(System.in);
        grados_c=leer.nextFloat();
        grados_f=32+ (9 * grados_c / 5);
        System.out.println(grados_f);
              
    }
    
}
