/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_ejercicios_extra.ejercicio18;

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
                Scanner leer=new Scanner (System.in);
        int n;
        

        System.out.println("Ingrese la dimensión de los vectores");
        n=leer.nextInt();
        int[]vector1 = new int [n];
        int[]vector2 = new int [n]; 


        //Llenar el vector 1 
        for (int i=0; i<vector1.length; i++) {
            System.out.println("Ingrese el valor del vector 1 en la posición "+i+" ");
            vector1[i]=leer.nextInt();
       
        //Llenar el vector 2
        for (int i=0; i<vector2.length; i++) {
            System.out.println("Ingrese el valor del vector 2 en la posición "+i+" ");
            vector2[i]=leer.nextInt();
        
        //Mostrar los vectores 
        
        for (int i=0; i<n; i++) {
            System.out.println(vector1[i]+" ");
            System.out.println(vector2[i]+" ");
        }
        

        //Comparar los vectores
        for (int i=0; i<vector1.length; i++) {
            if vector1[i]!==vector2[i] {
                System.out.println("Los elementos de los vectores 1 y 2 son diferentes");
                break;
            } else {
                System.out.println("Los elementos de los vectores 1 y 2 son iguales");
            }
            
        }
        
        
    }
    
}
