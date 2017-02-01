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
public class ContractsExecute {
    
    private Long contractsExecuteID;
    private String rowGUID;
    private String contractsID;
    private String contractsCode;
    private String contractsName;
    private String dataType;
    
    private String dataClassfication;
    private Date executeTime;
    private Date issuesTime;
    private String issuesName;
    private String state;
    
    private String remarks;

    public Long getContractsExecuteID() {
        return contractsExecuteID;
    }

    public void setContractsExecuteID(Long contractsExecuteID) {
        this.contractsExecuteID = contractsExecuteID;
    }

    public String getRowGUID() {
        return rowGUID;
    }

    public void setRowGUID(String rowGUID) {
        this.rowGUID = rowGUID;
    }

    public String getContractsID() {
        return contractsID;
    }

    public void setContractsID(String contractsID) {
        this.contractsID = contractsID;
    }

    public String getContractsCode() {
        return contractsCode;
    }

    public void setContractsCode(String contractsCode) {
        this.contractsCode = contractsCode;
    }

    public String getContractsName() {
        return contractsName;
    }

    public void setContractsName(String contractsName) {
        this.contractsName = contractsName;
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

    public Date getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Date executeTime) {
        this.executeTime = executeTime;
    }

    public Date getIssuesTime() {
        return issuesTime;
    }

    public void setIssuesTime(Date issuesTime) {
        this.issuesTime = issuesTime;
    }

    public String getIssuesName() {
        return issuesName;
    }

    public void setIssuesName(String issuesName) {
        this.issuesName = issuesName;
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
