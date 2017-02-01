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
public class ReaContracts {
    private Long reaContractsID;
    private String rowGUID;
    private String contractsCode;
    private String enterpriseCode;
    private String enterpriseName;
    private String organizationCode;
    
    private String organizationName;    
    private String contractsName;
    private String contractsType;
    private Date businessTime;
    private Date issueTime;    
    
    private Date supplyTime;
    private String paymentCode;
    private String paymentName;
    private String settlementCode;
    private String settlementName;
    
    private String salesmanID;
    private String salesmanName;
    private String clientID;
    private String clientName;
    private float contractValue;
    
    private float taxRate;
    private float taxes;
    private float shippingCost;
    private float installationsCharge;
    private String state;
    
    private String remarks;

    public Long getReaContractsID() {
        return reaContractsID;
    }

    public void setReaContractsID(Long reaContractsID) {
        this.reaContractsID = reaContractsID;
    }

    public String getRowGUID() {
        return rowGUID;
    }

    public void setRowGUID(String rowGUID) {
        this.rowGUID = rowGUID;
    }

    public String getContractsCode() {
        return contractsCode;
    }

    public void setContractsCode(String contractsCode) {
        this.contractsCode = contractsCode;
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

    public String getContractsName() {
        return contractsName;
    }

    public void setContractsName(String contractsName) {
        this.contractsName = contractsName;
    }

    public String getContractsType() {
        return contractsType;
    }

    public void setContractsType(String contractsType) {
        this.contractsType = contractsType;
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

    public Date getSupplyTime() {
        return supplyTime;
    }

    public void setSupplyTime(Date supplyTime) {
        this.supplyTime = supplyTime;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public String getSettlementCode() {
        return settlementCode;
    }

    public void setSettlementCode(String settlementCode) {
        this.settlementCode = settlementCode;
    }

    public String getSettlementName() {
        return settlementName;
    }

    public void setSettlementName(String settlementName) {
        this.settlementName = settlementName;
    }

    public String getSalesmanID() {
        return salesmanID;
    }

    public void setSalesmanID(String salesmanID) {
        this.salesmanID = salesmanID;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public float getContractValue() {
        return contractValue;
    }

    public void setContractValue(float contractValue) {
        this.contractValue = contractValue;
    }

    public float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(float taxRate) {
        this.taxRate = taxRate;
    }

    public float getTaxes() {
        return taxes;
    }

    public void setTaxes(float taxes) {
        this.taxes = taxes;
    }

    public float getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(float shippingCost) {
        this.shippingCost = shippingCost;
    }

    public float getInstallationsCharge() {
        return installationsCharge;
    }

    public void setInstallationsCharge(float installationsCharge) {
        this.installationsCharge = installationsCharge;
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
