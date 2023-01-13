/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_ejercicios_extra.ejercicio14;

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
        int num1, num2, opcion;
        String confirmar;
        boolean salir = false;
        double mult, div, suma, resta;

        while (salir == false) {

            System.out.println("Ingresa el primer número");
            num1 = leer.nextInt();
            System.out.println("Ingresa el segundo número");
            num2 = leer.nextInt();

            System.out.println("MENÚ");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.SALIR");

            System.out.println("Elige la opción del menú:");
            opcion=leer.nextInt();
            
            switch (opcion) {

                case 1:
                    System.out.println("La SUMA es igual a: " + suma(num1, num2));
                    break;
                case 2:
         
                    System.out.println("La RESTA es igual a: " + resta(num1, num2));
                    break;
                case 3:
             
                    System.out.println("La MULTIPLICACIÓN es igual a: " + mult(num1, num2));
                    break;
                case 4:
          
                    System.out.println("La DIVISIÓN es igual a: " + div(num1, num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir? S/N");
                    confirmar = leer.next();
                    if (confirmar.equalsIgnoreCase("S")) {
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("Opción INVÁLIDA");
            }

        }

    }

    public static double mult(int num1, int num2) {
        double mult = num1 * num2;
        return mult;
    }

    public static double resta(int num1, int num2) {
        double resta = num1 - num2;
        return resta;
    }

    public static double suma(int num1, int num2) {
        double suma = num1 + num2;
        return suma;
    }

    public static double div(int num1, int num2) {
        double div = num1 / num2;
        return div;
    }
}

