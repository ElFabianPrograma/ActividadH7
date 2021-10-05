/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto7;


public class Lujosos extends Compactos{
    private int vel;

    public Lujosos(long numseriemotor, String marca, int año, long precio, int cantpasaj,int vel) {
        super(numseriemotor, marca, año, precio, cantpasaj);
        this.vel=vel;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }
    
    @Override
    public String ToString(){
        System.out.println("Auto de Lujo");
        return super.ToString()+"\nVelocidad: "+this.vel+" Km/h";
    }
}
