/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

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
        int num1, num2, opcion, res;
        
        System.out.println("Captura dos números para realizar operaciones matemáticas");
        System.out.println("Ingresa el primer número");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();
        System.out.println("Ingresa el segundo número");
        num2 = leer.nextInt();
        
        System.out.println("MENÚ");
        System.out.println("1.SUMAR");
        System.out.println("2.RESTAR");
        System.out.println("3.MULTIPLICAR");
        System.out.println("4.DIVIDIR");
        System.out.println("5.SALIR");
        
        
        System.out.println("Ingresa una opción");
        opcion = leer.nextInt();
        if (opcion>5){
            System.out.println("Opción Inválida");
               
 
        
        switch(opcion){
        
        case (1): res=num1+num2;
            System.out.println("SUMA "+res);
        break;
        case (2):System.out.println("RESTAR");
        break;
        case 3: System.out.println("MULTIPLICAR");
        break;
        case 4: System.out.println("DIVIDIR");
        break;
        case 5:System.out.println("SALIR ¿Está seguro que desea salir?");
     
        break;
        default: System.out.println("Tipo INVÁLIDO");
        }
        
    }
    
}
