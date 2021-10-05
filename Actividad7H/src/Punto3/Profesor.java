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
public class Profesor extends Persona{
    private String id;
    
    

    public Profesor(String nombre, String id,String infoid) {
        super(nombre,infoid);
        this.id=id;
    }   
    
    public Profesor(String id,String infoid){
    super(infoid);
    this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
   
      // return "Nombre: "+getNombre() +" infoid: "+getInfoid()+ " id de profesor: "+getId();
      return super.toString()+"Id de profesor: "+getId();

    
    }
    
}
