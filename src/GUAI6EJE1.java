/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OMAR OCARANZA
 */
public class GUAI6EJE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        public class Omar {
    
package ejGuia;
import java.util.Scanner;

public class libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private String autor1;
    private int numPaginas;
    
    public libro() {
        
    }
    
    public libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    public void cargarLibroDesdeTeclado() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de ISBN:");
        this.ISBN = leer.next();
        System.out.println("Ingrese el título del libro:");
        this.titulo = leer.next();
        System.out.println("Ingrese el nombre del autor:");
        this.autor = leer.next();
        System.out.println("Ingrese el número de páginas del libro:");
        this.numPaginas = leer.nextInt();
        leer.close();

    }
    
    public void imprimirDatosLibro() {
        System.out.println("Número de ISBN: " + this.ISBN);
        System.out.println("Título del libro: " + this.titulo);
        System.out.println("Nombre del autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
        
    }
    

     
}
