
package Punto1;

/**
 *
 * @author Luis Fabian
 */
public class Ejecutor {
    public static void main(String[] args) {
        Entrenador e =new Entrenador(1547,"Jose","Donado",43,"Chapecoence"); 
        System.out.println(e.retornarDatos());
        
        Futbolista f =new Futbolista(9465,"Daniel","Rodrigo",21,"Delantero",2);
        System.out.println(f.retornarDatos());
        
        Masajista ma =new Masajista(9634,"Luis","Segundo",34,"Profesional",12);
        System.out.println(ma.retornarDatos());
    }
   
}
