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
public class RunningAccount {
    private String runningAccountID ;
    private Date businessTime ;
    private String relevantID ;
    private String relevantDesc ;
    private String membersID ;
    
    private String merchantID ;
    private String agentID ;
    private String accountCode ;
    private String topSubjects ;
    private String twoSubjects ;
    
    private Date recordTime ;
    private String debitCreditor ;
    private float amount ;
    private String summary ;
    private Date auditTime ;
    
    private String auditorID ;
    private String auditor ;
    private String assessment ;
    private String deleteFlag ;
    private String remarks ;

    public String getRunningAccountID() {
        return runningAccountID;
    }

    public void setRunningAccountID(String runningAccountID) {
        this.runningAccountID = runningAccountID;
    }

    public Date getBusinessTime() {
        return businessTime;
    }

    public void setBusinessTime(Date businessTime) {
        this.businessTime = businessTime;
    }

    public String getRelevantID() {
        return relevantID;
    }

    public void setRelevantID(String relevantID) {
        this.relevantID = relevantID;
    }

    public String getRelevantDesc() {
        return relevantDesc;
    }

    public void setRelevantDesc(String relevantDesc) {
        this.relevantDesc = relevantDesc;
    }

    public String getMembersID() {
        return membersID;
    }

    public void setMembersID(String membersID) {
        this.membersID = membersID;
    }

    public String getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(String merchantID) {
        this.merchantID = merchantID;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getTopSubjects() {
        return topSubjects;
    }

    public void setTopSubjects(String topSubjects) {
        this.topSubjects = topSubjects;
    }

    public String getTwoSubjects() {
        return twoSubjects;
    }

    public void setTwoSubjects(String twoSubjects) {
        this.twoSubjects = twoSubjects;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public String getDebitCreditor() {
        return debitCreditor;
    }

    public void setDebitCreditor(String debitCreditor) {
        this.debitCreditor = debitCreditor;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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
