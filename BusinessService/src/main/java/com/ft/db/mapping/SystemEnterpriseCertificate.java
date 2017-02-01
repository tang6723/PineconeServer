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
public class SystemEnterpriseCertificate {
    private Long systemEnterpriseCertificateID;
    private String rowGUID;
    private String licenseCode;
    private String licenseImageID;
    private String licenseImageURL;
    private String legalPerson;
    
    private String enterpriseAddress;
    private String contactName;
    private String contactTelephone;
    private String enterprisePhone;
    private String certificateState;
    
    private Date certificateTime;
    private Date isussTime;
    private String state;
    private String remarks;

    public Long getSystemEnterpriseCertificateID() {
        return systemEnterpriseCertificateID;
    }

    public void setSystemEnterpriseCertificateID(Long systemEnterpriseCertificateID) {
        this.systemEnterpriseCertificateID = systemEnterpriseCertificateID;
    }

    public String getRowGUID() {
        return rowGUID;
    }

    public void setRowGUID(String rowGUID) {
        this.rowGUID = rowGUID;
    }

    public String getLicenseCode() {
        return licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    public String getLicenseImageID() {
        return licenseImageID;
    }

    public void setLicenseImageID(String licenseImageID) {
        this.licenseImageID = licenseImageID;
    }

    public String getLicenseImageURL() {
        return licenseImageURL;
    }

    public void setLicenseImageURL(String licenseImageURL) {
        this.licenseImageURL = licenseImageURL;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTelephone() {
        return contactTelephone;
    }

    public void setContactTelephone(String contactTelephone) {
        this.contactTelephone = contactTelephone;
    }

    public String getEnterprisePhone() {
        return enterprisePhone;
    }

    public void setEnterprisePhone(String enterprisePhone) {
        this.enterprisePhone = enterprisePhone;
    }

    public String getCertificateState() {
        return certificateState;
    }

    public void setCertificateState(String certificateState) {
        this.certificateState = certificateState;
    }

    public Date getCertificateTime() {
        return certificateTime;
    }

    public void setCertificateTime(Date certificateTime) {
        this.certificateTime = certificateTime;
    }

    public Date getIsussTime() {
        return isussTime;
    }

    public void setIsussTime(Date isussTime) {
        this.isussTime = isussTime;
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
