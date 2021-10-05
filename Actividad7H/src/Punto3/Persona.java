/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

/**
 *
 * @author Luis Fabian
 */
public class Persona {
    private String nombre;
    private String infoid;
    
    public Persona(String nombre,String infoid){
    this.nombre = nombre;    
    this.infoid = infoid;
    }
    public Persona(String infoid){
    this.nombre="Nelson";
    this.infoid=infoid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfoid() {
        return infoid;
    }

    public void setInfoid(String infoid) {
        this.infoid = infoid;
    }
    @Override
    public String toString(){
   
       return "Nombre: "+getNombre() +" infoid: "+getInfoid();

    
    }
    
}
