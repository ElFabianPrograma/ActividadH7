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
public class Rectangulo extends Cuadrilatero{
    
    public Rectangulo(int x, int y) {
        super(x, y);
    }
    
    @Override
    public String toString(){
    
    return super.retornarDatos()+"Rectangulo: "+(getX()*getY());
    }
}
