
package com.mycompany.cola;


public class ListaEnlazadaDoble {
  
    private NodoDoble primero;
    private NodoDoble ultimo;

    public ListaEnlazadaDoble(NodoDoble primero, NodoDoble ultimo) {

        this.primero = primero;
        this.ultimo = ultimo;
    }

    public ListaEnlazadaDoble() {

        this(null, null);
    }

    public NodoDoble getPrimero() {
        return primero;
    }

    public void setPrimero(NodoDoble primero) {
        this.primero = primero;
    }

    public NodoDoble getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoDoble ultimo) {
        this.ultimo = ultimo;
    }

    public boolean isVacia() {
        return primero == null && ultimo == null;
    }

    public void Agregar(String nuevo) {
        NodoDoble nuevoNodo = new NodoDoble(nuevo);
        if (isVacia()) {
            this.primero = this.ultimo = nuevoNodo;
            //this.primero.setSiguiente(nuevoNodo);
            //  System.out.println(this.ultimo.getDato());
        } else {
            //nuevoNodo.setSiguiente(this.primero);
            this.ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(this.ultimo);
            this.ultimo = nuevoNodo;
         
        }

    }
    
    
   /*    public void suprimirCabeza() {
        if (!isVacia()) {
            Cabeza = Cabeza.getSiguiente();
        }
    }*/
    
    
  
    public void Recorrer() {
        int controller = 0;
        if (!isVacia()) {
            NodoDoble aux = primero;
            while (aux != null) {
               
                System.out.print(aux.getDato()+" ");
                this.primero = this.primero.getSiguiente();
                aux = aux.getSiguiente();
                if(controller == 0){
                controller = 1;
                break;
                
                }
                
            }

        }
    }
}
