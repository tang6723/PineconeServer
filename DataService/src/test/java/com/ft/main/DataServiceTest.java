/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.main;

import com.ft.db.access.DatabaseUtility;
import com.ft.db.mapping.SystemUser;
import com.ft.db.mapping.SystemUserProperty;
import com.ft.model.PagingInputParam;
import com.ft.model.PagingOutputResult;
import java.util.List;
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
public class DataServiceTest {
    
    public DataServiceTest() {
        DatabaseUtility.initDatabaseUtility();
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
     * Test of getUser method, of class DataService.
     */
    @Test
    public void testGetUser() {
        System.out.println("queryUser");
        String userCode = "2";
        DataService instance = new DataService();
        SystemUser expResult = null;
        SystemUser result = instance.queryUser(userCode);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("ystemUserID:"+result.getSystemUserID());
        System.out.println("UserCode:"+result.getUserCode());
        System.out.println("Username:"+result.getUserName());
        
        Assert.assertNotNull(result);
    }

    /**
     * Test of getUserInf method, of class DataService.
     */
    //@Test
    public void testGetUserInf() {
        System.out.println("getUserInf");
        String userID = "";
        DataService instance = new DataService();
        List<SystemUserProperty> expResult = null;
        List<SystemUserProperty> result = instance.getUserInf(userID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insetrItem method, of class DataService.
     */
    //@Test
    public void testInsetrItem() {
        System.out.println("insetrItem");
        Object t = null;
        DataService instance = new DataService();
        boolean expResult = false;
        boolean result = instance.insetrItem(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateItem method, of class DataService.
     */
    //@Test
    public void testUpdateItem() {
        System.out.println("updateItem");
        Object t = null;
        DataService instance = new DataService();
        boolean expResult = false;
        boolean result = instance.updateItem(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteItem method, of class DataService.
     */
    //@Test
    public void testDeleteItem() {
        System.out.println("deleteItem");
        Object t = null;
        DataService instance = new DataService();
        boolean expResult = false;
        boolean result = instance.deleteItem(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItem method, of class DataService.
     */
    //@Test
    public void testGetItem() {
        System.out.println("getItem");
        String itemID = "";
        Object t = null;
        DataService instance = new DataService();
        Object expResult = null;
        Object result = instance.getItem(itemID, t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaging method, of class DataService.
     */
    //@Test
    public void testGetPaging() {
        System.out.println("getPaging");
        PagingInputParam inputParam = null;
        Class outputType = null;
        DataService instance = new DataService();
        PagingOutputResult expResult = null;
        PagingOutputResult result = instance.getPaging(inputParam, outputType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}