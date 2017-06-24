/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listafinal;

/**
 *
 * @author ADMIN
 */
public class Nodo {
 private int Dato;
 private Nodo sig;

    public Nodo(int Dato) {
        this.Dato = Dato;
        this.sig = sig;
    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
 
 
}
