package com.gibbons.informationserver.entity;

import java.io.Serializable;
import java.util.Date;

public class Advisory implements Serializable {
    private Integer id;

    private String title;

    private Date createTime;

    private Date updateTime;

    private Date releaseTime;

    private Integer userId;

    private Float weights;

    private Integer annexType;

    private String annexStoragePath;

    private Integer annexSize;

    private Date annexUploadTime;

    private Integer status;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Float getWeights() {
        return weights;
    }

    public void setWeights(Float weights) {
        this.weights = weights;
    }

    public Integer getAnnexType() {
        return annexType;
    }

    public void setAnnexType(Integer annexType) {
        this.annexType = annexType;
    }

    public String getAnnexStoragePath() {
        return annexStoragePath;
    }

    public void setAnnexStoragePath(String annexStoragePath) {
        this.annexStoragePath = annexStoragePath == null ? null : annexStoragePath.trim();
    }

    public Integer getAnnexSize() {
        return annexSize;
    }

    public void setAnnexSize(Integer annexSize) {
        this.annexSize = annexSize;
    }

    public Date getAnnexUploadTime() {
        return annexUploadTime;
    }

    public void setAnnexUploadTime(Date annexUploadTime) {
        this.annexUploadTime = annexUploadTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}