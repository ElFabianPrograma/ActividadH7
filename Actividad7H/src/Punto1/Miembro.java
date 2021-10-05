
package Punto1;

/**
 *
 * @author Luis Fabian
 */
public class Miembro {
    private int id;
    private String nombre,apellido;
    private int edad;
    
    public Miembro(){    
    }
    
    public Miembro(int id,String nombre,String apellido,int edad){
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String retornarDatos(){
    return "Id: " + this.id + "\n" +
            "Name: " + this.nombre + "\n"+
            "Apellido: " + this.apellido +"\n"+
            "Age: " + this.edad + "\n";
    
    }   
}
