/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.session;

import com.ft.db.mapping.UserStatus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/*
 * @author Ming
 */
public class SessionPoolTest {

    private final static String USER_NAME = "10086";
    private final static String USER_IP = "127.0.0.1";
    private final static String USER_DEVICE = "Android_Phone";

    private static String _testToken;

    public SessionPoolTest() {

    }

    @BeforeClass
    public static void setUpClass() {
        UserStatus userStatus = new UserStatus();

        userStatus.setUserName(USER_NAME);
        userStatus.setDevice(USER_DEVICE);
        userStatus.setIP(USER_IP);

        _testToken = SessionPool.saveUserStatus(userStatus);
    }

    @AfterClass
    public static void tearDownClass() {
        SessionPool.clearAllSession();
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    /*
     * Test all methods, of class SessionPool.
     */
    @org.junit.Test
    public void testAllMethods() {
        System.out.println("validateUserToken");
        boolean result1 = SessionPool.validateUserToken(_testToken);
        assertTrue(result1);

        
        System.out.println("clearInvalidSession");
        try {
            Thread.sleep(60000);
        } catch (InterruptedException ex) {
            System.console().printf(ex.getMessage());
        }

        SessionPool.clearInvalidSession(1);
        
        System.out.println("getUserStatus");
        UserStatus testInvalidSession = SessionPool.getUserStatus(USER_NAME);
        assertNull(testInvalidSession);

        System.out.println("saveUserStatus");

        UserStatus userStatus = new UserStatus();
        userStatus.setDevice(USER_DEVICE);
        userStatus.setIP(USER_IP);
        userStatus.setUserName("10087");
        String token = SessionPool.saveUserStatus(userStatus);
        assertNotNull(token);

        System.out.println("logout");
        boolean result2 = SessionPool.logout(token);
        assertTrue(result2);

        System.out.println("clearAllSession");
        UserStatus testCleanAllSessionStatus = new UserStatus();
        testCleanAllSessionStatus.setDevice(USER_DEVICE);
        testCleanAllSessionStatus.setIP(USER_IP);
        testCleanAllSessionStatus.setUserName("10088");
        SessionPool.saveUserStatus(testCleanAllSessionStatus);
        
        SessionPool.clearAllSession();
        UserStatus testCleanAllSession = SessionPool.getUserStatus("10088");
        assertNull(testCleanAllSession);
    }

}
