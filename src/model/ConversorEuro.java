/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;


public class ConversorEuro  extends ConversorMonedas{
    public ConversorEuro(){
        
        super(700.1);
    }
    
    public double euroApesos(double cantidad){
        
        return euroAmoneda(cantidad);
    }
    
    public double pesosAeuro(double cantidad){
        
        return pesosAeuros(cantidad);
    }
}
