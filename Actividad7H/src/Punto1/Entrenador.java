/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author Luis Fabian
 */
public class Entrenador extends Miembro {
    String federacion;
    public Entrenador(int id,String nombre,String apellido,int edad,String federacion){
 super(id,nombre,apellido,edad);
 this.federacion=federacion;
 
 }

    public String getFederacion() {
        return federacion;
    }

    public void setFederacion(String federacion) {
        this.federacion = federacion;
    }
    @Override
    public String retornarDatos(){
    return super.retornarDatos() + 
            "federacion: "+this.federacion + "\n" ;            
    }
}
