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
public class ContractsExpenses {
    
    private Long ContractsExpensesID;
    private String rowGUID;
    private String enterpriseCode;
    private String enterpriseName;
    private String organizationCode;
    private String organizationName;
    
    private String reaEnterpriseDictionaryID;
    private String dictionariesType;
    private String dictionariesClassfication;
    private String projectCode;
    private String projectName;
    
    private String leaderCode;
    private String leaderName;
    private String employeeCode;
    private String employeeName;
    private Date bussinessTime;
    
    private Date issueTime;
    private Date settlementTime;
    private float applicationAmount;
    private float approvedAmount;
    private String expensesDesc;
    
    private String state;
    private String remarks;

    public Long getContractsExpensesID() {
        return ContractsExpensesID;
    }

    public void setContractsExpensesID(Long ContractsExpensesID) {
        this.ContractsExpensesID = ContractsExpensesID;
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

    public String getReaEnterpriseDictionaryID() {
        return reaEnterpriseDictionaryID;
    }

    public void setReaEnterpriseDictionaryID(String reaEnterpriseDictionaryID) {
        this.reaEnterpriseDictionaryID = reaEnterpriseDictionaryID;
    }

    public String getDictionariesType() {
        return dictionariesType;
    }

    public void setDictionariesType(String dictionariesType) {
        this.dictionariesType = dictionariesType;
    }

    public String getDictionariesClassfication() {
        return dictionariesClassfication;
    }

    public void setDictionariesClassfication(String dictionariesClassfication) {
        this.dictionariesClassfication = dictionariesClassfication;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getLeaderCode() {
        return leaderCode;
    }

    public void setLeaderCode(String leaderCode) {
        this.leaderCode = leaderCode;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
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

    public Date getSettlementTime() {
        return settlementTime;
    }

    public void setSettlementTime(Date settlementTime) {
        this.settlementTime = settlementTime;
    }

    public float getApplicationAmount() {
        return applicationAmount;
    }

    public void setApplicationAmount(float applicationAmount) {
        this.applicationAmount = applicationAmount;
    }

    public float getApprovedAmount() {
        return approvedAmount;
    }

    public void setApprovedAmount(float approvedAmount) {
        this.approvedAmount = approvedAmount;
    }

    public String getExpensesDesc() {
        return expensesDesc;
    }

    public void setExpensesDesc(String expensesDesc) {
        this.expensesDesc = expensesDesc;
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
