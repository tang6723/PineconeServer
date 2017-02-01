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
public class AdvertisingEffects {
    private String advertisingEffectsID ;
    private String advertisementID ;
    private String advertisingSpaceID ;
    private int showTimes ;
    private int clickTimes ;
    
    private int browseTimes ;
    private float adsPrice ;
    private Date beginTime ;
    private Date endTime ;
    private float adsDuration ;
    
    private String sector ;
    private String sectorType ;
    private String adsSection ;
    private String adsUrl ;
    private String enableFlag ;
    
    private String deleteFlag ;
    private String remarks ;

    public String getAdvertisingEffectsID() {
        return advertisingEffectsID;
    }

    public void setAdvertisingEffectsID(String advertisingEffectsID) {
        this.advertisingEffectsID = advertisingEffectsID;
    }

    public String getAdvertisementID() {
        return advertisementID;
    }

    public void setAdvertisementID(String advertisementID) {
        this.advertisementID = advertisementID;
    }

    public String getAdvertisingSpaceID() {
        return advertisingSpaceID;
    }

    public void setAdvertisingSpaceID(String advertisingSpaceID) {
        this.advertisingSpaceID = advertisingSpaceID;
    }

    public int getShowTimes() {
        return showTimes;
    }

    public void setShowTimes(int showTimes) {
        this.showTimes = showTimes;
    }

    public int getClickTimes() {
        return clickTimes;
    }

    public void setClickTimes(int clickTimes) {
        this.clickTimes = clickTimes;
    }

    public int getBrowseTimes() {
        return browseTimes;
    }

    public void setBrowseTimes(int browseTimes) {
        this.browseTimes = browseTimes;
    }

    public float getAdsPrice() {
        return adsPrice;
    }

    public void setAdsPrice(float adsPrice) {
        this.adsPrice = adsPrice;
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

    public float getAdsDuration() {
        return adsDuration;
    }

    public void setAdsDuration(float adsDuration) {
        this.adsDuration = adsDuration;
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
