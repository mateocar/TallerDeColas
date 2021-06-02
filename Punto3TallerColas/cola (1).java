package com.mycompany.cola;

public class cola {

    private ListaEnlazadaDoble doble;

    public cola() {
        this.doble= new ListaEnlazadaDoble();
     }

    public ListaEnlazadaDoble getDoble() {
        return doble;
    }

    public void setDoble(ListaEnlazadaDoble doble) {
        this.doble = doble;
    }
    
   public void encolar(String nuevo){
      
       doble.Agregar(nuevo);
   
   }
   
   public void desencolar(){
       
       doble.Recorrer();
   }
        
    
   

   
}

