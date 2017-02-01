/*
 * 注册结果
 */
package com.ft.db.mapping;

/*
 * @author Ming
 */
public class RegisterResult {
    
    /*
     * True 验证成功
     * False 验证失败
     */
    public boolean _loginResult;
    
    /*
     * 如果验证失败，返回错误原因消息提示
     */
    public String _errorMessage;
    
    /*
     * 如果验证成功，返回用户 Session
     */
    public String _session;
    
    public void setLoginResult(boolean loginResult){
        this._loginResult = loginResult;
    }
    
    public boolean getLoginResult(){
        return this._loginResult;
    }
    
    public void setErrorMessage(String errorMessage){
        this._errorMessage = errorMessage;
    }
    
    public String getErrorMessage(){
        return this._errorMessage;
    }
    
    public void setSession(String session){
        this._session = session;
    }
    
    public String getSession(){
        return this._session;
    }    
}