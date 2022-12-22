/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_ejercicios_extra.ejercicio6;

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
            // Ejercicio 6 extra
    //Calcular la estatura de n personas y de las personas debajo de 1.6 m

    int numPersonas, cont, persDebajo;   
    double estatura, estGral,    estDebajo, promDebajo, promGral;
    System.out.println("¿Cuántas personas se van a promediar?");   
    Scanner leer= new Scanner(System.in);
    numPersonas=leer.nextInt();
   
   cont=0;
   estatura=0;
   estGral=0;
   persDebajo=0;
   estDebajo=0;
    do {
        System.out.println("Estatura: ");
        estatura = leer.nextDouble();
        estGral=estGral+estatura;
        cont++;
        if (estatura<1.6) {
            estDebajo=estDebajo+estatura;
            persDebajo=persDebajo+1;
        }


    } while (cont<numPersonas);
   
    promDebajo=estDebajo/persDebajo;
    promGral=estGral/numPersonas;

    System.out.println("Personas con estatura debajo de 1.60 m: "+persDebajo);
    System.out.println("Estatura promedio debajo de 1.60 m : "+promDebajo);
    System.out.println("Total de personas: "+numPersonas);
    System.out.println("Estatura promedio del total de personas: "+promGral);
        
    }
    
}
