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
public class Sobremesa extends Ordenador{
    private String torre;

    public Sobremesa(int Cog, int precio,String torre) {
        super(Cog, precio);
        this.torre=torre;
    }

    public String getTorre() {
        return torre;
    }

    public void setTorre(String torre) {
        this.torre = torre;
    }
    @Override
    public String toString(){
        
    return "Adquirio un Ordenador----> Tipo Sobremesa" + "El precio---> $"+getPrecio() +" Es de tipo Torre:"+getTorre() + " Y es el mas economico y pesado\n"
            +" Su codigo es---->"+getCog();    

}
}
