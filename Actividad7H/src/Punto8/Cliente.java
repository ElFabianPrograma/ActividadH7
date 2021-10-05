/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8;

/**
 *
 * @author Luis Fabian
 */
public class Cliente {
    private long NumCuenta;
    private double Saldo;
   
    
    public Cliente(long NumCuenta, double Saldo){
    this.NumCuenta=NumCuenta;
    this.Saldo=Saldo; 
    
    }

    public long getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(long NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
   
    @Override
    public String toString(){
    return "Numero de cuenta: "+NumCuenta+"\nSu saldo es: "+Saldo;
    }   
    
    
    }
    
    
    
    
    

