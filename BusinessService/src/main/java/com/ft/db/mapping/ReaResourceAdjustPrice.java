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
public class ReaResourceAdjustPrice {
    private Long reaResourceAdjustPriceID;
    private String rowGUID;
    private String resourceID;
    private String resourceCode;
    private String resourceName;
    private float price;
    
    private float adjustPrice;
    private float tradeDiscount;
    private float cashDiscount;
    private float salesDiscount;
    private String resourceUnit;
    
    private String employeeCode;
    private String employeeName;
    private Date bussinessTime;
    private Date issueTime;
    private Date effectTime;
    
    private String state;
    private String remarks;

    public Long getReaResourceAdjustPriceID() {
        return reaResourceAdjustPriceID;
    }

    public void setReaResourceAdjustPriceID(Long reaResourceAdjustPriceID) {
        this.reaResourceAdjustPriceID = reaResourceAdjustPriceID;
    }

    public String getRowGUID() {
        return rowGUID;
    }

    public void setRowGUID(String rowGUID) {
        this.rowGUID = rowGUID;
    }

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getAdjustPrice() {
        return adjustPrice;
    }

    public void setAdjustPrice(float adjustPrice) {
        this.adjustPrice = adjustPrice;
    }

    public float getTradeDiscount() {
        return tradeDiscount;
    }

    public void setTradeDiscount(float tradeDiscount) {
        this.tradeDiscount = tradeDiscount;
    }

    public float getCashDiscount() {
        return cashDiscount;
    }

    public void setCashDiscount(float cashDiscount) {
        this.cashDiscount = cashDiscount;
    }

    public float getSalesDiscount() {
        return salesDiscount;
    }

    public void setSalesDiscount(float salesDiscount) {
        this.salesDiscount = salesDiscount;
    }

    public String getResourceUnit() {
        return resourceUnit;
    }

    public void setResourceUnit(String resourceUnit) {
        this.resourceUnit = resourceUnit;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public Date getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(Date effectTime) {
        this.effectTime = effectTime;
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
