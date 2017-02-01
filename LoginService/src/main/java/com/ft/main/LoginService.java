/*
 * Login Service 提供如下功能：
 * 1. 登录验证，返回 Session
 * 2. 实现 SessionPool
 * 3. 
 */
package com.ft.main;

import com.ft.common.DataService;
import com.ft.db.mapping.*;
import java.io.IOException;

/*
 * @author huming
 */
public class LoginService {
    
    /*
     * 用户登陆
     */
    public LoginResult login(UserLoginInfo user){
        LoginResult result = new LoginResult();
        
        if ("test".equals(user.getUserName()) && "".equals(user.getPassword()))
        {
            result.setLoginResult(true);
            result.setSession("aabbcc");
            result.setLoginMessage("登录成功");
            
            // UserStatus status = new UserStatus(
            //    user,
            //   generateSession(user)
            //);
            
            //Pool.addUserStatus(status);
        }
        else{
            result.setLoginResult(false);
            result.setLoginMessage("登录失败，因为 bla bla 原因导致什么什么样的失败，用这个消息提示用户");
        }
        
        return result;
    }
    
    /*
     * 用户注册
     */
    public RegisterResult registerUser(RegisterUser registerUser){
        RegisterResult result = null;
        
        try {
            result = DataService.registerUser(registerUser);
        } catch (IOException ex) {
            result.setLoginResult(false);
            result.setErrorMessage(ex.getMessage());
        }
        
        return result;
    }
    


}