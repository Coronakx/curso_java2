/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author progr
 */
public class Circunferencia {
   private Integer radio;

    public Circunferencia(Integer radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
    }
  
    public void MetCirc(){
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        System.out.println("Ingrese el radio: ");
        this.radio=leer.nextInt();           
    }
    
    public void MetArea(){
        double area=Math.PI*Math.pow(this.radio, 2);    
        System.out.println("El área es: "+area);
   
    }
    
    public void MetPerim(){
        double perim=(2*Math.PI*this.radio);
        System.out.println("El perímetro es: "+perim);
    }
}
