package com.yuntransadmin.project.model;

import java.util.Date;

public class Ol_translation_tab {
    private Integer translationId;

    private String appkey;

    private String ipAddr;

    private String srcLang;

    private String tgtLang;

    private String srcText;

    private String tgtText;

    private String packageId;

    private Integer charLength;

    private Date createTime;

    public Integer getTranslationId() {
        return translationId;
    }

    public void setTranslationId(Integer translationId) {
        this.translationId = translationId;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
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

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public Integer getCharLength() {
        return charLength;
    }

    public void setCharLength(Integer charLength) {
        this.charLength = charLength;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}