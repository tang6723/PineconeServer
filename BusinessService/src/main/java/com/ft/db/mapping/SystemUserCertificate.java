/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.mapping;

import java.util.Date;

/**
 *
 * @author Tang
 */
public class SystemUserCertificate {
    private Long systemUserCertificateID;
    private String rowGUID;
    private String userCard;
    private String userCardImageID;
    private String userCardURL;
    private String userImageID;
    
    private String userImageURL;
    private String userPhone;
    private String userAdress;
    private String certificateState;
    private Date certificateTime;
    
    private Date isussTime;
    private String state;
    private String remarks;

    public Long getSystemUserCertificateID() {
        return systemUserCertificateID;
    }

    public void setSystemUserCertificateID(Long systemUserCertificateID) {
        this.systemUserCertificateID = systemUserCertificateID;
    }

    public String getRowGUID() {
        return rowGUID;
    }

    public void setRowGUID(String rowGUID) {
        this.rowGUID = rowGUID;
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

    public String getUserCardImageID() {
        return userCardImageID;
    }

    public void setUserCardImageID(String userCardImageID) {
        this.userCardImageID = userCardImageID;
    }

    public String getUserCardURL() {
        return userCardURL;
    }

    public void setUserCardURL(String userCardURL) {
        this.userCardURL = userCardURL;
    }

    public String getUserImageID() {
        return userImageID;
    }

    public void setUserImageID(String userImageID) {
        this.userImageID = userImageID;
    }

    public String getUserImageURL() {
        return userImageURL;
    }

    public void setUserImageURL(String userImageURL) {
        this.userImageURL = userImageURL;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAdress() {
        return userAdress;
    }

    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }

    public String getCertificateState() {
        return certificateState;
    }

    public void setCertificateState(String certificateState) {
        this.certificateState = certificateState;
    }

    public Date getCertificateTime() {
        return certificateTime;
    }

    public void setCertificateTime(Date certificateTime) {
        this.certificateTime = certificateTime;
    }

    public Date getIsussTime() {
        return isussTime;
    }

    public void setIsussTime(Date isussTime) {
        this.isussTime = isussTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    
    
}
