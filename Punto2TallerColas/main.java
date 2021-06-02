/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2TallerColas;

/**
 *
 * @author mateo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cola col=new Cola();
       col.Encolar(9);
       col.Encolar(5); 
       col.Encolar(10);
       col.Desencolar();
       col.Desencolar();
       col.Encolar(20);
       col.Desencolar();
    }
    
}
