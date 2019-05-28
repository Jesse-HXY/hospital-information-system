package com.neuedu.hospitalinformationsystem.po;

import java.util.Date;

public class Invoce {
    private Integer iId;

    private Integer eIId;

    private Integer rId;

    private Integer diaId;

    private Date payTime;

    private String payType;

    private Boolean isEffective;

    private Double paymount;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Integer geteIId() {
        return eIId;
    }

    public void seteIId(Integer eIId) {
        this.eIId = eIId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getDiaId() {
        return diaId;
    }

    public void setDiaId(Integer diaId) {
        this.diaId = diaId;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Boolean getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Boolean isEffective) {
        this.isEffective = isEffective;
    }

    public Double getPaymount() {
        return paymount;
    }

    public void setPaymount(Double paymount) {
        this.paymount = paymount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", iId=").append(iId);
        sb.append(", eIId=").append(eIId);
        sb.append(", rId=").append(rId);
        sb.append(", diaId=").append(diaId);
        sb.append(", payTime=").append(payTime);
        sb.append(", payType=").append(payType);
        sb.append(", isEffective=").append(isEffective);
        sb.append(", paymount=").append(paymount);
        sb.append("]");
        return sb.toString();
    }
}