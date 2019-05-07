/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.java.testing.junit.syncthreads;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yurii
 */
public class MyThreadTest {
    
    public MyThreadTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws InterruptedException {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Add method, of class MyThread.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        MyThread instance = null;
        instance.Add();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddStatic method, of class MyThread.
     */
    @Test
    public void testAddStatic() {
        System.out.println("AddStatic");
        MyThread.AddStatic();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class MyThread.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        MyThread instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
