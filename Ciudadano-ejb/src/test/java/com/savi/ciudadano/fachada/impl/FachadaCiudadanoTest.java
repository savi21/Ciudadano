/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.savi.ciudadano.fachada.impl;

import com.savi.ciudadano.fachada.FachadaCiudadanoLocal;
import com.savi.ciudadano.modelo.entidades.Ciudadano;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author savir_000
 */
public class FachadaCiudadanoTest {
    
    public FachadaCiudadanoTest() {
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
     * Test of guardar method, of class FachadaCiudadano.
     */
    @org.junit.Test
    public void testGuardar() throws Exception {
        System.out.println("guardar");
        Ciudadano ciudadano = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        FachadaCiudadanoLocal instance = (FachadaCiudadanoLocal)container.getContext().lookup("java:global/classes/FachadaCiudadano");
        instance.guardar(ciudadano);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class FachadaCiudadano.
     */
    @org.junit.Test
    public void testActualizar() throws Exception {
        System.out.println("actualizar");
        Ciudadano ciudadano = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        FachadaCiudadanoLocal instance = (FachadaCiudadanoLocal)container.getContext().lookup("java:global/classes/FachadaCiudadano");
        Ciudadano expResult = null;
        Ciudadano result = instance.actualizar(ciudadano);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrar method, of class FachadaCiudadano.
     */
    @org.junit.Test
    public void testBorrar() throws Exception {
        System.out.println("borrar");
        Ciudadano ciudadano = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        FachadaCiudadanoLocal instance = (FachadaCiudadanoLocal)container.getContext().lookup("java:global/classes/FachadaCiudadano");
        instance.borrar(ciudadano);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class FachadaCiudadano.
     */
    @org.junit.Test
    public void testBuscar() throws Exception {
        System.out.println("buscar");
        int entityID = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        FachadaCiudadanoLocal instance = (FachadaCiudadanoLocal)container.getContext().lookup("java:global/classes/FachadaCiudadano");
        Ciudadano expResult = null;
        Ciudadano result = instance.buscar(entityID);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTodos method, of class FachadaCiudadano.
     */
    @org.junit.Test
    public void testBuscarTodos() throws Exception {
        System.out.println("buscarTodos");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        FachadaCiudadanoLocal instance = (FachadaCiudadanoLocal)container.getContext().lookup("java:global/classes/FachadaCiudadano");
        List<Ciudadano> expResult = null;
        List<Ciudadano> result = instance.buscarTodos();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarRango method, of class FachadaCiudadano.
     */
    @org.junit.Test
    public void testBuscarRango() throws Exception {
        System.out.println("buscarRango");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        FachadaCiudadanoLocal instance = (FachadaCiudadanoLocal)container.getContext().lookup("java:global/classes/FachadaCiudadano");
        List<Ciudadano> expResult = null;
        List<Ciudadano> result = instance.buscarRango(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contar method, of class FachadaCiudadano.
     */
    @org.junit.Test
    public void testContar() throws Exception {
        System.out.println("contar");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        FachadaCiudadanoLocal instance = (FachadaCiudadanoLocal)container.getContext().lookup("java:global/classes/FachadaCiudadano");
        int expResult = 0;
        int result = instance.contar();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
