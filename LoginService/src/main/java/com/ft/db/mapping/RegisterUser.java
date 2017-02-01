/*
 * 注册用户信息
 */
package com.ft.db.mapping;

import java.util.Date;

/*
 * @author Ming
 */
public class RegisterUser {

    // 用户编码
    public String _userCode;
    // 用户类型
    public String _userType;
    // 用户名称
    public String _userName;
    // 用户昵称
    public String _userNickName;
    // 用户密码
    public String _userPassword;
    // 用户权限
    public String _userPemission;
    // 登录时间
    public Date _logTime;
    // 在线状态
    public String _onlineState;
    // 状态
    public String _state;
    // 备注
    public String _remarks;

    public String getUserCode() {
        return this._userCode;
    }

    public void setUserCode(String userCode) {
        this._userCode = userCode;
    }

    public String getUserType() {
        return this._userType;
    }

    public void setUserType(String userType) {
        this._userType = userType;
    }

    public String getUserName() {
        return this._userName;
    }

    public void setUserName(String userName) {
        this._userName = userName;
    }

    public String getUserNickName() {
        return this._userNickName;
    }

    public void setUserNickName(String userNickName) {
        this._userNickName = userNickName;
    }

    public String getUserPassword() {
        return this._userPassword;
    }

    public void setUserPassword(String userPassword) {
        this._userPassword = userPassword;
    }

    public String getUserPemission() {
        return this._userPemission;
    }

    public void setUserPemission(String userPemission) {
        this._userPemission = userPemission;
    }

    public Date getLogTime() {
        return this._logTime;
    }

    public void setLogTime(Date logTime) {
        this._logTime = logTime;
    }

    public String getOnlineState() {
        return this._onlineState;
    }

    public void setOnlineState(String onlineState) {
        this._onlineState = onlineState;
    }

    public String getState() {
        return this._state;
    }

    public void setState(String state) {
        this._state = state;
    }

    public String getRemarks() {
        return this._remarks;
    }

    public void setRemarks(String remarks) {
        this._remarks = remarks;
    }
}