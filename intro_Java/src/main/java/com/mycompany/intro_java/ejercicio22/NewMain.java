/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio22;

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
                //Ejercicio 22 
    
        Scanner leer=new Scanner (System.in);
        int num=1;
        int[]vector = new int[100];
    
    //Llenar el vector de 1 a 100    
        for (int i=0; i<vector.length; i++) {
            vector[i]=num;
            num=num+1;
        
      }
    //Mostrar el arreglo de forma descendente
        for (int i=vector.length-1; i>=0; i--) {
            System.out.print(""+vector[i]);
     
            }
        }
        
        
        
        
        
    }
   
    
}
