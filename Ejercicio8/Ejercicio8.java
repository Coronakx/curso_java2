/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author progr
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        Cadena cadena= new Cadena();
        System.out.println("Ingrese una frase");
        cadena.setFrase(leer.next());
        cadena.setLongitud(cadena.frase.length());
        System.out.println(cadena.frase);
        System.out.println(cadena.longitud);
    }
    
}
