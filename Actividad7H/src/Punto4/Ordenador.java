/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

/**
 *
 * @author Luis Fabian
 */
public class Ordenador {
    private int Cog;
    private int precio;
    
    public Ordenador(int Cog,int precio){
        this.Cog =  Cog;
        this.precio = precio;
    
    }

    public int getCog() {
        return Cog;
    }

    public void setCog(int Cog) {
        this.Cog = Cog;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        
    return "Adquirio un Ordenador";    

}
}
