/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author progr
 */
public class Cuenta {
    Scanner leer = new Scanner(System.in);
    public Integer numeroCuenta;
    public Long dni;
    public Double saldoActual;

    //Constructor vacío
    public Cuenta() {
    }
    
    //Constructor con todos los datos

    public Cuenta(Integer numeroCuenta, Long dni, Double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }
    //Getters
    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public Long getDni() {
        return dni;
    }

    public Double getSaldoActual() {
        return saldoActual;
    }
    
    
    //Setters

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(Double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void CuentaBanco(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de cuenta");
        this.numeroCuenta=leer.nextInt();
        System.out.println("Ingrese el DNI: ");
        this.dni=leer.nextLong();
        System.out.println("Ingrese el saldo: ");
        this.saldoActual=leer.nextDouble();
        double interes=0;
       
    }
    
    public void Ingresar(){
        Scanner leer = new Scanner(System.in);
        double monto;
        System.out.println("Ingrese la cantidad del depósito: ");
        monto=leer.nextDouble();
        System.out.println("El saldo actual es: "+(monto+this.saldoActual));
        this.saldoActual=this.saldoActual+monto;
    }
   public void Retiro(){
        Scanner leer = new Scanner(System.in);
        double monto;
        System.out.println("Ingrese la cantidad del retiro: ");
        monto=leer.nextDouble();
        if (monto>this.saldoActual){
            System.out.println("Saldo actual $0.00");
        }else
        {
        System.out.println("El saldo actual es: "+(this.saldoActual-monto));
        }
        this.saldoActual=this.saldoActual-monto;
    }   
   
   public void RetiroExpress (){
        double monto;
        System.out.println("Ingrese la cantidad del retiro Exprress: ");
        monto=leer.nextDouble();
        if (monto<=(this.saldoActual*0.2)) {
            System.out.println("El saldo actual es: "+this.saldoActual);
        }else {
            System.out.println("El retiro excede el 20% del saldo actual. Intente de nuevo");
        }
        this.saldoActual=this.saldoActual-monto;
   }
   public void  ConsultarSaldo(){
       System.out.println("El saldo actual es: "+this.saldoActual);
       
   }
   
   public void DatosCliente(){
       System.out.println("Datos del cliente");
       System.out.println("Número de cuenta: "+this.numeroCuenta);
       System.out.println("DNI: "+this.dni);
       System.out.println("Saldo actual: $"+this.saldoActual);
       
   }
   
}

