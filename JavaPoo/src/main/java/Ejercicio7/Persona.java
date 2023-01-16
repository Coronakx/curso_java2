/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author progr
 */
public class Persona {
    Scanner leer = new Scanner(System.in);
    
 
    
    public String nombre;
    public int edad;
    public String sexo;
    public double peso;
    public double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Scanner getLeer() {
        return leer;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public void crearPersona(){
        leer.useDelimiter("\n");
        String opcion;
        System.out.println("Ingresa el nombre de la persona:");
        this.nombre=leer.next();
        System.out.println("Ingresa la edad: ");
        this.edad= leer.nextInt();
        System.out.println("Ingresa su peso en kg: ");
        this.peso=leer.nextDouble();
        System.out.println("Ingresa el sexo (H/M/O): ");
        opcion=leer.next();
        if (opcion.equalsIgnoreCase("H")|| opcion.equalsIgnoreCase("M")||opcion.equalsIgnoreCase("O")) {
            this.sexo=opcion;
        }else {
            System.out.println("Opción inválida");
        }
    
            
        }
        
        public int calcularImc(){
         double imc;
         imc=this.peso/Math.pow(this.altura, 2);
         if (imc<20) {
             return -1;
        }else if (imc>=20&&imc<=25) {
            return 0;
         }else {
            return 1;
        }
         
    }

    public boolean validarEdad() {
        boolean mayoria=false;
        if (this.edad<18) {
        }else {
            mayoria=true;
        }
        return mayoria; 
    }
    
    
}
