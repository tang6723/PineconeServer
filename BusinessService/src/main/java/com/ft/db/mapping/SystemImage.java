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
public class SystemImage {
    private Long systemImageID;
    private String rowGUID;
    private String imageType;
    private String imageName;
    private byte[] graph;
    private byte[] thumbnail;
    
    private String graphURL;
    private String thumbnailURL;
    private String   state;
    private String   remarks;

    public Long getSystemImageID() {
        return systemImageID;
    }

    public void setSystemImageID(Long systemImageID) {
        this.systemImageID = systemImageID;
    }

    public String getRowGUID() {
        return rowGUID;
    }

    public void setRowGUID(String rowGUID) {
        this.rowGUID = rowGUID;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public byte[] getGraph() {
        return graph;
    }

    public void setGraph(byte[] graph) {
        this.graph = graph;
    }

    public byte[] getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getGraphURL() {
        return graphURL;
    }

    public void setGraphURL(String graphURL) {
        this.graphURL = graphURL;
    }

    public String getThumbnailURL() {
        return thumbnailURL;
    }

    public void setThumbnailURL(String thumbnailURL) {
        this.thumbnailURL = thumbnailURL;
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
