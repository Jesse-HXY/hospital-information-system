package com.neuedu.hospitalinformationsystem.po;

import java.util.Date;

public class Examnationtemplate {
    private Integer eTId;

    private String eTName;

    private Date eTDate;

    private String eTScope;

    private String recordType;

    private Double eTFee;

    public Integer geteTId() {
        return eTId;
    }

    public void seteTId(Integer eTId) {
        this.eTId = eTId;
    }

    public String geteTName() {
        return eTName;
    }

    public void seteTName(String eTName) {
        this.eTName = eTName;
    }

    public Date geteTDate() {
        return eTDate;
    }

    public void seteTDate(Date eTDate) {
        this.eTDate = eTDate;
    }

    public String geteTScope() {
        return eTScope;
    }

    public void seteTScope(String eTScope) {
        this.eTScope = eTScope;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public Double geteTFee() {
        return eTFee;
    }

    public void seteTFee(Double eTFee) {
        this.eTFee = eTFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eTId=").append(eTId);
        sb.append(", eTName=").append(eTName);
        sb.append(", eTDate=").append(eTDate);
        sb.append(", eTScope=").append(eTScope);
        sb.append(", recordType=").append(recordType);
        sb.append(", eTFee=").append(eTFee);
        sb.append("]");
        return sb.toString();
    }
}