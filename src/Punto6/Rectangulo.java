/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

/**
 *
 * @author germa
 */
public class Rectangulo {
    
    // Atributos
    private double altura;
    private double base;
    private double puntoX;
    private double puntoY;

    public Rectangulo() {
    }

    public Rectangulo(double altura, double base, double puntoX, double puntoY) {
        this.altura = altura;
        this.base = base;
        this.puntoX = puntoX;
        this.puntoY = puntoY;
    }   
    
    // Getter & Setter
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getPuntoX() {
        return puntoX;
    }

    public void setPuntoX(double puntoX) {
        this.puntoX = puntoX;
    }

    public double getPuntoY() {
        return puntoY;
    }

    public void setPuntoY(double puntoY) {
        this.puntoY = puntoY;
    }
    
    
    //Metodos perimetro y area
    public double perimetroR(){
        return (2*this.base)+(2*this.altura);
    }
    
    public double areaR(){
        return this.base*this.altura;
    }
    
    public void mostrarRectangulo (){
        System.out.println("============ Rectangulo =============");
        System.out.println("La altura es: " + getAltura());
        System.out.println("La base es: " + getBase());
        System.out.println("P(X,Y) es: " + getPuntoX() + "," + getPuntoY());
        System.out.println("El perimetro es: " + perimetroR());
        System.out.println("El area es: " + areaR());
        System.out.println("---------------------------------");
    }
    
}
