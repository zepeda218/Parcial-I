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
public class NodoTest {
    
    public NodoTest() {
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
     * Test of getDato method, of class Nodo.
     */
    @Test
    public void testGetDato() {
        System.out.println("getDato");
        Nodo instance = null;
        Jugador expResult = null;
        Jugador result = instance.getDato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDato method, of class Nodo.
     */
    @Test
    public void testSetDato() {
        System.out.println("setDato");
        Jugador dato = null;
        Nodo instance = null;
        instance.setDato(dato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSig method, of class Nodo.
     */
    @Test
    public void testGetSig() {
        System.out.println("getSig");
        Nodo instance = null;
        Nodo expResult = null;
        Nodo result = instance.getSig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSig method, of class Nodo.
     */
    @Test
    public void testSetSig() {
        System.out.println("setSig");
        Nodo sig = null;
        Nodo instance = null;
        instance.setSig(sig);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnt method, of class Nodo.
     */
    @Test
    public void testGetAnt() {
        System.out.println("getAnt");
        Nodo instance = null;
        Nodo expResult = null;
        Nodo result = instance.getAnt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnt method, of class Nodo.
     */
    @Test
    public void testSetAnt() {
        System.out.println("setAnt");
        Nodo ant = null;
        Nodo instance = null;
        instance.setAnt(ant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
