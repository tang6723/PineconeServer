/*
 * Data Service 访问基础类
 */
package com.ft.common;

import com.ft.db.mapping.*;
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
     * 写系统日志
     */
    public static void writeSystemLog(SystemLogData systemLog) {
        try {
            getClient().invoke("writeSystemLog", new Object[]{ systemLog });
        } catch (IOException ex) {
            //todo: 写文件
        } catch (Throwable ex) {
            Logger.getLogger(DataService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}