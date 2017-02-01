/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.common;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
 * @author Ming
 */
public class ShaEncryptionWrapper {

    /*
     * 对密码进行 SHA 加密
     */
    public static String getSha(String password) {
        StringBuilder hexValue = new StringBuilder();

        try {
            MessageDigest sha = MessageDigest.getInstance("SHA");
            byte[] byteArray = password.getBytes("UTF-8");
            byte[] md5Bytes = sha.digest(byteArray);

            for (int i = 0; i < md5Bytes.length; i++) {
                int val = ((int) md5Bytes[i]) & 0xff;
                if (val < 16) {
                    hexValue.append("0");
                }
                hexValue.append(Integer.toHexString(val));
            }
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            // todo; log error message
        }

        return hexValue.toString();
    }

}