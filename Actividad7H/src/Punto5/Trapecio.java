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
public class Trapecio extends Cuadrilatero {
    private int x2;
    
    public Trapecio(int x,int y,int x2){
    super(x,y);
    this.x2=x2;
    
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }
    @Override
    public String toString(){
    
    return super.retornarDatos()+"Trapecio: "+((getX()+this.x2)/2)*getY();
    }
    
}
