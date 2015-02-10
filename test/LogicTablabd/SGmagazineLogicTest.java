/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicTablabd;

import DataTablabd.SGmagazine;
import javax.swing.table.DefaultTableModel;
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
public class SGmagazineLogicTest {
    
    public SGmagazineLogicTest() {
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
     * Test of insertar method, of class SGmagazineLogic.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        SGmagazine dts = null;
        SGmagazineLogic instance = new SGmagazineLogic();
        boolean expResult = false;
        boolean result = instance.insertar(dts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of editar method, of class SGmagazineLogic.
     */
    @Test
    public void testEditar() {
        System.out.println("editar");
        SGmagazine dts = null;
        SGmagazineLogic instance = new SGmagazineLogic();
        boolean expResult = false;
        boolean result = instance.editar(dts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar method, of class SGmagazineLogic.
     */
//    @Test
//    public void testMostrar() {
//        System.out.println("mostrar");
//        String buscar = "";
//        SGmagazineLogic instance = new SGmagazineLogic();
//        DefaultTableModel expResult = null;
//        DefaultTableModel result = instance.mostrar(buscar);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
    
}
