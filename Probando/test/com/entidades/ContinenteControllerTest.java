/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author savir_000
 */
public class ContinenteControllerTest {
    
    public ContinenteControllerTest() {
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
     * Test of getSelected method, of class ContinenteController.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        ContinenteController instance = new ContinenteController();
        Continente expResult = null;
        Continente result = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelected method, of class ContinenteController.
     */
    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        Continente selected = null;
        ContinenteController instance = new ContinenteController();
        instance.setSelected(selected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmbeddableKeys method, of class ContinenteController.
     */
    @Test
    public void testSetEmbeddableKeys() {
        System.out.println("setEmbeddableKeys");
        ContinenteController instance = new ContinenteController();
        instance.setEmbeddableKeys();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initializeEmbeddableKey method, of class ContinenteController.
     */
    @Test
    public void testInitializeEmbeddableKey() {
        System.out.println("initializeEmbeddableKey");
        ContinenteController instance = new ContinenteController();
        instance.initializeEmbeddableKey();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareCreate method, of class ContinenteController.
     */
    @Test
    public void testPrepareCreate() {
        System.out.println("prepareCreate");
        ContinenteController instance = new ContinenteController();
        Continente expResult = new Continente("Americano");
        Continente result = instance.prepareCreate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class ContinenteController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        ContinenteController instance = new ContinenteController();
        instance.create();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ContinenteController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ContinenteController instance = new ContinenteController();
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class ContinenteController.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        ContinenteController instance = new ContinenteController();
        instance.destroy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class ContinenteController.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        ContinenteController instance = new ContinenteController();
        List<Continente> expResult = null;
        List<Continente> result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectMany method, of class ContinenteController.
     */
    @Test
    public void testGetItemsAvailableSelectMany() {
        System.out.println("getItemsAvailableSelectMany");
        ContinenteController instance = new ContinenteController();
        List<Continente> expResult = null;
        List<Continente> result = instance.getItemsAvailableSelectMany();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectOne method, of class ContinenteController.
     */
    @Test
    public void testGetItemsAvailableSelectOne() {
        System.out.println("getItemsAvailableSelectOne");
        ContinenteController instance = new ContinenteController();
        List<Continente> expResult = null;
        List<Continente> result = instance.getItemsAvailableSelectOne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
