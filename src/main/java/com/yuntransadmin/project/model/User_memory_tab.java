package com.yuntransadmin.project.model;

import java.util.Date;

public class User_memory_tab {
    private Integer memoryId;

    private String userId;

    private String srcLang;

    private String tgtLang;

    private String srcText;

    private String tgtText;

    private String type;

    private Date time;

    private String del;

    public Integer getMemoryId() {
        return memoryId;
    }

    public void setMemoryId(Integer memoryId) {
        this.memoryId = memoryId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSrcLang() {
        return srcLang;
    }

    public void setSrcLang(String srcLang) {
        this.srcLang = srcLang;
    }

    public String getTgtLang() {
        return tgtLang;
    }

    public void setTgtLang(String tgtLang) {
        this.tgtLang = tgtLang;
    }

    public String getSrcText() {
        return srcText;
    }

    public void setSrcText(String srcText) {
        this.srcText = srcText;
    }

    public String getTgtText() {
        return tgtText;
    }

    public void setTgtText(String tgtText) {
        this.tgtText = tgtText;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }
}