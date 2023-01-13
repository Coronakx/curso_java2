/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author progr
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        //Objeto
        Operacion  opMat = new Operacion();
       
       opMat.CrearOperacion();
        System.out.println("la suma da: "+opMat.Sumar());
       opMat.restar();
       opMat.Multiplicar();
       opMat.Dividir();
        
        
        
    }
    
}
