/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.common;


import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.ft.common.AESEncryptionWrapperTest;


/**
 *
 * @author Ming
 */
public class AESEncryptionWrapperTest {

    public AESEncryptionWrapperTest() {
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
     * Test of generateSecretKey method, of class AESEncryptionWrapper.
     */
    @Test
    public void testAESEncryptionWrapper() {
        String content = "这是一段要加密的内容";

        // 生成唯一密钥
        String secretKey = AESEncryptionWrapper.generateSecretKey();
        AESEncryptionWrapper se = new AESEncryptionWrapper();

        System.out.println("生成的密钥是:" + secretKey);
        System.out.println("要加密的内容是:" + content);

        // 加密
        System.out.println("使用AES对称加密");
        String encodeRules = secretKey;
        String encryptionContent = se.AESEncode(encodeRules, content);
        System.out.println("根据输入的规则" + encodeRules + "加密后的密文是:" + encryptionContent);

        // 解密
        System.out.println("使用AES对称解密");
        encodeRules = secretKey;
        String outputResult = se.AESDncode(encodeRules, encryptionContent);
        System.out.println("根据输入的规则" + encodeRules + "解密后的明文是:" + outputResult);

        Assert.assertNotNull(outputResult);
    }

}
