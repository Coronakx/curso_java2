/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author progr
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona();
        persona1.crearPersona();
        if (persona1.calcularImc() == -1) {
            System.out.println(persona1.nombre + " Estás debajo de tu peso ideal");
        } else if (persona1.calcularImc() == 0) {
            System.out.println(persona1.nombre + " Estás en tu peso ideal");
        } else {
            System.out.println(persona1.nombre + " Estás por encima de tu peso ideal");
        }

        if (persona1.validarEdad() == false) {
            System.out.println(persona1.nombre + " Es menor de edad");
        } else {
            System.out.println(persona1.nombre + " Es mayor de edad");
        }

        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

    }

}
