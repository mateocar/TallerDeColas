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
public class Cola {

    private int[] elementos;
    private int NumMaxElementos;
    private static final int NumElementosDefec = 5;
    private int frente;
    private int fin;

    public Cola(int NumElementos) {
        this.NumMaxElementos = NumElementos;
        this.elementos = new int[NumMaxElementos];
        this.frente = 0;
        this.fin = 0;
    }

    public Cola() {
        this.NumMaxElementos = NumElementosDefec;
        this.elementos = new int[NumMaxElementos];
        this.frente = 0;
        this.fin = 0;
    }

    public int[] getElementos() {
        return elementos;
    }

    public void setElementos(int[] elementos) {
        this.elementos = elementos;
    }

    public int getNumMaxElementos() {
        return NumMaxElementos;
    }

    public void setNumMaxElementos(int NumMaxElementos) {
        this.NumMaxElementos = NumMaxElementos;
    }

    public int getFrente() {
        return frente;
    }

    public void setFrente(int frente) {
        this.frente = frente;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }
    
    
    
    

    public boolean Encolar(int NuevoElemento) {
        if (Islleno()) {
            return false;
        } else {     
            elementos[fin]=NuevoElemento;
            fin++;
            return true;
        }
    }

    public int Desencolar() {
        if(Isvacia()){
         return -1;
        }else{
            int ElementoRetornar=elementos[frente];
            frente++;
            return ElementoRetornar;            
        }

    }

    public boolean Islleno() {
        return fin >= NumMaxElementos;
    }
    
    public boolean Isvacia(){
    return fin==frente;
    }

}
