package com.yuntransadmin.project.model;

import java.util.Date;

public class Sys_memory_tab {
    private Integer vocabId;

    private String srcTextHash;

    private String srcLang;

    private String tgtLang;

    private String srcText;

    private String tgtText;

    private Date time;

    private String del;

    public Integer getVocabId() {
        return vocabId;
    }

    public void setVocabId(Integer vocabId) {
        this.vocabId = vocabId;
    }

    public String getSrcTextHash() {
        return srcTextHash;
    }

    public void setSrcTextHash(String srcTextHash) {
        this.srcTextHash = srcTextHash;
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