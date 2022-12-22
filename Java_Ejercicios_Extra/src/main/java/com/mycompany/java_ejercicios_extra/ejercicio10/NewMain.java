/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_ejercicios_extra.ejercicio10;

import java.util.Random;
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
    Scanner leer = new Scanner (System.in);
    double adivina, resultado, num1, num2; 
 
    //import java.util.Random; //Esto importa la clase Random de java.util

    //publicclassMathMatchRandom { //Esto crea una instancia de la clase Random
        //Random claseRandom = new Random();
        //claseRandom.nextInt(11); //Genera un número entre 0 y 10
        
        do {
        Random claseRandom = new Random();
        System.out.println("Adivina el resultado la una multiplicación de 2 números entre 0 y 10");
        adivina = leer.nextInt();
        num1=claseRandom.nextInt(11);
        num2=claseRandom.nextInt(11);
            System.out.println("Dime num " + num1);
            System.out.println("Dime num " + num2);
        resultado=num1*num2;
        if (adivina!=resultado) {
            System.out.println("Respuesta Incorrecta");
       
        }
        
        } while (adivina!=resultado);
     
        
        
        
    }   
}