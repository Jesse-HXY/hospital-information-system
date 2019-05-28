package com.neuedu.hospitalinformationsystem.po;

import java.util.Date;

public class Patient {
    private Integer pId;

    private Date pBirth;

    private String pAdress;

    private Boolean pSex;

    private String pName;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Date getpBirth() {
        return pBirth;
    }

    public void setpBirth(Date pBirth) {
        this.pBirth = pBirth;
    }

    public String getpAdress() {
        return pAdress;
    }

    public void setpAdress(String pAdress) {
        this.pAdress = pAdress;
    }

    public Boolean getpSex() {
        return pSex;
    }

    public void setpSex(Boolean pSex) {
        this.pSex = pSex;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pId=").append(pId);
        sb.append(", pBirth=").append(pBirth);
        sb.append(", pAdress=").append(pAdress);
        sb.append(", pSex=").append(pSex);
        sb.append(", pName=").append(pName);
        sb.append("]");
        return sb.toString();
    }
}