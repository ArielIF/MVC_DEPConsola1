/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;


public class ConversorDolaresPesos extends ConversorMonedas {
    
    public ConversorDolaresPesos(){
        
        super(547.43);
    }
    
    public double dolaresApesos(double cantidad){
        
        return dolaresAmoneda(cantidad);
    }
    
    public double pesosAdolares(double cantidad){
        
        return monedaAdolares(cantidad);
    }
}
