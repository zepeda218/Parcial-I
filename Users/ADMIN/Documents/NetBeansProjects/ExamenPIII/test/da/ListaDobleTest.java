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
public class ListaDobleTest {
    
    public ListaDobleTest() {
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
     * Test of getCabeza method, of class ListaDoble.
     */
    @Test
    public void testGetCabeza() {
        System.out.println("getCabeza");
        ListaDoble instance = new ListaDoble();
        Nodo expResult = null;
        Nodo result = instance.getCabeza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCabeza method, of class ListaDoble.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        Nodo cabeza = null;
        ListaDoble instance = new ListaDoble();
        instance.setCabeza(cabeza);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class ListaDoble.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ListaDoble instance = new ListaDoble();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class ListaDoble.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int size = 0;
        ListaDoble instance = new ListaDoble();
        instance.setSize(size);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaDoble.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaDoble instance = new ListaDoble();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ListaDoble.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String nombre = "";
        String apellido = "";
        int edad = 0;
        String posicion = "";
        boolean titular = false;
        ListaDoble instance = new ListaDoble();
        boolean expResult = false;
        boolean result = instance.add(nombre, apellido, edad, posicion, titular);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ageSorting method, of class ListaDoble.
     */
    @Test
    public void testAgeSorting() {
        System.out.println("ageSorting");
        ListaDoble instance = new ListaDoble();
        boolean expResult = false;
        boolean result = instance.ageSorting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerExchange method, of class ListaDoble.
     */
    @Test
    public void testPlayerExchange() {
        System.out.println("playerExchange");
        ListaDoble instance = new ListaDoble();
        boolean expResult = false;
        boolean result = instance.playerExchange();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printLineUp method, of class ListaDoble.
     */
    @Test
    public void testPrintLineUp() {
        System.out.println("printLineUp");
        int por = 0;
        int def = 0;
        int med = 0;
        int del = 0;
        ListaDoble instance = new ListaDoble();
        String expResult = "";
        String result = instance.printLineUp(por, def, med, del);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
