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
public class ReaEnterpriseData {
    private Long reaEnterpriseDataID;
    private String rowGUID;
    private String enterpriseCode;
    private String enterpriseName;
    private String organizationCode;
    private String organizationName;
    
    private String dataType;
    private String dataClassfication;
    private String reciveOrganizationCode;
    private String reciveEmployeeCode;
    private String reciveCustomerCode;
    
    private String dataTitle;
    private String dataContent;
    private String sendState;
    private Date issueTime;
    private Date sendTime;
    
    private String state;
    private String remarks;

    public Long getReaEnterpriseDataID() {
        return reaEnterpriseDataID;
    }

    public void setReaEnterpriseDataID(Long reaEnterpriseDataID) {
        this.reaEnterpriseDataID = reaEnterpriseDataID;
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

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataClassfication() {
        return dataClassfication;
    }

    public void setDataClassfication(String dataClassfication) {
        this.dataClassfication = dataClassfication;
    }

    public String getReciveOrganizationCode() {
        return reciveOrganizationCode;
    }

    public void setReciveOrganizationCode(String reciveOrganizationCode) {
        this.reciveOrganizationCode = reciveOrganizationCode;
    }

    public String getReciveEmployeeCode() {
        return reciveEmployeeCode;
    }

    public void setReciveEmployeeCode(String reciveEmployeeCode) {
        this.reciveEmployeeCode = reciveEmployeeCode;
    }

    public String getReciveCustomerCode() {
        return reciveCustomerCode;
    }

    public void setReciveCustomerCode(String reciveCustomerCode) {
        this.reciveCustomerCode = reciveCustomerCode;
    }

    public String getDataTitle() {
        return dataTitle;
    }

    public void setDataTitle(String dataTitle) {
        this.dataTitle = dataTitle;
    }

    public String getDataContent() {
        return dataContent;
    }

    public void setDataContent(String dataContent) {
        this.dataContent = dataContent;
    }

    public String getSendState() {
        return sendState;
    }

    public void setSendState(String sendState) {
        this.sendState = sendState;
    }

    public Date getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
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
