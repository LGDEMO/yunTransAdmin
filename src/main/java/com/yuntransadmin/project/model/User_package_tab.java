package com.yuntransadmin.project.model;

import java.util.Date;

public class User_package_tab {
    private String userPackageId;

    private String userId;

    private Integer packageId;

    private String totalCharnumber;

    private String usedCharnumber;

    private String packageStatus;

    private Date startTime;

    private Date endTime;

    public String getUserPackageId() {
        return userPackageId;
    }

    public void setUserPackageId(String userPackageId) {
        this.userPackageId = userPackageId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getTotalCharnumber() {
        return totalCharnumber;
    }

    public void setTotalCharnumber(String totalCharnumber) {
        this.totalCharnumber = totalCharnumber;
    }

    public String getUsedCharnumber() {
        return usedCharnumber;
    }

    public void setUsedCharnumber(String usedCharnumber) {
        this.usedCharnumber = usedCharnumber;
    }

    public String getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}