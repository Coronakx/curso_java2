/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author progr
 */
public class Rectangulo {

    private Integer base;
    private Integer altura;

    public Rectangulo() {
    }

    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    public Integer getBase() {
        return base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public void Rectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Base: ");
        this.base = leer.nextInt();
        System.out.println("Altura:");
        this.altura = leer.nextInt();
    }

    public void Area() {
        int area = this.base * this.altura;
        System.out.println("El área es:" + area);
    }

    public void Perimetro() {
        //Puede tener el mismo nombre un método que una variable. Para mandar llamar al método se usan los paréntesis y 
        //para llamar a la variable sin paréntesis

        int perimetro = (this.base + this.altura) * 2;
        System.out.println("El perímetro es: " + perimetro);
    }

    public void ImprimirRectangulo() {
        int i, j;
        for (i = 0; i < this.base; i++) {
            for (j = 0; j <this.altura; j++) {
                if ((j == 0) || (j == this.altura-1) || (i == 0) || (i == this.base-1)) {
                    System.out.print("* "); 
                }else {
                    System.out.print("  ");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}