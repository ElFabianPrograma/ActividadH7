/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

/**
 *
 * @author Luis Fabian
 */
public class Oficial extends Operario{
    
    public Oficial(String Nombre) {
        super(Nombre);
    }
    
    
   
    @Override
    public String toString(){
    //return "Empleado: " +getNombre()+"---> Operativo"+" ---> Oficial"  ;
    return super.toString()+"--->Oficial";
    
    }   
    
}
