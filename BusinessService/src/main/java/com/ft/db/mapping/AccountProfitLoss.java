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
public class AccountProfitLoss {
    private Long accountProfitLossID;
    private String rowGUID;
    private String enterpriseCode;
    private String enterpriseName;
    private String organizationCode;
    private String organizationName;
    
    private String accountYear;
    private String accountMonth;
    private String accountDay;
    private String voucher;
    private String brief;
    
    private String account;
    private float debit;
    private float credit;
    private float blanceAmount;
    private String aspect;
    
    private String reaEventID;
    private String accountDaybookID;
    private Date bussinessTime;
    private Date issueTime;
    private String preparerName;
    
    private String state;
    private String remarks;

    public Long getAccountProfitLossID() {
        return accountProfitLossID;
    }

    public void setAccountProfitLossID(Long accountProfitLossID) {
        this.accountProfitLossID = accountProfitLossID;
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

    public String getAccountYear() {
        return accountYear;
    }

    public void setAccountYear(String accountYear) {
        this.accountYear = accountYear;
    }

    public String getAccountMonth() {
        return accountMonth;
    }

    public void setAccountMonth(String accountMonth) {
        this.accountMonth = accountMonth;
    }

    public String getAccountDay() {
        return accountDay;
    }

    public void setAccountDay(String accountDay) {
        this.accountDay = accountDay;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public float getDebit() {
        return debit;
    }

    public void setDebit(float debit) {
        this.debit = debit;
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public float getBlanceAmount() {
        return blanceAmount;
    }

    public void setBlanceAmount(float blanceAmount) {
        this.blanceAmount = blanceAmount;
    }

    public String getAspect() {
        return aspect;
    }

    public void setAspect(String aspect) {
        this.aspect = aspect;
    }

    public String getReaEventID() {
        return reaEventID;
    }

    public void setReaEventID(String reaEventID) {
        this.reaEventID = reaEventID;
    }

    public String getAccountDaybookID() {
        return accountDaybookID;
    }

    public void setAccountDaybookID(String accountDaybookID) {
        this.accountDaybookID = accountDaybookID;
    }

    public Date getBussinessTime() {
        return bussinessTime;
    }

    public void setBussinessTime(Date bussinessTime) {
        this.bussinessTime = bussinessTime;
    }

    public Date getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }

    public String getPreparerName() {
        return preparerName;
    }

    public void setPreparerName(String preparerName) {
        this.preparerName = preparerName;
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
