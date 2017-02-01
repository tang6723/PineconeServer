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
public class AdvertisingSpace {
    private String advertisingSpaceID ;
    private int serialNo ;
    private String advertisingImage ;
    private String advertisingTitle ;
    private String advertisingDesc ;
    
    private Date beginTime ;
    private Date endTime ;
    private String location ;
    private String pagesURL ;
    private String merchantID ;
    
    private String merchant ;
    private float adsPrice ;
    private String sector ;
    private String sectorType ;
    private String adsSection ;
    
    private String adsUrl ;
    private String enableFlag ;
    private String deleteFlag ;
    private String remarks ;

    public String getAdvertisingSpaceID() {
        return advertisingSpaceID;
    }

    public void setAdvertisingSpaceID(String advertisingSpaceID) {
        this.advertisingSpaceID = advertisingSpaceID;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getAdvertisingImage() {
        return advertisingImage;
    }

    public void setAdvertisingImage(String advertisingImage) {
        this.advertisingImage = advertisingImage;
    }

    public String getAdvertisingTitle() {
        return advertisingTitle;
    }

    public void setAdvertisingTitle(String advertisingTitle) {
        this.advertisingTitle = advertisingTitle;
    }

    public String getAdvertisingDesc() {
        return advertisingDesc;
    }

    public void setAdvertisingDesc(String advertisingDesc) {
        this.advertisingDesc = advertisingDesc;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPagesURL() {
        return pagesURL;
    }

    public void setPagesURL(String pagesURL) {
        this.pagesURL = pagesURL;
    }

    public String getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(String merchantID) {
        this.merchantID = merchantID;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public float getAdsPrice() {
        return adsPrice;
    }

    public void setAdsPrice(float adsPrice) {
        this.adsPrice = adsPrice;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getSectorType() {
        return sectorType;
    }

    public void setSectorType(String sectorType) {
        this.sectorType = sectorType;
    }

    public String getAdsSection() {
        return adsSection;
    }

    public void setAdsSection(String adsSection) {
        this.adsSection = adsSection;
    }

    public String getAdsUrl() {
        return adsUrl;
    }

    public void setAdsUrl(String adsUrl) {
        this.adsUrl = adsUrl;
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
