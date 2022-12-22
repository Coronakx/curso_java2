/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio19;

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
        
        Scanner leer=new Scanner (System.in);
        int f, i, j;
        
        System.out.println("Ingrese la dimensión de la matriz");
        f= leer.nextInt();
   
        String [][] asterisco=new String[f][f];
        
        for (i=0; i<=f-1; i++) {
          for (j=0; j<=f-1; j++) {
              if (i==0)||(j==f-1) {
               asterisco[i][j]="*";
              }else {
              (j==0)||(j==f-1) 
               asterisco[i][j]="*";
              }
              else {
                asterisco[i][j]=" ";
              }

              }
        }
              System.out.println("La matriz es \n");
              for (i=0; i<f-1; i++) {
                for (j=0; j<=f-1; j++);{
                  System.out.print(asterisco[i][j]+" ");
                }
              System.out.println("");
              }
        
     
        }
        
        
                
    }
    

