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
public class AccountAlarm {
    private Long accountAlarmID;
    private String rowGUID;
    private String enterpriseCode;
    private String enterpriseName;
    private String organizationCode;
    
    private String organizationName;
    private String reaEventID;
    private String eventName;
    private String DSUBID1;
    private String DSUBID2;
    
    private String DSUBID3;
    private String DSUBID4;
    private String DSUBID5;
    private String CSUBID1;
    private String CSUBID2;
    
    private String CSUBID3;
    private String CSUBID4;
    private String CSUBID5;
    private float debitAmount;
    private float creditAmount;
    
    private Date businessTime;
    private Date issueTime;
    private Date alertTime;
    private Date handleTime;
    private String handleState;
    
    private String alertState;
    private String preparerName;
    private String handleName;
    private String state;
    private String remarks;

    public Long getAccountAlarmID() {
        return accountAlarmID;
    }

    public void setAccountAlarmID(Long accountAlarmID) {
        this.accountAlarmID = accountAlarmID;
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

    public String getReaEventID() {
        return reaEventID;
    }

    public void setReaEventID(String reaEventID) {
        this.reaEventID = reaEventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDSUBID1() {
        return DSUBID1;
    }

    public void setDSUBID1(String DSUBID1) {
        this.DSUBID1 = DSUBID1;
    }

    public String getDSUBID2() {
        return DSUBID2;
    }

    public void setDSUBID2(String DSUBID2) {
        this.DSUBID2 = DSUBID2;
    }

    public String getDSUBID3() {
        return DSUBID3;
    }

    public void setDSUBID3(String DSUBID3) {
        this.DSUBID3 = DSUBID3;
    }

    public String getDSUBID4() {
        return DSUBID4;
    }

    public void setDSUBID4(String DSUBID4) {
        this.DSUBID4 = DSUBID4;
    }

    public String getDSUBID5() {
        return DSUBID5;
    }

    public void setDSUBID5(String DSUBID5) {
        this.DSUBID5 = DSUBID5;
    }

    public String getCSUBID1() {
        return CSUBID1;
    }

    public void setCSUBID1(String CSUBID1) {
        this.CSUBID1 = CSUBID1;
    }

    public String getCSUBID2() {
        return CSUBID2;
    }

    public void setCSUBID2(String CSUBID2) {
        this.CSUBID2 = CSUBID2;
    }

    public String getCSUBID3() {
        return CSUBID3;
    }

    public void setCSUBID3(String CSUBID3) {
        this.CSUBID3 = CSUBID3;
    }

    public String getCSUBID4() {
        return CSUBID4;
    }

    public void setCSUBID4(String CSUBID4) {
        this.CSUBID4 = CSUBID4;
    }

    public String getCSUBID5() {
        return CSUBID5;
    }

    public void setCSUBID5(String CSUBID5) {
        this.CSUBID5 = CSUBID5;
    }

    public float getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(float debitAmount) {
        this.debitAmount = debitAmount;
    }

    public float getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(float creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Date getBusinessTime() {
        return businessTime;
    }

    public void setBusinessTime(Date businessTime) {
        this.businessTime = businessTime;
    }

    public Date getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }

    public Date getAlertTime() {
        return alertTime;
    }

    public void setAlertTime(Date alertTime) {
        this.alertTime = alertTime;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public String getHandleState() {
        return handleState;
    }

    public void setHandleState(String handleState) {
        this.handleState = handleState;
    }

    public String getAlertState() {
        return alertState;
    }

    public void setAlertState(String alertState) {
        this.alertState = alertState;
    }

    public String getPreparerName() {
        return preparerName;
    }

    public void setPreparerName(String preparerName) {
        this.preparerName = preparerName;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {
        this.handleName = handleName;
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
