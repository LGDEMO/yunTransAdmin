package com.yuntransadmin.project.model;

import java.util.Date;

public class User_invoice_tab {
    private String invoiceId;

    private String userId;

    private String invoicetitleId;

    private String addressId;

    private String invoiceAmount;

    private String relateOrder;

    private Date time;

    private String invoiceStatus;

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getInvoicetitleId() {
        return invoicetitleId;
    }

    public void setInvoicetitleId(String invoicetitleId) {
        this.invoicetitleId = invoicetitleId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getRelateOrder() {
        return relateOrder;
    }

    public void setRelateOrder(String relateOrder) {
        this.relateOrder = relateOrder;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }
}