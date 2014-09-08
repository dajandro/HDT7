/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package huffman;

import java.util.TreeSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Orozco <daniel.orozco>
 */
public class ArbolTest {
    
    public ArbolTest() {
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
     * Test of preOrder method, of class Arbol.
     */
    @Test
    public void testPreOrder() {
        System.out.println("preOrder");
        Nodo d = null;
        Arbol instance = new Arbol();
        String expResult = "";
        String result = instance.preOrder(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of postOrder method, of class Arbol.
     */
    @Test
    public void testPostOrder() {
        System.out.println("postOrder");
        Nodo d = null;
        Arbol instance = new Arbol();
        String expResult = "";
        String result = instance.postOrder(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of inOrder method, of class Arbol.
     */
    @Test
    public void testInOrder() {
        System.out.println("inOrder");
        Nodo d = null;
        Arbol instance = new Arbol();
        String expResult = "";
        String result = instance.inOrder(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of armar method, of class Arbol.
     */
    @Test
    public void testArmar() {
        System.out.println("armar");
        TreeSet set = new TreeSet(new OrdenarSet());
        set.add(new Nodo());
        Arbol instance = new Arbol();
        instance.armar(set);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of codhuff method, of class Arbol.
     */
    @Test
    public void testCodhuff() {
        System.out.println("codhuff");
        Nodo p = null;
        String e = "";
        Arbol instance = new Arbol();
        instance.codhuff(p, e);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCod method, of class Arbol.
     */
    @Test
    public void testSetCod() {
        System.out.println("setCod");
        Nodo raiz = null;
        Arbol instance = new Arbol();
        instance.setCod(raiz);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of showCod method, of class Arbol.
     */
    @Test
    public void testShowCod() {
        System.out.println("showCod");
        Arbol instance = new Arbol();
        instance.toString();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of traducir method, of class Arbol.
     */
    @Test
    public void testTraducir() {
        System.out.println("traducir");
        String s = "";
        Arbol a = null;
        Arbol instance = new Arbol();
        String expResult = "";
        String result = instance.traducir(s, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Arbol.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        String s = "";
        Arbol instance = new Arbol();
        String expResult = "";
        String result = instance.getValor(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
