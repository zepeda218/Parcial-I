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
public class ListaFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
ListaDoble ld = new ListaDoble ();
ld.add("e");
ld.add("b");
ld.add("n");
System.out.println(ld.toString());
ld.addFirst("a");
System.out.println(ld.toString());
ld.remove(2);
System.out.println(ld.toString());


//     ListaSimple ls = new ListaSimple();
//ls.add(12);
//ls.add(3);
//ls.add(5);
//ls.add(9);
//     System.out.println (ls.toString()); 
//     ls.addFirst(4);
//     System.out.println (ls.toString()); 
//     ls.addLast(8);
//     ls.addLast (10);
//     System.out.println (ls.toString()); 
//     System.out.println (ls.indexOf(12));

// TODO code application logic here
    }
    
}
