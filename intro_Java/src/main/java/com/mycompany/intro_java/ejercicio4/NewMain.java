/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio4;

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
        //Ejercicio 4 extra. 
        //Ingresar un número entre 1 y 10 y mostrar su equivalente en romano
        
        Scanner leer = new Scanner(System.in);
        int num;
        string rom = "";

        System.out.println("Ingresa un número");
        num=leer.nextInt();

        switch (num) {
            case 1:
                    rom += "I";
                    break;
            case 2:
                    rom += "II";
                    break;
            case 3:
                    rom += "III";
                    break;
            case 4:
                    rom += "IV";
                    break;
            case 5:
                    rom += "V";
                    break;
            case 6:
                    rom += "VI";
                    break;
            case 7:
                    rom += "VII";
                    break;
            case 8:
                    rom += "VIII";
                    break;
            case 9:
                    rom += "IX";
                    break;
            case 10:
                    rom += "X";
                    break;
        }

        System.out.println(num + "Romano es: "+rom);
        
        
    }
    
}
