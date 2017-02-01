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
public class ContractsExecuteList {
    private Long contractsExecuteListID;
    private String rowGUID;
    private String contractsExecuteID;
    private int serialNo;
    private Date sendTime;
    private Date executeTime;
    
    private String abstractDesc;
    private String executeDesc;
    private String state;
    private String remarks;

    public Long getContractsExecuteListID() {
        return contractsExecuteListID;
    }

    public void setContractsExecuteListID(Long contractsExecuteListID) {
        this.contractsExecuteListID = contractsExecuteListID;
    }

    public String getRowGUID() {
        return rowGUID;
    }

    public void setRowGUID(String rowGUID) {
        this.rowGUID = rowGUID;
    }

    public String getContractsExecuteID() {
        return contractsExecuteID;
    }

    public void setContractsExecuteID(String contractsExecuteID) {
        this.contractsExecuteID = contractsExecuteID;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
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

    public String getAbstractDesc() {
        return abstractDesc;
    }

    public void setAbstractDesc(String abstractDesc) {
        this.abstractDesc = abstractDesc;
    }

    public String getExecuteDesc() {
        return executeDesc;
    }

    public void setExecuteDesc(String executeDesc) {
        this.executeDesc = executeDesc;
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
