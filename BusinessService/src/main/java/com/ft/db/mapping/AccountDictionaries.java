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
public class AccountDictionaries {
    private Long accountDictionariesID;
    private String rowGUID;
    private String enterpriseCode;
    private String enterpriseName;
    private String organizationCode;
    private String organizationName;
    
    private String dictionariesType;
    private String dictionariesClassfication;
    private int serialNumber;
    private String dictionariesKey;
    private String dictionariesValue;
    
    private String state;
    private String remarks;

    public Long getAccountDictionariesID() {
        return accountDictionariesID;
    }

    public void setAccountDictionariesID(Long accountDictionariesID) {
        this.accountDictionariesID = accountDictionariesID;
    }

    public String getRowGUID() {
        return rowGUID;
    }

    public void setRowGUID(String rowGUID) {
        this.rowGUID = rowGUID;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
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
