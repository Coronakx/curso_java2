/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio17;

import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) {
        // TODO code application logic here
        String frase, x, o, frase1;
        int largo=5;
        int contador, cont2;
       
        Scanner leer = new Scanner (System.in);
        
        frase1="&&&&&";
        x="x";
        o="o";
        contador=0;
        cont2=0;
        do {
        System.out.println("Ingresa una frase");
        frase = leer.nextLine();  
        if(frase.length()==largo && frase.startsWith(o)&& frase.endsWith(x) ){
            contador=contador+1;
            
        } else {
            cont2=cont2+1;
            }
            
        }while (!frase.equals(frase1));
                
        System.out.println("Frases Correctas: "+contador);
        System.out.println("Frases Incorrectas: "+ cont2);
                  
        
        
    }
    
}
