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
public class OrderState {
    private String orderStateID ;   
    private String ordersID ;   
    private Date executeTim ;   
    private String executiveID ;   
    private String executive ;   
    
    private String executeType ;   
    private String executeDesc ;   
    private String executeResult ;   
    private Date auditTime ;   
    private String auditorID ;   
    
    private String auditor ;   
    private String assessment ;   
    private String enableFlag ;   
    private String deleteFlag ;   
    private String remarks ;   

    public String getOrderStateID() {
        return orderStateID;
    }

    public void setOrderStateID(String orderStateID) {
        this.orderStateID = orderStateID;
    }

    public String getOrdersID() {
        return ordersID;
    }

    public void setOrdersID(String ordersID) {
        this.ordersID = ordersID;
    }

    public Date getExecuteTim() {
        return executeTim;
    }

    public void setExecuteTim(Date executeTim) {
        this.executeTim = executeTim;
    }

    public String getExecutiveID() {
        return executiveID;
    }

    public void setExecutiveID(String executiveID) {
        this.executiveID = executiveID;
    }

    public String getExecutive() {
        return executive;
    }

    public void setExecutive(String executive) {
        this.executive = executive;
    }

    public String getExecuteType() {
        return executeType;
    }

    public void setExecuteType(String executeType) {
        this.executeType = executeType;
    }

    public String getExecuteDesc() {
        return executeDesc;
    }

    public void setExecuteDesc(String executeDesc) {
        this.executeDesc = executeDesc;
    }

    public String getExecuteResult() {
        return executeResult;
    }

    public void setExecuteResult(String executeResult) {
        this.executeResult = executeResult;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditorID() {
        return auditorID;
    }

    public void setAuditorID(String auditorID) {
        this.auditorID = auditorID;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    
    
}
