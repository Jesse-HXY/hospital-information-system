package com.neuedu.hospitalinformationsystem.po;

import java.util.Date;

public class Diagnosistemplate {
    private Integer datId;

    private Integer diaTId;

    private Integer uId;

    private String datName;

    private Date datTime;

    private Double datFee;

    private String datScope;

    public Integer getDatId() {
        return datId;
    }

    public void setDatId(Integer datId) {
        this.datId = datId;
    }

    public Integer getDiaTId() {
        return diaTId;
    }

    public void setDiaTId(Integer diaTId) {
        this.diaTId = diaTId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getDatName() {
        return datName;
    }

    public void setDatName(String datName) {
        this.datName = datName;
    }

    public Date getDatTime() {
        return datTime;
    }

    public void setDatTime(Date datTime) {
        this.datTime = datTime;
    }

    public Double getDatFee() {
        return datFee;
    }

    public void setDatFee(Double datFee) {
        this.datFee = datFee;
    }

    public String getDatScope() {
        return datScope;
    }

    public void setDatScope(String datScope) {
        this.datScope = datScope;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", datId=").append(datId);
        sb.append(", diaTId=").append(diaTId);
        sb.append(", uId=").append(uId);
        sb.append(", datName=").append(datName);
        sb.append(", datTime=").append(datTime);
        sb.append(", datFee=").append(datFee);
        sb.append(", datScope=").append(datScope);
        sb.append("]");
        return sb.toString();
    }
}