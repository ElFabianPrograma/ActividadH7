/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto7;


public class Instancias {
    public static void main(String[] args) {
        
        Vehiculo v = new Vehiculo(103672, "Mazda", 2015, 20000);
        System.out.println(v.ToString()+"\n-------------------------------------");
        
        Compactos c= new Compactos(327862, "BMW", 2018, 52000, 4);
        System.out.println(c.ToString());
        System.out.println("Auto Compacto"+"\n----------------------------------");
        
        Lujosos L = new Lujosos(456678, "Subaru", 2021, 6000000, 2, 400);
        System.out.println(L.ToString()+"\n-------------------------------------");
        
        Vagonetas V = new Vagonetas(740098, "Land Rover", 2011, 40000, 7, "Trasera");
        System.out.println(V.ToString()+"\n-------------------------------------");
        
        Camionetas C = new Camionetas(141126, "Porsche", 2019, 65000, 600, 2, 1);
        System.out.println(C.ToString()+"\n-------------------------------------");
        
    }
        
}
