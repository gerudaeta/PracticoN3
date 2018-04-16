/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class TestEjer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de cuotas");
        int num = scanner.nextInt();
         CuotaPro [] cuotas = new CuotaPro [num];
        
        double preuni = 1000;
        double total=0;
        for (int i=0;i < cuotas.length; i++){
            CuotaPro c1 = new CuotaPro("115", "cuentas de gas", preuni );
            cuotas [i] = c1;
            preuni = preuni + (preuni*1.5/100);
            total = total + preuni;
        }
        
        for (CuotaPro c:cuotas){
            c.obtenerCuota();
        }
        
        System.out.println("Total a pagar: " + total);
    }
}
