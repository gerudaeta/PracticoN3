/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author germa
 */
public class Punto8 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Libro> librosArray = new ArrayList<Libro>();
        Libro libro = new Libro();
        
        for(int i = 0; i < 3; i++){
            
            libro = new Libro();
            
            System.out.println("Ingrese el ISBN del libro: ");
            libro.setIsbn(scanner.nextInt());
            scanner.nextLine();//Limpiar buffer
            System.out.println("Ingrese el Titulo del libro: ");
            libro.setTitulo(scanner.nextLine());

            System.out.println("Ingrese el Autor del libro: ");
            libro.setAutor(scanner.nextLine());

            System.out.println("Ingrese el Precio del libro: ");
            libro.setPrecio(scanner.nextDouble());
            
            librosArray.add(libro);
            
            System.out.println("---------------------------");
            Iterator<Libro> it = librosArray.iterator();        
            while (it.hasNext()){
                libro = it.next();
                libro.mostrarLibros();
            }
        }
    }
}
