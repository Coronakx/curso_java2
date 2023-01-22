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
     
     public void mostrarVocales() {
          int i;
          int contador=0;
          //String letra;
          //char c;
          for (i=0; i<=this.frase.length();i++) {
               /*solución 1
               letra.equalsIgnoreCase(this.frase.substring(i,i));
               if (letra.equalsIgnoreCase("A")||letra.equalsIgnoreCase("E")||letra.equalsIgnoreCase("I")||
               letra.equalsIgnoreCase("O")||letra.equalsIgnoreCase("U")   } */
         
               /*Solución usando charAt (después del for)
               c=this.frase.charAt(i);
          if (c.equalsIgnoreCase("a")||c.equalsIgnoreCase("e")||c.equalsIgnoreCase("i")||c.equals.IgnoreCase("o")||
              c.equalsIgnoreCase("u") }
          
          contador=contador++;
               System.out.println("la frase tiene "+contador+"vocales");
                   } */
          
         //solución Jime sin usar los setters en el main (despuésd del for)
         
            if (this.frase.substring(i,1+1).equalsIgnoreCase("a")||this.frase.substring(i,1+1).equalsIgnoreCase("e")||
                this.frase.substring(i,1+1).equalsIgnoreCase("i")||this.frase.substring(i,1+1).equalsIgnoreCase("o")||
                this.frase.substring(i,1+1).equalsIgnoreCase("u")) {
               contador=contador+1;
            }
          }
          System.outprintln("La frase tiene "+contador+" vocales");            
     }
     
    
     
     //ver el uso de fraseinvertida+frase
              
             
}
}
