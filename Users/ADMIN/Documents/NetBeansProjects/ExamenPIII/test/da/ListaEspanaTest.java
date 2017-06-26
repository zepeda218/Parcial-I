/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class ListaEspanaTest {
    
    public ListaEspanaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCabeza method, of class ListaEspana.
     */
    @Test
    public void testGetCabeza() {
        System.out.println("getCabeza");
        ListaEspana instance = new ListaEspana();
        NodoEspana expResult = null;
        NodoEspana result = instance.getCabeza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCabeza method, of class ListaEspana.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        NodoEspana cabeza = null;
        ListaEspana instance = new ListaEspana();
        instance.setCabeza(cabeza);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class ListaEspana.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ListaEspana instance = new ListaEspana();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class ListaEspana.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 0;
        ListaEspana instance = new ListaEspana();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCont method, of class ListaEspana.
     */
    @Test
    public void testGetCont() {
        System.out.println("getCont");
        ListaEspana instance = new ListaEspana();
        int expResult = 0;
        int result = instance.getCont();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCont method, of class ListaEspana.
     */
    @Test
    public void testSetCont() {
        System.out.println("setCont");
        int cont = 0;
        ListaEspana instance = new ListaEspana();
        instance.setCont(cont);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaEspana.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaEspana instance = new ListaEspana();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ListaEspana.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String nombre = "";
        String apellido = "";
        int edad = 0;
        String posicion = "";
        boolean titular = false;
        ListaEspana instance = new ListaEspana();
        boolean expResult = false;
        boolean result = instance.add(nombre, apellido, edad, posicion, titular);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of positionSorting method, of class ListaEspana.
     */
    @Test
    public void testPositionSorting() {
        System.out.println("positionSorting");
        ListaEspana instance = new ListaEspana();
        boolean expResult = false;
        boolean result = instance.positionSorting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
