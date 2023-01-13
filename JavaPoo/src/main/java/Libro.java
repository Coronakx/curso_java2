
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author progr
 */
public class Libro {

    public Integer isbn;
    public String titulo;
    public String autor;
    public Integer numeroPagina;

    public Libro() {
    }

    public Libro(Integer isbn, String titulo, String autor, Integer numeroPagina) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }

    public void InfoLibro() {
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        System.out.println("Ingrese el ISBN: ");
        this.isbn = leer.nextInt();
        System.out.println("Ingrese el autor: ");
        this.autor = leer.next();
        System.out.println("Ingrese el número de páginas: ");
        this.numeroPagina = leer.nextInt();
        System.out.print("Ingrese el título: ");
        this.titulo = leer.next();

    }

    public void Imprimir() {
        System.out.println("El ISBN es: " + this.isbn);
        System.out.println("El título es: " + this.titulo);
        System.out.println("El autor es: " + this.autor);
        System.out.println("El número de páginas es: " + this.numeroPagina);

    }

}
