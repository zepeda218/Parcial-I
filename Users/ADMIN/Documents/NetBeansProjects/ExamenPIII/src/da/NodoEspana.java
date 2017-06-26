/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

/**
 *
 * @author ADMIN
 */
public class NodoEspana {

    private Jugador dato;
    private NodoEspana sig;
    private NodoEspana ant;

    public NodoEspana(Jugador dato) {
        this.dato = dato;
        this.sig = null;
        this.ant = null;
    }

    public Jugador getDato() {
        return dato;
    }

    public void setDato(Jugador dato) {
        this.dato = dato;
    }

    public NodoEspana getSig() {
        return sig;
    }

    public void setSig(NodoEspana sig) {
        this.sig = sig;
    }

    public NodoEspana getAnt() {
        return ant;
    }

    public void setAnt(NodoEspana ant) {
        this.ant = ant;
    }

}
