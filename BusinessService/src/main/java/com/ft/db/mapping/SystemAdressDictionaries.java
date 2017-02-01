/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.mapping;

/**
 *
 * @author Tang
 */
public class SystemAdressDictionaries {
    private Long systemAdressDictionariesID;
    private String rowGUID;
    private String dictionariesType;
    private String dictionariesClassfication;
    private String dictionariesGrade;
    private int serialNumber;
    
    private String dictionariesKey;
    private String dictionariesValue;
    private String belongID;
    private String   state;
    private String   remarks;

    public Long getSystemAdressDictionariesID() {
        return systemAdressDictionariesID;
    }

    public void setSystemAdressDictionariesID(Long systemAdressDictionariesID) {
        this.systemAdressDictionariesID = systemAdressDictionariesID;
    }

    public String getRowGUID() {
        return rowGUID;
    }

    public void setRowGUID(String rowGUID) {
        this.rowGUID = rowGUID;
    }

    public String getDictionariesType() {
        return dictionariesType;
    }

    public void setDictionariesType(String dictionariesType) {
        this.dictionariesType = dictionariesType;
    }

    public String getDictionariesClassfication() {
        return dictionariesClassfication;
    }

    public void setDictionariesClassfication(String dictionariesClassfication) {
        this.dictionariesClassfication = dictionariesClassfication;
    }

    public String getDictionariesGrade() {
        return dictionariesGrade;
    }

    public void setDictionariesGrade(String dictionariesGrade) {
        this.dictionariesGrade = dictionariesGrade;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDictionariesKey() {
        return dictionariesKey;
    }

    public void setDictionariesKey(String dictionariesKey) {
        this.dictionariesKey = dictionariesKey;
    }

    public String getDictionariesValue() {
        return dictionariesValue;
    }

    public void setDictionariesValue(String dictionariesValue) {
        this.dictionariesValue = dictionariesValue;
    }

    public String getBelongID() {
        return belongID;
    }

    public void setBelongID(String belongID) {
        this.belongID = belongID;
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
