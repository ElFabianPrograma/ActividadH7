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
public class Futbolista extends Miembro{
 private String demarcacion;   
 private int dorsal;
 
 public Futbolista(){
 super();
 }
 
 public Futbolista(int id,String nombre,String apellido,int edad,String demarcacion,int dorsal){
 super(id,nombre,apellido,edad);
 this.demarcacion=demarcacion;
 this.dorsal=dorsal;
 }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
 
 @Override    
public String retornarDatos(){
    
    return super.retornarDatos()+
            "Demarcacion: " + this.demarcacion + "\n" +
            "Dorsal: " + this.dorsal + "\n";
}
 
}
