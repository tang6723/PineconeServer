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
public class MembersLevel {
    private String membersLevelID ;
    private String levelCode ;
    private int membersLevel ;
    private String membersID ;
    private String membersType ;
    
    private String membersName ;
    private String contacts ;
    private String contactsPhone ;
    private String topLevelID ;
    private String topMembersID ;
    
    private String enableFlag ;
    private String deleteFlag ;
    private String remarks ;

    public String getMembersLevelID() {
        return membersLevelID;
    }

    public void setMembersLevelID(String membersLevelID) {
        this.membersLevelID = membersLevelID;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public int getMembersLevel() {
        return membersLevel;
    }

    public void setMembersLevel(int membersLevel) {
        this.membersLevel = membersLevel;
    }

    public String getMembersID() {
        return membersID;
    }

    public void setMembersID(String membersID) {
        this.membersID = membersID;
    }

    public String getMembersType() {
        return membersType;
    }

    public void setMembersType(String membersType) {
        this.membersType = membersType;
    }

    public String getMembersName() {
        return membersName;
    }

    public void setMembersName(String membersName) {
        this.membersName = membersName;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    public String getTopLevelID() {
        return topLevelID;
    }

    public void setTopLevelID(String topLevelID) {
        this.topLevelID = topLevelID;
    }

    public String getTopMembersID() {
        return topMembersID;
    }

    public void setTopMembersID(String topMembersID) {
        this.topMembersID = topMembersID;
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
