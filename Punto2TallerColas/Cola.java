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
public class Cola {

    private ListaSimple lista;
   

   // public Cola() {
       // this.lista = null;       
    //}

    public Cola() {
        this.lista = new ListaSimple();
    }

    public ListaSimple getLista() {
        return lista;
    }

    public void setLista(ListaSimple lista) {
        this.lista = lista;
    }

    public void Encolar(int dato) {
        lista.AgregarUltimo(dato);
        System.out.println(lista.getCabeza().getDato());
    }

    public void Desencolar() {
        lista.suprimirCabeza();
        System.out.println(lista.getCabeza().getDato());
    }

}
