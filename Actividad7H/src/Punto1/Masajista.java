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
public class Masajista extends Miembro{
    private String titulacion;
    private int añosexperiencia;        
    
    public Masajista(int id,String nombre,String apellido,int edad,String titulacion,int añosexperiencia){
 super(id,nombre,apellido,edad);
 this.titulacion=titulacion;
 this.añosexperiencia=añosexperiencia;
 }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosexperiencia() {
        return añosexperiencia;
    }

    public void setAñosexperiencia(int añosexperiencia) {
        this.añosexperiencia = añosexperiencia;
    }
    @Override    
public String retornarDatos(){
    
    return super.retornarDatos()+
            "Titulacion: " + this.titulacion + "\n" +
            "Años de experiencia: " + this.añosexperiencia + "\n";
}
}
