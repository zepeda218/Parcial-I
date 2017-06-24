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
public class ListaSimple {
 private Nodo cabeza;
 private Nodo ultimo;
 private int size;

    public ListaSimple() {
        this.cabeza = null;
        this.ultimo = null;
        this.size = 0;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUlitmo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
 
 public boolean isEmpty (){
 return true;
 }
 
 public String toString (){
 String cadena = "";
 Nodo aux = cabeza;
     while (aux != null) {
 cadena+= " " + aux.getDato() + " ";
 aux = aux.getSig();
 }
     return cadena;
 }
 
 public boolean add (int n){
 Nodo nuevo = new Nodo(n);
 if (size == 0){
 cabeza = nuevo;
 ultimo = nuevo;
 } else {
 ultimo.setSig(nuevo);
 ultimo = nuevo;
 }
 size++;
     return true;
 }


 
 public boolean addFirst (int n){
 Nodo nuevo = new Nodo (n);
 Nodo aux = cabeza;
     if (size == 0){
 cabeza = nuevo;
 ultimo = nuevo;
 } else {
     nuevo.setSig(cabeza);
     cabeza = nuevo;
     }
     size++;     
 return true;
 }
 
 
 public boolean addLast (int n) {
 Nodo nuevo = new Nodo (n);
 Nodo aux = cabeza;
 if (size == 0) {
 cabeza = nuevo;
 ultimo = nuevo;
 } else {
 ultimo.setSig(nuevo);
 ultimo = nuevo;
 }
 size++;
 return true;
 } 
 
 
 public int indexOf (int numABuscar) {
 int count = 0;
 Nodo aux = cabeza;
 boolean flag = false;
 
 while (size > count && !flag){
     if (numABuscar != aux.getDato()){
 aux = aux.getSig();
 count++;
 } else {
         flag = true;
         break;    
         }
 }
 if (flag) {
     return count;
 } else {
 return -1;
 }
}
 
 public boolean addIn(int dato, int index) {
        if (index < 0 || index > size) { //si esta fuera de la lista
            throw new ArrayIndexOutOfBoundsException("El indice es invalido.");
        } else {
            Nodo nuevo = new Nodo(dato);

            if (0 == index) { //si quiere agregar de primero
                nuevo.setSig(cabeza);
                cabeza = nuevo;
            } else if (size == index) { //si quiere agregar de ultimo
                ultimo.setSig(nuevo);
                ultimo = nuevo;
            } else { //si esta dentro
                Nodo aux = cabeza;

                for (int i = 0; i < index - 1; i++) {
                    aux = aux.getSig();
                }

                nuevo.setSig(aux.getSig());
                aux.setSig(nuevo);
            }

            ++size;
            return true;
        }
    }
 
 
 //REMOVE
 //SACAR EL MENOR
 //REVERTIR


}