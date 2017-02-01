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
public class StockInventoryList {
    private Long stockInventoryListID;
    private String rowGUID;
    private String stockInventoryID;
    private String rowCode;
    private String stockID;
    private String materialID;
    
    private String batchNo;
    private String costOrganizationCode;
    private String costOrganizationName;
    private float warehouseQty;
    private float unitPrice;
    
    private float totalCost;
    private String dataType;
    private String dataID;
    private String dataRow;
    private String pickingID;
    
    private String pickingName;
    private String projectID;
    private String projectName;

    public Long getStockInventoryListID() {
        return stockInventoryListID;
    }

    public void setStockInventoryListID(Long stockInventoryListID) {
        this.stockInventoryListID = stockInventoryListID;
    }

    public String getRowGUID() {
        return rowGUID;
    }

    public void setRowGUID(String rowGUID) {
        this.rowGUID = rowGUID;
    }

    public String getStockInventoryID() {
        return stockInventoryID;
    }

    public void setStockInventoryID(String stockInventoryID) {
        this.stockInventoryID = stockInventoryID;
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

    public String getCostOrganizationCode() {
        return costOrganizationCode;
    }

    public void setCostOrganizationCode(String costOrganizationCode) {
        this.costOrganizationCode = costOrganizationCode;
    }

    public String getCostOrganizationName() {
        return costOrganizationName;
    }

    public void setCostOrganizationName(String costOrganizationName) {
        this.costOrganizationName = costOrganizationName;
    }

    public float getWarehouseQty() {
        return warehouseQty;
    }

    public void setWarehouseQty(float warehouseQty) {
        this.warehouseQty = warehouseQty;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataID() {
        return dataID;
    }

    public void setDataID(String dataID) {
        this.dataID = dataID;
    }

    public String getDataRow() {
        return dataRow;
    }

    public void setDataRow(String dataRow) {
        this.dataRow = dataRow;
    }

    public String getPickingID() {
        return pickingID;
    }

    public void setPickingID(String pickingID) {
        this.pickingID = pickingID;
    }

    public String getPickingName() {
        return pickingName;
    }

    public void setPickingName(String pickingName) {
        this.pickingName = pickingName;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    
    
}
