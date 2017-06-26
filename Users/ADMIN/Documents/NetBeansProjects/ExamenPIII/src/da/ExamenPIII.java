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
public class ExamenPIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDoble ld = new ListaDoble();
        //Chilean soccer team list
        ld.add("Ismael", "Fuentes", 28, "Defensa", true);
        ld.add("Claudio", "Bravo", 27, "Portero", true);
        ld.add("Waldo", "Ponce", 27, "Defensa", false);
        ld.add("Mauricio", "Isla", 21, "Defensa", true);
        ld.add("Pablo", "Contreras", 31, "Defensa", false);
        ld.add("Carlos", "Carmona", 23, "Mediocampista", true);
        ld.add("Alexis", "Sanchez", 21, "Delantero", true);
        ld.add("Arturo", "Vidal", 23, "Defensa", false);
        ld.add("Humberto", "Suazo", 29, "Delantero", true);
        ld.add("Jorge", "Valdivia", 26, "Mediocampista", false);
        ld.add("Mark", "Gonzalez", 25, "Delantero", true);
        ld.add("Miguel", "Pinto", 26, "Portero", false);
        ld.add("Marco", "Estrada", 27, "Mediocampista", true);
        ld.add("Matías", "Fernández", 24, "Mediocampista", false);
        ld.add("Jean", "Beausejour", 26, "Mediocampista", true);
        ld.add("Fabián", "Orellana", 24, "Delantero", false);
        ld.add("Gary", "Medel", 22, "Defensa", true);
        ld.add("Gonzalo", "Jara", 24, "Defensa", false);
        ld.add("Gonzalo", "Fierro", 27, "Delantero", true);
        ld.add("Rodrigo", "Millar", 28, "Mediocampista", false);
        ld.add("Rodrigo", "Tello", 30, "Mediocampista", false);
        ld.add("Esteban", "Paredes", 29, "Delantero", false);
        ld.add("Luis", "Marin", 27, "Portero", false);

//        ld.ageSorting(); //Sorts the list by players age
//        System.out.println(ld.toString()); //Prints the list
//        ld.playerExchange(); //Exchanges player "Suazo" for player "Pinilla"
//        System.out.println(ld.toString()); //Prints the new list
//        System.out.println(ld.printLineUp(1, 4, 1, 5)); //Prints the Chilean lineup

        ListaEspana le = new ListaEspana();
        //Spanish soccer team
        le.add("Gerard", "Pique", 23, "Defensa", true);
        le.add("Carles", "Puyol", 32, "Defensa", true);
        le.add("Andres", "Iniesta", 26, "Mediocampista", true);
        le.add("Xabi", "Alonso", 28, "Mediocampista", true);
        le.add("Sergio", "Ramos", 24, "Defensa", true);
        le.add("Fernando", "Torres", 26, "Delantero", true);
        le.add("Iker", "Casillas", 26, "Portero", true);
        le.add("Fernando", "Llorente", 25, "Delantero", true);
        le.add("David", "Silva", 24, "Mediocampista", true);
        le.add("Jesus", "Navas", 24, "Delantero", true);
        le.add("Alvaro", "Arbeloa", 27, "Defensa", true);

  //      le.positionSorting(); //Sorts the list by players position
  //      System.out.println(le.toString()); //Prints the list
        System.out.println(le.associateMarks(ld));
        
    }

}
