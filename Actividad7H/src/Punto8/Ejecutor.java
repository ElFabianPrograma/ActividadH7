/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8;

/**
 *
 * @author Luis Fabian
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        System.out.println("Cliente");
        Cliente c1 = new Cliente(1283473483,2000000);
        System.out.println(c1+"\n-------------------------");
        
        System.out.println("Cliente Preferente");
        ClientePreferente CP1 = new ClientePreferente(137503787,3000000,0.015);
        System.out.println(CP1+"\n-------------------------");
    }
    
}
