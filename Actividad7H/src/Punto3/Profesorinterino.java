/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.util.Date;

/**
 *
 * @author Luis Fabian
 */
public class Profesorinterino extends Profesor{
    private Date Fecha;

   
    public Profesorinterino(String nombre,String id, String infoid,Date Fecha) {
        super(nombre, id, infoid);
        this.Fecha=Fecha;
    }
    public Profesorinterino(Date Fecha,String infoid,String id){
    super(infoid,id);
    this.Fecha=Fecha;
    
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    @Override
   public String toString(){
   
       //return "Nombre: "+getNombre() +" infoid: "+getInfoid()+ " id: "+getId()+" Fecha: "+Fecha;
       return super.toString()+"Fecha: "+Fecha;
      


}
    
}
