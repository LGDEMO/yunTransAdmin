package com.yuntransadmin.project.model;

import java.util.Date;

public class Appkey_tab {
    private String appkey;

    private Integer totalChar;

    private Integer usedChar;

    private Integer totalTrans;

    private Integer usedTrans;

    private String remarks;

    private String userStatus;

    private Date createTime;

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public Integer getTotalChar() {
        return totalChar;
    }

    public void setTotalChar(Integer totalChar) {
        this.totalChar = totalChar;
    }

    public Integer getUsedChar() {
        return usedChar;
    }

    public void setUsedChar(Integer usedChar) {
        this.usedChar = usedChar;
    }

    public Integer getTotalTrans() {
        return totalTrans;
    }

    public void setTotalTrans(Integer totalTrans) {
        this.totalTrans = totalTrans;
    }

    public Integer getUsedTrans() {
        return usedTrans;
    }

    public void setUsedTrans(Integer usedTrans) {
        this.usedTrans = usedTrans;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}