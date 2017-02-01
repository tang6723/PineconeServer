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
public class GoodsImage {
    private String goodsImageID ;
    private String merchantGoodsID ;
    private String imageType ;
    private int serialNo ;
    private String goodsUrl ;
    
    private byte[] goodsImage ;
    private String enableFlag ;
    private String deleteFlag ;
    private String remarks ;

    public String getGoodsImageID() {
        return goodsImageID;
    }

    public void setGoodsImageID(String goodsImageID) {
        this.goodsImageID = goodsImageID;
    }

    public String getMerchantGoodsID() {
        return merchantGoodsID;
    }

    public void setMerchantGoodsID(String merchantGoodsID) {
        this.merchantGoodsID = merchantGoodsID;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getGoodsUrl() {
        return goodsUrl;
    }

    public void setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl;
    }

    public byte[] getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(byte[] goodsImage) {
        this.goodsImage = goodsImage;
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
