/*
 * 用户登陆信息
 */
package com.ft.db.mapping;

/*
 * @author huming
 */
public class UserLoginInfo {
    
    /*
     * 用户名
     */
    private String _userName;
    
    /*
     * 密码
     */
    private String _password;
    
    public void setUserName(String userName){
        this._userName = userName;
    }

    public String getUserName(){
        return this._userName;
    }

    public void setPassword(String password){
        this._password = password;
    }
    
    public String getPassword(){
        return this._password;
    }    
}