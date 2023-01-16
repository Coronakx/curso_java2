/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author progr
 */
public class Cafetera {

    Scanner leer = new Scanner(System.in);
    public int capacidadMax;
    public int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMax, int cantidadActual) {
        this.capacidadMax = capacidadMax;
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMax() {
        return capacidadMax;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        this.capacidadMax = 2000;
        this.cantidadActual = this.capacidadMax;
    }

    public void servirTaza() {
        int taza;
        System.out.println("Ingrese la capacidad de la taza en ml: ");
        taza = leer.nextInt();
        if (this.cantidadActual < taza) {
            taza = this.cantidadActual;
            this.cantidadActual = 0;
            System.out.println("La cantidad de café en tu taza es de: "+taza);
            System.out.println("No hay café suficiente. ¡Lava la cafetera y haz más café!");
        }
        else {
            this.cantidadActual = this.cantidadActual - taza; 
            System.out.println("El contenido de tu taza es de : "+taza+" ml");
            System.out.println("La cafetera tiene "+this.cantidadActual+"ml");
        }
    }

    public void vaciarCafetera() {
           this.cantidadActual = 0;
    }
    
    public void agregarCafe() {
        int cafe;
        System.out.println("Ingresa la cantidad de café que vas a agregar a la cafetera en ml: ");
       cafe=leer.nextInt();
       if (cafe+this.cantidadActual>this.capacidadMax) {
           System.out.println("La cantidad de café sobrepasa la capacidad máxima de la cafetera");
       }
       else {
            this.cantidadActual=this.cantidadActual+cafe;
       }
    }
    
}
