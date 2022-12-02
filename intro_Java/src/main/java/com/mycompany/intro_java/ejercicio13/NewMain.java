/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio13;

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
    
        

    int nota;


    System.out.println("Ingresa una nota");
    Scanner leer=new Scanner(System.in);
    nota=leer.nextInt();
    
        if(nota>=0&&nota<=10){
        System.out.println("La nota es CORRECTA");
    }
        else {
    System.out.println("La nota es Incorrecta");
        }
    while(nota<0||nota>10) {
    System.out.println("Ingresa una calificación");
    nota=leer.nextInt();
        if(nota>=0&&nota<=10){
        System.out.println("La nota es CORRECTA");
    }
        else {
    System.out.println("La nota es Incorrecta");
        }


   }

    }  
}

