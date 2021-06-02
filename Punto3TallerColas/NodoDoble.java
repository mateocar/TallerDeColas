
package com.mycompany.cola;


public class NodoDoble {


     private NodoDoble anterior, siguiente;
    private String dato;

    //constructor para cuando ya haya nodos
    public NodoDoble(NodoDoble anterior, String dato, NodoDoble siguiente) {
        this.anterior = anterior;
        this.dato = dato;
        this.siguiente = siguiente;
    }

      public NodoDoble(String dato) {
        this(null, dato, null);
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
    
}
