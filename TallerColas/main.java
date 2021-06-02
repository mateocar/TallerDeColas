/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerColas;

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
        
        System.out.println(col.Encolar(9));
        System.out.println(col.Encolar(7));
        System.out.println(col.getElementos()[0]);
        System.out.println(col.getElementos()[1]);
        System.out.println(col.Desencolar());
        System.out.println(col.Desencolar());
        System.out.println(col.Desencolar());
    }
    
}
