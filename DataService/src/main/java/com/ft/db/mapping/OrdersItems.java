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
public class OrdersItems {
    private String ordersItemsID ;
    private String ordersID ;
    private String ordersCode ;
    private String merchantID ;
    private String merchant ;
    
    private String membersID ;
    private String members ;
    private String goodsID ;
    private String ordersType ;
    private String goodsName ;
    
    private String goodsUnit ;
    private float groupPrice ;
    private float retailPrice ;
    private float benefitPrice ;
    private String goodsDesc ;
    
    private float orderQty ;
    private float payPrice ;
    private float itemsTotal ;
    private String enableFlag ;
    private String deleteFlag ;
    
    private String remarks ;

    public String getOrdersItemsID() {
        return ordersItemsID;
    }

    public void setOrdersItemsID(String ordersItemsID) {
        this.ordersItemsID = ordersItemsID;
    }

    public String getOrdersID() {
        return ordersID;
    }

    public void setOrdersID(String ordersID) {
        this.ordersID = ordersID;
    }

    public String getOrdersCode() {
        return ordersCode;
    }

    public void setOrdersCode(String ordersCode) {
        this.ordersCode = ordersCode;
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

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public String getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(String goodsID) {
        this.goodsID = goodsID;
    }

    public String getOrdersType() {
        return ordersType;
    }

    public void setOrdersType(String ordersType) {
        this.ordersType = ordersType;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
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

    public float getBenefitPrice() {
        return benefitPrice;
    }

    public void setBenefitPrice(float benefitPrice) {
        this.benefitPrice = benefitPrice;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public float getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(float orderQty) {
        this.orderQty = orderQty;
    }

    public float getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(float payPrice) {
        this.payPrice = payPrice;
    }

    public float getItemsTotal() {
        return itemsTotal;
    }

    public void setItemsTotal(float itemsTotal) {
        this.itemsTotal = itemsTotal;
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
