/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.common;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ming
 */
public class ShaEncryptionWrapperTest {
    
    public ShaEncryptionWrapperTest() {
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
     * Test of getSha method, of class ShaEncryptionWrapper.
     */
    @Test
    public void testGetSha() {
        System.out.println("getSha");
        String password = "huming123456_password";
        String expResult = "0a2b083b2d1a5c8e33ae6ee495c632ee0550270e";
        String result = ShaEncryptionWrapper.getSha(password);
        assertEquals(expResult, result);
    }
    
}
