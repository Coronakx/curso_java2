/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author progr
 */
public class Cadena {
     Scanner leer = new Scanner(System.in);
  
    
     public String frase;
     public int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public Scanner getLeer() {
        return leer;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
     
     
     public void crearFrase() {
         leer.useDelimiter("\n");
         System.out.println("Ingrese la frase: ");
         this.frase=leer.next();
         
         
     }
     
   
     
    
     
}
