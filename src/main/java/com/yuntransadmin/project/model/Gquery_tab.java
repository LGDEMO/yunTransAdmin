package com.yuntransadmin.project.model;

import java.util.Date;

public class Gquery_tab {
    private Integer gqId;

    private String type;

    private String appkey;

    private String saveName;

    private Date time;

    public Integer getGqId() {
        return gqId;
    }

    public void setGqId(Integer gqId) {
        this.gqId = gqId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}