/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.mapping;

/**
 *
 * @author Tang
 */
public class StockCheckList {
    private Long stockCheckListID;
    private String rowGUID;
    private String stockCheckID;
    private String rowCode;
    private String stockID;
    private String materialID;
    
    private String batchNo;
    private float accountQty;
    private float checkQty;
    private String state;
    private String remarks;

    public Long getStockCheckListID() {
        return stockCheckListID;
    }

    public void setStockCheckListID(Long stockCheckListID) {
        this.stockCheckListID = stockCheckListID;
    }

    public String getRowGUID() {
        return rowGUID;
    }

    public void setRowGUID(String rowGUID) {
        this.rowGUID = rowGUID;
    }

    public String getStockCheckID() {
        return stockCheckID;
    }

    public void setStockCheckID(String stockCheckID) {
        this.stockCheckID = stockCheckID;
    }

    public String getRowCode() {
        return rowCode;
    }

    public void setRowCode(String rowCode) {
        this.rowCode = rowCode;
    }

    public String getStockID() {
        return stockID;
    }

    public void setStockID(String stockID) {
        this.stockID = stockID;
    }

    public String getMaterialID() {
        return materialID;
    }

    public void setMaterialID(String materialID) {
        this.materialID = materialID;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public float getAccountQty() {
        return accountQty;
    }

    public void setAccountQty(float accountQty) {
        this.accountQty = accountQty;
    }

    public float getCheckQty() {
        return checkQty;
    }

    public void setCheckQty(float checkQty) {
        this.checkQty = checkQty;
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
