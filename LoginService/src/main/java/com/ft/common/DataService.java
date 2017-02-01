/*
 * Data Service 访问基础类
 */
package com.ft.common;

import com.ft.db.mapping.RegisterResult;
import com.ft.db.mapping.RegisterUser;
import hprose.client.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Ming
 */
public class DataService {
 
    private static HproseHttpClient _hproseClient = null;
    private static final String _dataServiceAddress = "http://abc.com/abc";
    
    /*
     * 获取客户端
     */
    public static HproseHttpClient getClient(){
        if (_hproseClient == null){
            _hproseClient = new HproseHttpClient(_dataServiceAddress);
        }
        
        return _hproseClient;
    }
    
    /*
     * 注册用户
     */
    public static RegisterResult registerUser(RegisterUser registerUser) throws IOException{
        //return _hproseClient.invoke("registerUser", new Object[]{ registerUser }, RegisterResult.class);
        RegisterResult result=null;
        try {
            result = _hproseClient.invoke("getUser", new Object[]{registerUser}, RegisterResult.class);
        } catch (IOException ex) {
            Logger.getLogger(BusinessService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Throwable ex) {
            Logger.getLogger(BusinessService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    //public static 
    
}