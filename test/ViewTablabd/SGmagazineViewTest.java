/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewTablabd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class SGmagazineViewTest {
    
    public SGmagazineViewTest() {
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
     * Test of mostrar method, of class SGmagazineView.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        String buscar = "";
        SGmagazineView instance = new SGmagazineView();
        instance.mostrar(buscar);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class SGmagazineView.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SGmagazineView.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
