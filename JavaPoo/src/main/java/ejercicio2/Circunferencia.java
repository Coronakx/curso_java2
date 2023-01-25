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
/*public class Circunferencia {
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
    }*/

public class Matematica() {
   
   public double num1;
   public double num2;
   
   public void devolverMayor() {
   
      double mayor;
      mayor=Math.max(this.num1,this.num2);
      System.out.println("El número mayor es: "+mayor);
   }
   
   public void calcularPotencia() {
    
      long rednum1=Math.round(this.num1);
      long rednum2=Math.round(this.num2);
      double potencia;
      potencia=MathPow(Math.max(rednum1,red.num2),Math.min(rednum1,rednum2);    
      System.out.println("El número mayor elevado a la potencia del menor es: "+potencia);                 
   }
    
   public void calcularRaiz() {
      
      int absoluto=Math.abs(Math.min(this.num1,this.num2);
      double raizc=Math.sqrt(absoluto);
      System.out.println("La raiz cuadrada del valor absoluto del número menor es: "+raizc);
                               
   }
                            
      
      
   }

}
}
