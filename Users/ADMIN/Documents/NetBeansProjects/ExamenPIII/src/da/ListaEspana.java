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
public class ListaEspana {

    private NodoEspana cabeza;
    private int size = 0;
    private int cont = 0;

    public ListaEspana() {
        cabeza = null;
        size = 0;
    }

    public NodoEspana getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoEspana cabeza) {
        this.cabeza = cabeza;
    }

    public int size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    /**
     * <h1> toString </h1>
     * Shows all the elements of the list
     *
     * @return String the elements of the list
     */
    @Override
    public String toString() {
        String str = "";
        NodoEspana aux = cabeza;
        while (aux != null) { //recorre la lista
            //concatena todos los elementos del jugador
            str += " " + aux.getDato().getNombre() + " " + aux.getDato().getApellido() + " "
                    + aux.getDato().getEdad() + " " + aux.getDato().getPosicion() + "\n";
            aux = aux.getSig();
        }

        return str;
    }

    /**
     * <h2> add </h2>
     * Saves the player's info
     *
     * @param nombre player's name
     * @param apellido player's last name
     * @param edad player's age
     * @param posicion player's position
     * @param titular main player o backup
     * @return boolean the result of the operation
     */
    public boolean add(String nombre, String apellido, int edad, String posicion, boolean titular) {
        Jugador jugador = new Jugador(nombre, apellido, edad, posicion, titular);
        NodoEspana nuevo = new NodoEspana(jugador);
        NodoEspana aux = cabeza;

        if (cabeza == null) {
            cabeza = nuevo; //añade el nodo de primero
        } else {
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            //enlaza el nodo nuevo con su nodo anterior
            aux.setSig(nuevo);
            nuevo.setAnt(aux);
        }
        size++;

        return true;
    }

    /**
     * <h3>convertTo</h3>
     *
     * @param posicion receives the players position converts the players
     * position into a number so it can be easier to order the player
     * @return int the number of the position
     */
    public int convertTo(String posicion) {
        int pos = 0;
        switch (posicion) {
            case "Portero":
                pos = 0;
                break;
            case "Defensa":
                pos = 1;
                break;
            case "Mediocampista":
                pos = 2;
                break;
            case "Delantero":
                pos = 3;
                break;
        }
        return pos;
    }

    /**
     * <h4>positionSorting</h4>
     * Sorts the list by players position: goalkeeper, deffense, midfield,
     * forward
     *
     * @return boolean the result of the operation
     */
    public boolean positionSorting() {
        NodoEspana aux = cabeza;
        NodoEspana aux2 = aux.getSig();

        int con = 0;

        while (con != size) {

            while (aux2 != null) {

                //si el primer nodo es mayor que el segundo
                if (convertTo(aux.getDato().getPosicion()) > convertTo(aux2.getDato().getPosicion())) {

                    if (aux == cabeza) { //si se encuentra al principio
                        //los enlaces del primero se enlazan con el tercer nodo
                        aux.setSig(aux2.getSig());
                        aux.getSig().setAnt(aux);
                        //muevo el segundo nodo de primero
                        aux2.setSig(aux);
                        aux2.setAnt(null);
                        aux.setAnt(aux2);
                        //segundo nodo se vuelve cabeza
                        this.setCabeza(aux2);

                    } else if (aux2.getSig() == null) { //si se encuentra al final

                        //los enlaces del antepenultimo se enlazan con el ultimo nodo
                        aux.getAnt().setSig(aux2);
                        aux2.setAnt(aux.getAnt());
                        aux.setSig(null);
                        //muevo el penultimo nodo de ultimo
                        aux2.setSig(aux);
                        aux.setAnt(aux2);

                    } else { //si no se encuentra en el principio ni el final de la lista
                        //los enlaces del nodo se enlazan con el segundo que le sigue
                        aux.setSig(aux2.getSig());
                        aux.getSig().setAnt(aux);
                        //muevo el nodo
                        aux2.setSig(aux);
                        aux2.setAnt(aux.getAnt());
                        aux.getAnt().setSig(aux2);
                        aux.setAnt(aux2);

                    }
                    //renombro los auxiliares a sus valores principales
                    aux = aux2;
                    aux2 = aux.getSig();

                }

                aux = aux.getSig();
                aux2 = aux.getSig();

            }

            con++;
            aux = cabeza;
            aux2 = aux.getSig();
        }

        return true;
    }

    /**
     * <h5>associateMarks</h5>
     * associates the Espanish team players with their correspondant markers
     *
     * @param lista receives the Chilean team list
     * @return String the players with their respective markers
     */
    public String associateMarks(ListaDoble lista) {
        NodoEspana aux = cabeza;
        Nodo aux2 = lista.getCabeza();
        String str = "";
        int con = 0;
        int con2 = 0;

        while (aux.getSig() != null) {
            if (aux.getDato().getPosicion().equals("Defensa")) {
                con++;
            }
            aux = aux.getSig();
        }

        aux = cabeza;
        while (con2 <= con) {

            while (!aux.getDato().getPosicion().equals("Defensa")) {
                aux = aux.getSig();
            }
            //anade a la cadena el defensa que encuentre
            str += " " + aux.getDato().getNombre() + " " + aux.getDato().getApellido();

            while (!aux2.getDato().getPosicion().equals("Delantero")) {
                aux2 = aux2.getSig();
            }

            str += "-" + aux2.getDato().getNombre() + " " + aux2.getDato().getApellido() + "\n";
            aux = aux.getSig();
            aux2 = aux2.getSig();
            con2++;
        }
        aux = cabeza;
        aux2 = lista.getCabeza();
      //  con = 0;
      //  con2 = 0;
        str += "\n";

        while (aux.getSig() != null) {
            if (aux.getDato().getPosicion().equals("Mediocampista")) {
                con++;
            }
            aux = aux.getSig();
        }

        aux = cabeza;
        while (con2 <= con) {

            while (!aux.getDato().getPosicion().equals("Mediocampista")) {
                aux = aux.getSig();
            }
            //anade a la cadena el defensa que encuentre
            str += " " + aux.getDato().getNombre() + " " + aux.getDato().getApellido();

            while (!aux2.getDato().getPosicion().equals("Mediocampista")) {
                aux2 = aux2.getSig();
            }

            str += "-" + aux2.getDato().getNombre() + " " + aux2.getDato().getApellido() + "\n";

            aux = aux.getSig();
            aux2 = aux2.getSig();
            con2++;
        }

        aux = cabeza;
        aux2 = lista.getCabeza();
        str += "\n";

        
           while (aux.getSig() != null) {
            if (aux.getDato().getPosicion().equals("Delantero")) {
                con++;
            }
            aux = aux.getSig();
        }

        aux = cabeza;
        while (con2 <= con) {

            while (!aux.getDato().getPosicion().equals("Delantero")) {
                aux = aux.getSig();
            }
            //anade a la cadena el defensa que encuentre
            str += " " + aux.getDato().getNombre() + " " + aux.getDato().getApellido();

            while (!aux2.getDato().getPosicion().equals("Defensa")) {
                aux2 = aux2.getSig();
            }

            str += "-" + aux2.getDato().getNombre() + " " + aux2.getDato().getApellido() + "\n";

            aux = aux.getSig();
            aux2 = aux2.getSig();
            con2++;
        }

        str += "\n";
        
        return str;
    }

}
