/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio7;

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
        // Ejercicio 7 extra
        Scanner leer= new Scanner(System.in);  
       
        int lim;
        double num, prom, minVal;

        double maxVal=0;
        int contador=0;
        double suma=0;

        //VERSION DO-WHILE
        System.out.println("Ingrese la cantidad de números a capturar");
        lim=leer.nextInt();
        
        do {
        System.out.println("Ingrese un número");
        num=leer.nextInt();
        minVal=num;
        suma=suma+num;
        maxVal=max(maxVal,num);
        minVal=min(minVal,num);
        contador++;
        }while contador=lim;

        prom=suma/num;
        System.out.orintln("El número máximo es: "+maxVal);
        System.out.println("El número mínimo es: "+minVal);
        System.out.println("El promedio es: "+prom);



        //VERSION WHILE

        System.out.println("Ingrese la cantidad de números a capturar");
        lim=leer.nextInt();
       
        while (contador<=lim) {

        System.out.println("Ingrese un número");
        num=leer.nextInt();
        minVal=num;
        suma=suma+num;
        maxVal=max(maxVal,num);
        minVal=min(minVal,num); 
        contador++;
        }
        prom=suma/num;
        System.out.orintln("El número máximo es: "+maxVal);
        System.out.println("El número mínimo es: "+minVal);
        System.out.println("El promedio es: "+prom);
 
   
}
        
        
        
    }
    

