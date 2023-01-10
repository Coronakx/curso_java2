/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.java_ejercicios_extra.ejercicio17;

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
        int suma=0;

        System.out.println("Ingrese la dimensión del vector");
        n=leer.nextInt();
        int[]vector = new int [n];

        //Llenar el vector 
  
        for (int i=0; i<vector.length; i++) {
            System.out.println("Ingrese el valor del vector en la posición "+i+" ");
            vector[i]=leer.nextInt();
        }
        //Mostrar el vector
        for (int i=0; i<vector.length;i++) {
            System.out.println(" "+vector[i]);
        } 

        //Sumar los elementos del vector
        for (int i=0; i<vector.length;i++) {
            suma=suma+vector[i];  
            System.out.println("La suma de los elementos del vector es: "+suma);
        } 
        
    }
  
}
