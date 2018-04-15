/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author germa
 */
public class Punto8 {
    
    public static void main(String[] args){
        
        ArrayList<Libro> librosArray = new ArrayList<Libro>();
        
        System.out.println("Ingrese el ISBN del libro: ");
        Scanner scanner1 = new Scanner(System.in);
        int isbn = scanner1.nextInt();        
         
        System.out.println("Ingrese el Titulo del libro: ");
        Scanner scanner2 = new Scanner(System.in);
        String tituloLibro = scanner2.nextLine();
        
        System.out.println("Ingrese el Autor del libro: ");
        Scanner scanner3 = new Scanner(System.in);
        String autorLibro = scanner3.nextLine();
        
        System.out.println("Ingrese el Precio del libro: ");
        Scanner scanner4 = new Scanner(System.in);
        int precioLibro = scanner4.nextInt();
        
       
    }
}
