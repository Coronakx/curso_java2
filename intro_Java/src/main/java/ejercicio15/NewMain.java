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
        
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion, res;
        
        do {
            
        
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
        
        
        System.out.println("Ingresa una opción");
        opcion = leer.nextInt();
    
               
 
        
        switch(opcion){
        
        case 1: 
                res=num1+num2;
                System.out.println("La SUMA es igual a: "+res);
        break;
        case 2:
                res=num1-num2;
                System.out.println("La RESTA es igual a: " +res);
        break;
        case 3:
                res=num1*num2;
               System.out.println("La MULTIPLICACIÓN es igual a: " +res);
        break;
        case 4:
                res=num1*num2;
                System.out.println("La DIVISIÓN es igual a: " +res);
        break;
        case 5:
                System.out.println("SALIR");
        break;
        default: System.out.println("Opción INVÁLIDA");
        }
            
        //Para validar que la opción elegida sea un número. Debe ir dentro del do después del switch 
        //la llave del catch cierra a la de try
        }catch (InputMismatchException e) {
        System.out.println("La opción debe ser un número");
        //sn.next es para que no se cicle si el usuario digita algo distinto a número
        sn.next();
            
        while (opcion=5);
            }
       
    
}
