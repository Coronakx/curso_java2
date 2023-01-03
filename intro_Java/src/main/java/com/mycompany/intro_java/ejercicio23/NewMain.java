/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio23;

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
                //Ejercicio 23 
        Scanner leer=new Scanner (System.in);
        int n, busca;

        System.out.println("Ingrese la dimensión del vector");
        n=leer.nextInt();
        int[]vector = new int [n];

        //Llenar el vector con números aleatorios
  
        for (int i=0; i<vector.length; i++) {
            int aleatorio = (int) (Math.random()*100+1);
            vector[i]=aleatorio;
        }

        for (int i=0; i<vector.length;i++) {
            System.out.println(" "+vector[i]);
        }
        //Buscar un número en el vector

        System.out.println("Ingresa el número que quieres encontrar en el vector");
        busca=leer.nextInt();

        
        for (int i=0; i<vector.length;i++) {
            if (busca=vector[i]) {
            System.out.println("El valor  "+busca "está en la posición "+vector[i]);
            }
            else {
            System.out.println("El valor "+busca "No está en el vector");
    
            }
        }
        
        
        
        
        
    }
    
}
