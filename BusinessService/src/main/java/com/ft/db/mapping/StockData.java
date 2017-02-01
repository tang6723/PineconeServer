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
public class StockData {
    private Long stockDataID;
    private String rowGUID;
    private String enterpriseCode;
    private String enterpriseName;
    private String organizationCode;
    private String organizationName;
    
    private String stockID;
    private String materialID;
    private String costOrganizationCode;
    private String accountYear;
    private String batchNo;
    
    private float openingStock;
    private float warehouseQty;
    private float outputQty;
    private float endingQty;
    private float openingAmount;
    
    private String state;
    private String remarks;

    public Long getStockDataID() {
        return stockDataID;
    }

    public void setStockDataID(Long stockDataID) {
        this.stockDataID = stockDataID;
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

    public String getCostOrganizationCode() {
        return costOrganizationCode;
    }

    public void setCostOrganizationCode(String costOrganizationCode) {
        this.costOrganizationCode = costOrganizationCode;
    }

    public String getAccountYear() {
        return accountYear;
    }

    public void setAccountYear(String accountYear) {
        this.accountYear = accountYear;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public float getOpeningStock() {
        return openingStock;
    }

    public void setOpeningStock(float openingStock) {
        this.openingStock = openingStock;
    }

    public float getWarehouseQty() {
        return warehouseQty;
    }

    public void setWarehouseQty(float warehouseQty) {
        this.warehouseQty = warehouseQty;
    }

    public float getOutputQty() {
        return outputQty;
    }

    public void setOutputQty(float outputQty) {
        this.outputQty = outputQty;
    }

    public float getEndingQty() {
        return endingQty;
    }

    public void setEndingQty(float endingQty) {
        this.endingQty = endingQty;
    }

    public float getOpeningAmount() {
        return openingAmount;
    }

    public void setOpeningAmount(float openingAmount) {
        this.openingAmount = openingAmount;
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
