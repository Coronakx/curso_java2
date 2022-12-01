/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio1extra;

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
        int minutos, dias, horas, minutos1;
        System.out.println("ingrese la cantidad de minutos");
        System.out.println();
        Scanner leer = new Scanner(System.in);
        minutos=leer.nextInt();
        System.out.println("los minutos son "+minutos);
        dias=(minutos/60)/24;
        horas=(minutos-((dias*60)*24))/60;
        minutos1=(minutos-((horas*60))-((dias*60)*24));
        System.out.println("los dias son "+dias+" las horas son "+horas+" los minutos son "+minutos1);
    }
    
}
