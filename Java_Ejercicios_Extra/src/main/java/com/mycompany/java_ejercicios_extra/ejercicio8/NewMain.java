/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_ejercicios_extra.ejercicio8;

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
      //Ejercicio 8 extra
    Scanner leer = new Scanner(System.in);
    int lim;
    double num;
    int contador=0;
    int pares=0;
    int impares=0;

    System.out.println("Ingrese la cantidad de números a capturar");
    lim=leer.nextInt();
     do{
        System.out.println("Ingresa un número no múltiplo de 5");
        num = leer.nextDouble();
        contador++;
            if ((num%2==0)&&(num>0)){
                pares++;
            }
                else {
                    if ((num%2!=0)&&(num>0)) {
                    impares++;
                    }
                }
        
        
    }while ((contador<lim)&&(num%5!=0));
    
    System.out.println("Cantidad de números capturados: "+contador); 
    System.out.println("Cantidad de números pares: "+pares);
    System.out.println("Cantidad de números impares: "+impares);  

        
        
        
    }
    
}
