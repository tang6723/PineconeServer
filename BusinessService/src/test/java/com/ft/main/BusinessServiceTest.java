/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.main;

import com.ft.db.mapping.SystemUser;
import com.ft.main.BusinessService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tang
 */
public class BusinessServiceTest {
    
    public BusinessServiceTest() {
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
     * Test of getUser method, of class BusinessService.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String userCode = "2";
        BusinessService instance = new BusinessService();
        //SystemUser expResult = null;
        SystemUser result = instance.queryUser(userCode);
        
        //System.out.println("Username:"+result.getUserName());
        //System.out.println("UserCode:"+result.getUserCode());
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        
        Assert.assertNotNull(result);
        //fail("The test case is a prototype.");
    }
    
}
