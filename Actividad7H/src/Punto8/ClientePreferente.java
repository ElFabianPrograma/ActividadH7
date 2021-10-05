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
public class ClientePreferente extends Cliente {
    private double FonInversion;
    
    public ClientePreferente(long NumCuenta, double Saldo, double FonInversion) {
        super(NumCuenta, Saldo);
        this.FonInversion=FonInversion;        
    }    

    public double getFonInversion() {
        return FonInversion;
    }

    public void setFonInversion(double FonInversion) {
        this.FonInversion = FonInversion;
    }
    
    @Override
    public String toString(){        
        
     double Final= getSaldo()*FonInversion;   
        
    return super.toString()+"\n Su comision es: "+Final;
    
    } 

    }
    

