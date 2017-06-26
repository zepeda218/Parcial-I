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
public class NodoEspanaTest {
    
    public NodoEspanaTest() {
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
     * Test of getDato method, of class NodoEspana.
     */
    @Test
    public void testGetDato() {
        System.out.println("getDato");
        NodoEspana instance = null;
        Jugador expResult = null;
        Jugador result = instance.getDato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDato method, of class NodoEspana.
     */
    @Test
    public void testSetDato() {
        System.out.println("setDato");
        Jugador dato = null;
        NodoEspana instance = null;
        instance.setDato(dato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSig method, of class NodoEspana.
     */
    @Test
    public void testGetSig() {
        System.out.println("getSig");
        NodoEspana instance = null;
        NodoEspana expResult = null;
        NodoEspana result = instance.getSig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSig method, of class NodoEspana.
     */
    @Test
    public void testSetSig() {
        System.out.println("setSig");
        NodoEspana sig = null;
        NodoEspana instance = null;
        instance.setSig(sig);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnt method, of class NodoEspana.
     */
    @Test
    public void testGetAnt() {
        System.out.println("getAnt");
        NodoEspana instance = null;
        NodoEspana expResult = null;
        NodoEspana result = instance.getAnt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnt method, of class NodoEspana.
     */
    @Test
    public void testSetAnt() {
        System.out.println("setAnt");
        NodoEspana ant = null;
        NodoEspana instance = null;
        instance.setAnt(ant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
