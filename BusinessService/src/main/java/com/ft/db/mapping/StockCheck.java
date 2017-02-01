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
public class StockCheck {
    private Long stockCheckID;
    private String rowGUID;
    private String enterpriseCode;
    private String enterpriseName;
    private String organizationCode;
    private String organizationName;
    
    private String costOrganizationCode;
    private String checkCode;
    private String checkType;
    private Date checkTime;
    private String responsiblePerson;
    
    private String approvingPerson;
    private String state;
    private String remarks;

    public Long getStockCheckID() {
        return stockCheckID;
    }

    public void setStockCheckID(Long stockCheckID) {
        this.stockCheckID = stockCheckID;
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

    public String getCostOrganizationCode() {
        return costOrganizationCode;
    }

    public void setCostOrganizationCode(String costOrganizationCode) {
        this.costOrganizationCode = costOrganizationCode;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public String getApprovingPerson() {
        return approvingPerson;
    }

    public void setApprovingPerson(String approvingPerson) {
        this.approvingPerson = approvingPerson;
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
