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
public class GoodsAdjustment {
    private String goodsAdjustmentID ;
    private String goodsID ;
    private float groupPrice ;
    private float retailPrice ;
    private float benefitPrice ;
    
    private float formerGroupPrice ;
    private float formerRetailPrice ;
    private float formerBenefitPrice ;
    private Date adjustmentTime ;
    private Date effectiveTime ;
    
    private String operatorsID ;
    private String operators ;
    private String adjustmentType ;
    private String enableFlag ;
    private String deleteFlag ;
    
    private String remarks ;

    public String getGoodsAdjustmentID() {
        return goodsAdjustmentID;
    }

    public void setGoodsAdjustmentID(String goodsAdjustmentID) {
        this.goodsAdjustmentID = goodsAdjustmentID;
    }

    public String getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(String goodsID) {
        this.goodsID = goodsID;
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

    public float getFormerGroupPrice() {
        return formerGroupPrice;
    }

    public void setFormerGroupPrice(float formerGroupPrice) {
        this.formerGroupPrice = formerGroupPrice;
    }

    public float getFormerRetailPrice() {
        return formerRetailPrice;
    }

    public void setFormerRetailPrice(float formerRetailPrice) {
        this.formerRetailPrice = formerRetailPrice;
    }

    public float getFormerBenefitPrice() {
        return formerBenefitPrice;
    }

    public void setFormerBenefitPrice(float formerBenefitPrice) {
        this.formerBenefitPrice = formerBenefitPrice;
    }

    public Date getAdjustmentTime() {
        return adjustmentTime;
    }

    public void setAdjustmentTime(Date adjustmentTime) {
        this.adjustmentTime = adjustmentTime;
    }

    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getOperatorsID() {
        return operatorsID;
    }

    public void setOperatorsID(String operatorsID) {
        this.operatorsID = operatorsID;
    }

    public String getOperators() {
        return operators;
    }

    public void setOperators(String operators) {
        this.operators = operators;
    }

    public String getAdjustmentType() {
        return adjustmentType;
    }

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
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
