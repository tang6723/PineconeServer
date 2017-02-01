/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.common;

import com.ft.db.mapping.SystemLogData;
import java.security.NoSuchAlgorithmException;

/*
 * @author Ming
 */
public class SystemLogHelper {
    
    private final static String LogType = "Business Service";
    
    /*
     * 根据 Exception 生成 SystemLogData
     * todo: 继续完善方法
     */
    public static SystemLogData getSystemLogData(Exception ex){
        SystemLogData log = new SystemLogData();
        
        log.setDataContent(ex.getMessage());
        log.setDataType(LogType);
        
        return log;
    }
    
    /*
     * 根据 NoSuchAlgorithmException 生成 SystemLogData
     * todo: 继续完善方法
     */
    public static SystemLogData getSystemLogData(NoSuchAlgorithmException ex){
        SystemLogData log = new SystemLogData();
        
        log.setDataContent(ex.getMessage());
        log.setDataType(LogType);
        
        return log;
    }
    
}