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
public class PayableAccount {
    private String PayableAccountID ;
    private Date BusinessTime ;
    private String RelevantID ;
    private String RelevantDesc ;
    private String MembersID ;
    
    private String MerchantID ;
    private String AgentID ;
    private String AccountCode ;
    private String TopSubjects ;
    private String TwoSubjects ;
    
    private Date RecordTime ;
    private String DebitCreditor ;
    private float Amount ;
    private String Summary ;
    private Date AuditTime ;
    
    private String AuditorID ;
    private String Auditor ;
    private String Assessment ;
    private String DeleteFlag ;
    private String Remarks ;

    public String getPayableAccountID() {
        return PayableAccountID;
    }

    public void setPayableAccountID(String PayableAccountID) {
        this.PayableAccountID = PayableAccountID;
    }

    public Date getBusinessTime() {
        return BusinessTime;
    }

    public void setBusinessTime(Date BusinessTime) {
        this.BusinessTime = BusinessTime;
    }

    public String getRelevantID() {
        return RelevantID;
    }

    public void setRelevantID(String RelevantID) {
        this.RelevantID = RelevantID;
    }

    public String getRelevantDesc() {
        return RelevantDesc;
    }

    public void setRelevantDesc(String RelevantDesc) {
        this.RelevantDesc = RelevantDesc;
    }

    public String getMembersID() {
        return MembersID;
    }

    public void setMembersID(String MembersID) {
        this.MembersID = MembersID;
    }

    public String getMerchantID() {
        return MerchantID;
    }

    public void setMerchantID(String MerchantID) {
        this.MerchantID = MerchantID;
    }

    public String getAgentID() {
        return AgentID;
    }

    public void setAgentID(String AgentID) {
        this.AgentID = AgentID;
    }

    public String getAccountCode() {
        return AccountCode;
    }

    public void setAccountCode(String AccountCode) {
        this.AccountCode = AccountCode;
    }

    public String getTopSubjects() {
        return TopSubjects;
    }

    public void setTopSubjects(String TopSubjects) {
        this.TopSubjects = TopSubjects;
    }

    public String getTwoSubjects() {
        return TwoSubjects;
    }

    public void setTwoSubjects(String TwoSubjects) {
        this.TwoSubjects = TwoSubjects;
    }

    public Date getRecordTime() {
        return RecordTime;
    }

    public void setRecordTime(Date RecordTime) {
        this.RecordTime = RecordTime;
    }

    public String getDebitCreditor() {
        return DebitCreditor;
    }

    public void setDebitCreditor(String DebitCreditor) {
        this.DebitCreditor = DebitCreditor;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String Summary) {
        this.Summary = Summary;
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
