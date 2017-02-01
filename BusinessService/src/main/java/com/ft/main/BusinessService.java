/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.main;

import com.ft.db.mapping.*;
import hprose.client.HproseHttpClient;
import hprose.common.HproseCallback;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

/*
 * @author huming
 */
public class BusinessService {

    /**
     * 查找用户信息
     *
     * @param userCode
     * @return
     */
    public SystemUser queryUser(String userCode) {
        SystemUser result = null;

        HproseHttpClient client = new HproseHttpClient();
        client.useService("http://localhost:8080/DataService/DataService");
        //SystemUser result = (SystemUser)client.invoke("getUser",userCode);

        try {
            result = client.invoke("queryUser", new Object[]{userCode}, SystemUser.class);
        } catch (IOException ex) {
            Logger.getLogger(BusinessService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Throwable ex) {
            Logger.getLogger(BusinessService.class.getName()).log(Level.SEVERE, null, ex);
        }

        client.invoke("getUser", new Object[]{userCode}, new HproseCallback() {
            public void handler(Object result, Object[] args) {
                System.out.println(result);
            }
        }, SystemUser.class);

        return result;
    }

}
