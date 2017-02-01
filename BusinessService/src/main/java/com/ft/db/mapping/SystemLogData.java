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
public class SystemLogData {
    private Long systemLogDataID;
    private String rowGUID;
    private String dataType;
    private String dataClassfication;
    private String dataTitle;
    private String dataContent;
    private Date isusseTime;
    private String   state;
    private String   remarks;

    public Long getSystemLogDataID() {
        return systemLogDataID;
    }

    public void setSystemLogDataID(Long systemLogDataID) {
        this.systemLogDataID = systemLogDataID;
    }

    public String getRowGUID() {
        return rowGUID;
    }

    public void setRowGUID(String rowGUID) {
        this.rowGUID = rowGUID;
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

    public Date getIsusseTime() {
        return isusseTime;
    }

    public void setIsusseTime(Date isusseTime) {
        this.isusseTime = isusseTime;
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
