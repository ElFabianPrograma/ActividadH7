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
public class Portatil extends Ordenador {
    private int peso;

    public Portatil(int Cog, int precio,int peso) {
        super(Cog, precio);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    @Override
    public String toString(){
        
    return "Adquirio un Ordenador----> Tipo portatil" + "El precio es---> $"+getPrecio()+" Su pedo es de:"+getPeso() + "k Y es el que menos pesa, ideal para viajes\n"
            +"Su codigo es---->"+getCog();    

}
}
