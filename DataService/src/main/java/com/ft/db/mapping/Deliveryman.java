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
public class Deliveryman {
    private String deliverymanID ;
    private String deliveryID ;
    private String delivery ;
    private String deliverymanCode ;
    private String deliverymanName ;
    
    private String deliverymanPhone ;
    private String deliverymanImage ;
    private Date jobTime ;
    private String mileage ;
    private String deliverySum ;
    
    private String enableFlag ;
    private String deleteFlag ;
    private String remarks ;

    public String getDeliverymanID() {
        return deliverymanID;
    }

    public void setDeliverymanID(String deliverymanID) {
        this.deliverymanID = deliverymanID;
    }

    public String getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(String deliveryID) {
        this.deliveryID = deliveryID;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getDeliverymanCode() {
        return deliverymanCode;
    }

    public void setDeliverymanCode(String deliverymanCode) {
        this.deliverymanCode = deliverymanCode;
    }

    public String getDeliverymanName() {
        return deliverymanName;
    }

    public void setDeliverymanName(String deliverymanName) {
        this.deliverymanName = deliverymanName;
    }

    public String getDeliverymanPhone() {
        return deliverymanPhone;
    }

    public void setDeliverymanPhone(String deliverymanPhone) {
        this.deliverymanPhone = deliverymanPhone;
    }

    public String getDeliverymanImage() {
        return deliverymanImage;
    }

    public void setDeliverymanImage(String deliverymanImage) {
        this.deliverymanImage = deliverymanImage;
    }

    public Date getJobTime() {
        return jobTime;
    }

    public void setJobTime(Date jobTime) {
        this.jobTime = jobTime;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getDeliverySum() {
        return deliverySum;
    }

    public void setDeliverySum(String deliverySum) {
        this.deliverySum = deliverySum;
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
