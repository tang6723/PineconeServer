/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.mapping;

import java.util.Date;

/*
 * @author huming
 */
public class UserStatus {
    
    public UserStatus(){
        
    }
    
    /*
     * 针对用户登陆
     */
    public UserStatus(UserLoginInfo loginInfo){
        this._lastUpdateTime = new Date();
        this._loginTime = new Date();
        this._userName = loginInfo.getUserName();
    }
    
    private String _userName;
    
    public void setUserName(String userName){
        this._userName = userName;
    }
    
    public String getUserName(){
        return this._userName;
    }
    
    private Date _loginTime;
    
    public void setLoginTime(Date date){
        this._loginTime = date;
    }
    
    public Date getLoginTime(){
        return this._loginTime;
    }
    
    private Date _lastUpdateTime;
    
    public void setLastUpdateTime(Date date){
        this._lastUpdateTime = date;
    }
    
    public Date getLastUpdateTime(){
        return this._lastUpdateTime;
    }
    
    public String _ip;
    
    public void setIP(String ip){
        this._ip = ip;
    }
    
    public String getIP(){
        return this._ip;
    }
    
    /*
     * 访问设备是什么类型
     */
    public String _device;
    
    public void setDevice(String device){
        this._device = device;
    }
    
    public String getDevice(){
        return this._device;
    }
    
    /*
     * 用户 Token 
     */
    public String _token;
    
    public void setToken(String token){
        this._token = token;
    }
    
    public String getToken(){
        return this._token;
    }
    
} 