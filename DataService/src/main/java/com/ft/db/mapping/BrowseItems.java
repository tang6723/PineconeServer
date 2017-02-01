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
public class BrowseItems {
    private String browseItemsID ;
    private String merchantID ;
    private String merchant ;
    private String membersID ;
    private String membersName ;
    
    private Date browseTime ;
    private String goodsID ;
    private String goodsType ;
    private String goodsName ;
    private String goodsUnits ;
    
    private float groupPrice ;
    private float retailPrice ;
    private float membersPrice ;
    private float transactionPrice ;
    private String goodsDesc ;
    
    private String enableFlag ;
    private String deleteFlag ;
    private String remarks ;

    public String getBrowseItemsID() {
        return browseItemsID;
    }

    public void setBrowseItemsID(String browseItemsID) {
        this.browseItemsID = browseItemsID;
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

    public String getMembersID() {
        return membersID;
    }

    public void setMembersID(String membersID) {
        this.membersID = membersID;
    }

    public String getMembersName() {
        return membersName;
    }

    public void setMembersName(String membersName) {
        this.membersName = membersName;
    }

    public Date getBrowseTime() {
        return browseTime;
    }

    public void setBrowseTime(Date browseTime) {
        this.browseTime = browseTime;
    }

    public String getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(String goodsID) {
        this.goodsID = goodsID;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsUnits() {
        return goodsUnits;
    }

    public void setGoodsUnits(String goodsUnits) {
        this.goodsUnits = goodsUnits;
    }

    public float getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(float groupPrice) {
        this.groupPrice = groupPrice;
    }

    public float getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(float retailPrice) {
        this.retailPrice = retailPrice;
    }

    public float getMembersPrice() {
        return membersPrice;
    }

    public void setMembersPrice(float membersPrice) {
        this.membersPrice = membersPrice;
    }

    public float getTransactionPrice() {
        return transactionPrice;
    }

    public void setTransactionPrice(float transactionPrice) {
        this.transactionPrice = transactionPrice;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
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
