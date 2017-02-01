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
public class RunningRecord {
    private String RunningRecordID ;
    private String MembersID ;
    private String MembersType ;
    private String MembersName ;
    private float TradeTotal ;
    
    private String TradeDesc ;
    private String TradeType ;
    private Date TradeTime ;
    private String ResourceID ;
    private String EventID ;
    
    private String ContractID ;
    private Date BusinessTime ;
    private Date RecordTime ;
    private Date AuditTime ;
    private String AuditorID ;
    
    private String Auditor ;
    private String Assessment ;
    private String AuditorRemarks ;
    private String DeleteFlag ;
    private String Remarks ;

    public String getRunningRecordID() {
        return RunningRecordID;
    }

    public void setRunningRecordID(String RunningRecordID) {
        this.RunningRecordID = RunningRecordID;
    }

    public String getMembersID() {
        return MembersID;
    }

    public void setMembersID(String MembersID) {
        this.MembersID = MembersID;
    }

    public String getMembersType() {
        return MembersType;
    }

    public void setMembersType(String MembersType) {
        this.MembersType = MembersType;
    }

    public String getMembersName() {
        return MembersName;
    }

    public void setMembersName(String MembersName) {
        this.MembersName = MembersName;
    }

    public float getTradeTotal() {
        return TradeTotal;
    }

    public void setTradeTotal(float TradeTotal) {
        this.TradeTotal = TradeTotal;
    }

    public String getTradeDesc() {
        return TradeDesc;
    }

    public void setTradeDesc(String TradeDesc) {
        this.TradeDesc = TradeDesc;
    }

    public String getTradeType() {
        return TradeType;
    }

    public void setTradeType(String TradeType) {
        this.TradeType = TradeType;
    }

    public Date getTradeTime() {
        return TradeTime;
    }

    public void setTradeTime(Date TradeTime) {
        this.TradeTime = TradeTime;
    }

    public String getResourceID() {
        return ResourceID;
    }

    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    public String getEventID() {
        return EventID;
    }

    public void setEventID(String EventID) {
        this.EventID = EventID;
    }

    public String getContractID() {
        return ContractID;
    }

    public void setContractID(String ContractID) {
        this.ContractID = ContractID;
    }

    public Date getBusinessTime() {
        return BusinessTime;
    }

    public void setBusinessTime(Date BusinessTime) {
        this.BusinessTime = BusinessTime;
    }

    public Date getRecordTime() {
        return RecordTime;
    }

    public void setRecordTime(Date RecordTime) {
        this.RecordTime = RecordTime;
    }

    public Date getAuditTime() {
        return AuditTime;
    }

    public void setAuditTime(Date AuditTime) {
        this.AuditTime = AuditTime;
    }

    public String getAuditorID() {
        return AuditorID;
    }

    public void setAuditorID(String AuditorID) {
        this.AuditorID = AuditorID;
    }

    public String getAuditor() {
        return Auditor;
    }

    public void setAuditor(String Auditor) {
        this.Auditor = Auditor;
    }

    public String getAssessment() {
        return Assessment;
    }

    public void setAssessment(String Assessment) {
        this.Assessment = Assessment;
    }

    public String getAuditorRemarks() {
        return AuditorRemarks;
    }

    public void setAuditorRemarks(String AuditorRemarks) {
        this.AuditorRemarks = AuditorRemarks;
    }

    public String getDeleteFlag() {
        return DeleteFlag;
    }

    public void setDeleteFlag(String DeleteFlag) {
        this.DeleteFlag = DeleteFlag;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }
    
    
    
}
