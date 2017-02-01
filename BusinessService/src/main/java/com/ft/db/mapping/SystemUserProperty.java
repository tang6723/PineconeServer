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
public class SystemUserProperty {
     private Long systemUserPropertyID;
     private String rowGUID;
     private String propertyType;
     private String propertyClassfication;
     private String propertyKey;
     private String propertyValue;
     private String state;
     private String remarks;

    public Long getSystemUserPropertyID() {
        return systemUserPropertyID;
    }

    public void setSystemUserPropertyID(Long systemUserPropertyID) {
        this.systemUserPropertyID = systemUserPropertyID;
    }

    public String getRowGUID() {
        return rowGUID;
    }

    public void setRowGUID(String rowGUID) {
        this.rowGUID = rowGUID;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getPropertyClassfication() {
        return propertyClassfication;
    }

    public void setPropertyClassfication(String propertyClassfication) {
        this.propertyClassfication = propertyClassfication;
    }

    public String getPropertyKey() {
        return propertyKey;
    }

    public void setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
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
