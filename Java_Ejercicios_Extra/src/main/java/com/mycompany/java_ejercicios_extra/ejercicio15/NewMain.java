/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_ejercicios_extra.ejercicio15;

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
        int num;

        System.out.println("Ingrese el número de personas a capturar: ");
        num = leer.nextInt();
        
        System.out.println(edades(num));

    }

    public static String edades(int num) {
        Scanner leer = new Scanner(System.in);
        String[] nombre = new String[num];
        int[] edad = new int[num];
        int i;
        for(i=0; i <num; i++){
            System.out.print("Edad de la persona ");
           
            edad[i] = leer.nextInt();
            
            System.out.print("Nombre de la persona ");
            
            nombre[i] = leer.next();
            
            
            if(edad[i]>18){
                System.out.println("La persona es mayor de edad");
                System.out.println();
            }else{
                System.out.println("La persona es menor de edad");
                System.out.println();
            }
        }
        String opcion;
        String opcion1="NO";
        int contador=-1;
        
        while (contador<num-1) {
          contador=contador+1;
            System.out.println("¿Desea imprimir los datos de la persona "+contador+"?");
            opcion=leer.next();
            if (opcion.equalsIgnoreCase(opcion1)){
                System.out.println("No se imprimirán más datos");
                System.out.println();
 
            }else {
                System.out.println("Datos de la persona "+nombre[contador]+" "+edad[contador]+"años");
            }
        }
      return "";  
    }

}

