/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio6;

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

    int numPersonas, cont, PersDebajo;   
    double estatura, estGral,    estDebajo, promDebajo, promGral;
    System.out.println("¿Cuántas personas se van a promediar?");   
    Scanner leer= new Scanner(System.in);
    numPersonas=leer.nextDouble();
   
   cont=0;
   estatura=0;
   estGral=0;
   persDebajo=0;

    do {
        System.out.println("Estatura: ");
        estatura = leer.nextInt();
        estGral=estGral+estatura;
        contador++;
        if (estatura<1.6) {
            estDebajo=estDebajo+estatura;
            persDebajo=persDebajo+1;
        }


    } while contador=numPersonas;
   
    promDebajo=estGral/persDebajo;
    promGral=estGral/numPersonas;

    System.out.println("Personas con estatura debajo de 1.60 m: "+persDebajo);
    System.out.println("Estatura promedio debajo de 1.60 m : "+promDebajo);
    System.out.println("Total de personas: "+numPersonas);
    System.out.println("Estatura promedio del total de personas: "+promGral);
        
    }
    
}
