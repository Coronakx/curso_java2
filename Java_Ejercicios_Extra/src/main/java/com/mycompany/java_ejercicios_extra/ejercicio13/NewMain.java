/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_ejercicios_extra.ejercicio13;

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
        Scanner leer = new Scanner(System.in);
        int i, n, m, edad, suma;
        double prom;
        
        System.out.println("Ingresa la cantidad de familias");
        n = leer.nextInt();
        m=0;
        suma=0;
        
        for(i=1; i<=n; i++){
            System.out.println("Ingresa la cantidad de hijos de la familia "+i);
            m = leer.nextInt();
            for (m=1; m<=i; m++){
              System.out.println("Ingresa la edad de los hijos de la familia "+i);
            edad = leer.nextInt();
            suma=suma+edad;  
            }

    }
        prom=suma/m;
        System.out.println("Total de hijos: "+m);
        System.out.println("Suma de las edades: "+suma);
        System.out.println("");
        System.out.println("Promedio de las edades: "+prom);
        }
}
    
