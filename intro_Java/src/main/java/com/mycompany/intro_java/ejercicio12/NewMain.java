/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.intro_java.ejercicio12;

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
        int tipo_motor;
        System.out.println("Ingresa una opción");
        Scanner leer = new Scanner(System.in);
        tipo_motor = leer.nextInt();
        
        switch(tipo_motor){
        
        case (1): System.out.println("La bomba es de tipo AGUA");
        break;
        case (2):System.out.println("La bomba es de tipo GASOLINA");
        break;
        case 3: System.out.println("La bomba es de tipo HORMIGÓN");
        break;
        case 4: System.out.println("La bomba es de tipo PASTA ALIMENTICIA");
        default: System.out.println("Tipo INVÁLIDO");
        
              
        
        
                
               
        
    }
    }
             
    }
    

