/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

/**
 *
 * @author Luis Fabian
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Trapecio T = new Trapecio(14,5,21);
        System.out.println(T);
        
        Rectangulo R = new Rectangulo(10,5);
        System.out.println(R);
        
        Cuadrado C = new Cuadrado(6,6);
        System.out.println(C);
    }
    
}
