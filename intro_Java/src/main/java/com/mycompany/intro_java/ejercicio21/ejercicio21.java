/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio21;

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
    double dolar, yen, libra, euro;
    int peso;
        System.out.println("ingrese la cantidad de euros");
        Scanner leer =new Scanner(System.in);
        euro= leer.nextDouble();
        libra=0;
        yen=0;
        dolar=0;
        peso=0;
        cambio(euro, libra, yen, dolar, peso);
    }
    public static void cambio(double euro, double libra, double yen, double dolar, int peso) {
        libra=euro*0.86;
        dolar= euro*1.28611;
        yen= euro*129.852;
        
        String dolares=String.valueOf(dolar); //convertir double a String
        System.out.println("una euro es: "+libra+ " libras");
        System.out.println("una euro es: "+dolar+ " dolares");
        System.out.println("una euro es: "+yen+ " yenes");
        System.out.println(dolares); //double convertido a String
    }
}
