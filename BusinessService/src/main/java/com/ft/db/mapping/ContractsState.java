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
public class ContractsState {
    private Long contractsStateID;
    private String rowGUID;
    private String contractsID;
    private String contractsCode;
    private String contractsName;
    private String dataType;
    
    private String dataClassfication;
    private String sateName;
    private String stateDesc;
    private Date sendTime;
    private Date executeTime;
    
    private String executeName;
    private String executeDesc;
    private String executeState;
    private String contractsDesc;
    private String state;
    
    private String remarks;

    public Long getContractsStateID() {
        return contractsStateID;
    }

    public void setContractsStateID(Long contractsStateID) {
        this.contractsStateID = contractsStateID;
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

    public String getSateName() {
        return sateName;
    }

    public void setSateName(String sateName) {
        this.sateName = sateName;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Date executeTime) {
        this.executeTime = executeTime;
    }

    public String getExecuteName() {
        return executeName;
    }

    public void setExecuteName(String executeName) {
        this.executeName = executeName;
    }

    public String getExecuteDesc() {
        return executeDesc;
    }

    public void setExecuteDesc(String executeDesc) {
        this.executeDesc = executeDesc;
    }

    public String getExecuteState() {
        return executeState;
    }

    public void setExecuteState(String executeState) {
        this.executeState = executeState;
    }

    public String getContractsDesc() {
        return contractsDesc;
    }

    public void setContractsDesc(String contractsDesc) {
        this.contractsDesc = contractsDesc;
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
