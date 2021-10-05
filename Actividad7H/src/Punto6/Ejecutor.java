/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

/**
 *
 * @author Luis Fabian
 */
public class Ejecutor {
public static void main(String[] args) {
        EmpleadoBasico eb = new EmpleadoBasico(40, 200);
        System.out.println("Sueldo Empleado Basico : " + eb.calcularSueldo());
        
        EmpleadoPorComision ec = new EmpleadoPorComision(5000, 0.05, 40, 200);
        System.out.println("Sueldo empleado por comision: " + ec.calcularSueldo());
        
        
        
    }
    
}