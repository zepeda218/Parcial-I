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
public class ListaDoble {

    private NodoDoble cabeza;
    private int size;

    public ListaDoble() {
        this.cabeza = null;
        this.size = 0;
    }

    public NodoDoble getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoDoble cabeza) {
        this.cabeza = cabeza;
    }

    public int size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return cabeza == null;
    }

    @Override
    public String toString() {
        String str = "";
        NodoDoble aux = cabeza;
        while (aux != null) {

            str += " " + aux.getDato() + " ";
            aux = aux.getSig();
        }

        return str;
    }

    public boolean add(String n) {
        NodoDoble nuevo = new NodoDoble(n);
        NodoDoble aux = cabeza;
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            while (aux.getSig() != null) { //AUX.GETSIG para que revise todos
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
            nuevo.setAnt(aux);
        }
        size++;
        return true;
    }

    public boolean addFirst(String n) {
        NodoDoble nuevo = new NodoDoble(n);
        NodoDoble aux = cabeza;

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            nuevo.setSig(cabeza);
            cabeza.setAnt(nuevo);
            cabeza = nuevo;
        }
        size++;
        return true;
    }

    public int indexOf(String eABusc) {
        int count = 1;
        NodoDoble aux = cabeza;
        boolean flag = false;
        while (size > count) {
            if (eABusc != aux.getDato()) {
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

    public boolean addIn(int posicion, String n) {
        NodoDoble nuevo = new NodoDoble(n);
        NodoDoble aux = cabeza;
        
        while (cabeza != null) {
        
        
        }
        
        if (posicion == 0) {
            cabeza = nuevo;
            
        } else if (true) {
            
        }
//si agrega al principio
//si agrega al final
//si agrega en medio

        return true;
    }

    public boolean remove(int index) {
        //hacer para la cabeza
        if (size == 0) {
            return false;
        } else {
            NodoDoble aux = cabeza;
            for (int i = 0; i < index; i++) {
                aux = aux.getSig();
            }

            aux.getAnt().setSig(aux.getSig());
            aux.getSig().setAnt(aux.getAnt());
        }
        size--;
        return true;
    }

    public boolean shake (int index){
        if (index > size) {
            System.out.println("Error");
        }
        else {
            
        }
{
        
        }
//cabeza al indice
      //      ultimo indice -2
        
        
    return true;
    }

}
