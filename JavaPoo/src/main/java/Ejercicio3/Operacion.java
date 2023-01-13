/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author progr
 */
public class Operacion {

    private Integer num1;
    private Integer num2;

    public Operacion() {
    }

    public Operacion(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Integer getNum1() {
        return num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    //Métodos
    public void CrearOperacion() {
        Scanner leer = new Scanner(System.in);
        //leer.useDelimiter("\n");

        System.out.println("Ingrese el primer número: ");
        this.num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        this.num2 = leer.nextInt();
    }
    //función - devuelve un tipo de dato -return
    public int Sumar() {
        return (this.num1 + this.num2);
    }

    //Método no devuelve un valor, no requiere return
    public void restar() {
        System.out.println("La resta es: " + (this.num1 - this.num2));
    }

    public void Multiplicar() {
        if (this.num2==0) {
               System.out.println("¡Error!!!!!!!");
        } else {
        System.out.println("La multiplicación es: " + (this.num1 * this.num2));
    } 
    }  
       public void Dividir() {
        if (this.num2==0) {
               System.out.println("¡Error!!!!!!!");
        } else {
        System.out.println("La división es: " + (this.num1 / this.num2)); 
        }
}
}
