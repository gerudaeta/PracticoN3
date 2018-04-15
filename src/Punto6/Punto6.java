/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author germa
 */
public class Punto6 {
    public static void main(String[] args) {
        
        ArrayList<Rectangulo> arrayListRectangulos = new ArrayList<Rectangulo>();
        Rectangulo rectangulo = new Rectangulo();
        
        rectangulo = new Rectangulo();
        rectangulo.setBase(8);
        rectangulo.setAltura(4);
        rectangulo.setPuntoX(4);
        rectangulo.setPuntoY(8);
        arrayListRectangulos.add(0, rectangulo);
        
        rectangulo = new Rectangulo();
        rectangulo.setBase(8.5);
        rectangulo.setAltura(3);
        rectangulo.setPuntoX(2.4);
        rectangulo.setPuntoY(0.4);
        arrayListRectangulos.add(1, rectangulo);
        
        rectangulo = new Rectangulo();
        rectangulo.setBase(2.5);
        rectangulo.setAltura(8);
        rectangulo.setPuntoX(9);
        rectangulo.setPuntoY(4);
        arrayListRectangulos.add(2, rectangulo);
        
        //Metodo size, indica el numero de elementos de la lista
        System.out.println("Existen " + arrayListRectangulos.size() + " elementos en el ArrayList");
        
        
        //Metodo Iterator, util para recorrer un arrayList         
        System.out.println("ITERATOR");
        System.out.println("Elementos del ArrayList");
        Iterator<Rectangulo> it = arrayListRectangulos.iterator();        
        while (it.hasNext()){
            rectangulo = it.next();
            rectangulo.mostrarRectangulo();
        }
        
        System.out.println("Ingrese la posicion que desea eliminar de la lista: ");
        Scanner scanner = new Scanner(System.in);
        int posicion = scanner.nextInt();
            
        if(posicion > arrayListRectangulos.size()){
                System.out.println("Ingrese un valor correcto");
        } else {
            arrayListRectangulos.remove(posicion);
            System.out.println("La posicion: " + posicion + " se elimino correctamente");
                
            System.out.println("Lista Final");
            System.out.println("Hay: " + arrayListRectangulos.size() + " elementos en la lista");
            Iterator<Rectangulo> arrayListFinal = arrayListRectangulos.iterator();        
            while (arrayListFinal.hasNext()){
                rectangulo = arrayListFinal.next();
                rectangulo.mostrarRectangulo();
            }
        }
    }
}
