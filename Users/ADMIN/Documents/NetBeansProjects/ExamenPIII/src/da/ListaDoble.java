package da;

/**
 *
 * @author ADMIN
 */
public class ListaDoble {

    private Nodo cabeza;
    private int size = 0;

    public ListaDoble() {
        cabeza = null;
        size = 0;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public int size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * <h1> toString </h1>
     * Shows the elements of the list
     *
     * @return String the elements of the list
     */
    @Override
    public String toString() {
        String str = "";
        Nodo aux = cabeza;

        while (aux != null) { //recorre la lista
            //añadido para condicionar que solo muestren titulares
            if (aux.getDato().isTitular() == true) {
                //concatena todos los elementos del jugador
                str += " " + aux.getDato().getNombre() + " " + aux.getDato().getApellido() + " "
                        + aux.getDato().getEdad() + " " + aux.getDato().getPosicion() + "\n";

                aux = aux.getSig();

            } else {
                aux = aux.getSig();
            }
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
     * @param titular main player or backup
     * @return boolean the result of the operation
     */
    public boolean add(String nombre, String apellido, int edad, String posicion, boolean titular) {
        Jugador jugador = new Jugador(nombre, apellido, edad, posicion, titular);
        Nodo nuevo = new Nodo(jugador);
        Nodo aux = cabeza;
if (nombre != " " || apellido != " " || edad != 0 || posicion != ""){
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
}else{
    return false;
    }
    
        return true;
    }

    /**
     * <h3>ageSorting</h3>
     * Sorts the list by players age
     *
     * @return boolean the result of the operation
     */
    public boolean ageSorting() {
        Nodo aux = cabeza;
        Nodo aux2 = aux.getSig();

        int con = 0;

        while (con != size) {

            while (aux2 != null) {

                //si el primer nodo es mayor que el segundo
                if (aux.getDato().getEdad() > aux2.getDato().getEdad()) {

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
     * <h4>playerExchange</h4>
     * Exchanges Humberto "Chupete" Suazo for Mauricio Pinilla
     *
     * @return boolean the result of the operation
     */
    public boolean playerExchange() {
        Nodo aux = cabeza;
        //busca a Humberto Suazo
        while (!"Humberto".equals(aux.getDato().getNombre())
                && !"Suazo".equals(aux.getDato().getApellido())) {
            aux = aux.getSig();
        }

        //remueve a Humberto Suazo
        aux.getAnt().setSig(aux.getSig());
        aux.getSig().setAnt(aux.getAnt());
        
        //agrega a Mauricio Pinilla
        add("Mauricio", "Pinilla", 27, "Delantero", true);
        //reordena la lista
        ageSorting();

        return true;
    }

    /**
     * <h5>printLineUp</h5>
     * Prints the Chilean formation
     *
     * @param por goalkeeper
     * @param def number of defenses
     * @param med number of midfielders
     * @param del number of forwards
     * @return String the players names in formation
     */
    public String printLineUp(int por, int def, int med, int del) {
        int i = 0;
        String str = "";
        int sum = por + del + med + def; //total de jugadores en la cancha
        Nodo aux = cabeza;
        if (sum == 0){
            return str = "La alineacion no puede quedar vacia";
        }
        else if (sum > 11) {
            return str = "La alineación no puede ser mayor a 11";

        } else {

            if (por == 1) { //verifica si el portero es solo 1
                while (!aux.getDato().getPosicion().equals("Portero")) {
                    aux = aux.getSig();
                }
                //anade a la cadena el portero que encuentre
                str = " " + aux.getDato().getNombre() + " " + aux.getDato().getApellido();
                aux = cabeza;
                str += "\n";

                while (i < def) {  //ciclo para añadir hasta la cantidad de defensas deseados

                    while (!aux.getDato().getPosicion().equals("Defensa")) {
                        aux = aux.getSig();
                    }
                    //concatena los defensas que encuentre
                    str += " " + aux.getDato().getNombre() + " " + aux.getDato().getApellido() + " ";
                    aux = aux.getSig();
                    i++;
                }
                str += "\n";
                aux = cabeza;
                i = 0; //contador regresa a 0 para poder reutilizarse

                while (i < med) {

                    while (!aux.getDato().getPosicion().equals("Mediocampista")) {
                        aux = aux.getSig();
                    }
                    //concatena los mediocampistas que encuentre
                    str += " " + aux.getDato().getNombre() + " " + aux.getDato().getApellido() + " ";
                    aux = aux.getSig();
                    i++;
                }
                str += "\n";
                aux = cabeza;
                i = 0;

                while (i < del) {

                    while (!aux.getDato().getPosicion().equals("Delantero")) {
                        aux = aux.getSig();
                    }
                    //concatena los delanteros que encuentre
                    str += " " + aux.getDato().getNombre() + " " + aux.getDato().getApellido() + " ";
                    aux = aux.getSig();
                    i++;
                }
                str += "\n";

            } else {
                return str = "Solo puede existir un portero. Intente otra vez.";
            }
        }
        return str;
    }

}
