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
public class MembersPayments {
    private String membersPaymentsID ;
    private String membersID ;
    private Date payTime ;
    private float payTotal ;
    private float goldCoin ;
    
    private String bankCard ;
    private String bankName ;
    private String bankAccount ;
    private String tradeCode ;
    private Date tradeTime ;
    
    private String enableFlag ;
    private String deleteFlag ;
    private String remarks ;

    public String getMembersPaymentsID() {
        return membersPaymentsID;
    }

    public void setMembersPaymentsID(String membersPaymentsID) {
        this.membersPaymentsID = membersPaymentsID;
    }

    public String getMembersID() {
        return membersID;
    }

    public void setMembersID(String membersID) {
        this.membersID = membersID;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public float getPayTotal() {
        return payTotal;
    }

    public void setPayTotal(float payTotal) {
        this.payTotal = payTotal;
    }

    public float getGoldCoin() {
        return goldCoin;
    }

    public void setGoldCoin(float goldCoin) {
        this.goldCoin = goldCoin;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
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
