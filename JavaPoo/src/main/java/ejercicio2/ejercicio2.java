/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author progr
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia circunferencia = new Circunferencia();
        circunferencia.MetCirc();
        circunferencia.MetArea();
        circunferencia.MetPerim();
    }
  /*
    import java.util.Arrays;
    import java.util.*;
    
    double vec1=new double[50];
    double vec2=new double[20];
    int i;
    
    for (i=0; i<vec1.lenght;i++) {
        
        Arrays.sort(vec1);
        System.out.porintln(Arrays.toString(vec1));
        */
        
    import java.time.LocalDate;
    
    LocalDate fecha1= LocalDate.now; //fecha actual
    LocalDate fecha2= LocalDate.parse("2023-01-10);
                                      
    fecha2=fecha2.plusDays(8);
    fecha2=fecha2.plusMonths(5);
    fecha2=fecha2.plusYears(3);
    fecha2=fecha2.minusDays(4);                                   
    
}
