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
public class GoodsComment {
    private String goodsCommentID ;
    private String goodsID ;
    private String isTop ;
    private float goodsScore ;
    private String commentsDesc ;
    
    private String operatorsID ;
    private String operators ;
    private String operatorsImage ;
    private Date issueTime ;
    private Date auditTime ;
    
    private String auditorID ;
    private String auditor ;
    private String assessment ;
    private String enableFlag ;
    private String deleteFlag ;
    
    private String remarks ;

    public String getGoodsCommentID() {
        return goodsCommentID;
    }

    public void setGoodsCommentID(String goodsCommentID) {
        this.goodsCommentID = goodsCommentID;
    }

    public String getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(String goodsID) {
        this.goodsID = goodsID;
    }

    public String getIsTop() {
        return isTop;
    }

    public void setIsTop(String isTop) {
        this.isTop = isTop;
    }

    public float getGoodsScore() {
        return goodsScore;
    }

    public void setGoodsScore(float goodsScore) {
        this.goodsScore = goodsScore;
    }

    public String getCommentsDesc() {
        return commentsDesc;
    }

    public void setCommentsDesc(String commentsDesc) {
        this.commentsDesc = commentsDesc;
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

    public String getOperatorsImage() {
        return operatorsImage;
    }

    public void setOperatorsImage(String operatorsImage) {
        this.operatorsImage = operatorsImage;
    }

    public Date getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditorID() {
        return auditorID;
    }

    public void setAuditorID(String auditorID) {
        this.auditorID = auditorID;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
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
