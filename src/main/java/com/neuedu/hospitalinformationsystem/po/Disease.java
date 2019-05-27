package com.neuedu.hospitalinformationsystem.po;

public class Disease {
    private Integer disId;

    private String disIcd;

    private String disName;

    private String disCode;

    private String disType;

    public Integer getDisId() {
        return disId;
    }

    public void setDisId(Integer disId) {
        this.disId = disId;
    }

    public String getDisIcd() {
        return disIcd;
    }

    public void setDisIcd(String disIcd) {
        this.disIcd = disIcd;
    }

    public String getDisName() {
        return disName;
    }

    public void setDisName(String disName) {
        this.disName = disName;
    }

    public String getDisCode() {
        return disCode;
    }

    public void setDisCode(String disCode) {
        this.disCode = disCode;
    }

    public String getDisType() {
        return disType;
    }

    public void setDisType(String disType) {
        this.disType = disType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", disId=").append(disId);
        sb.append(", disIcd=").append(disIcd);
        sb.append(", disName=").append(disName);
        sb.append(", disCode=").append(disCode);
        sb.append(", disType=").append(disType);
        sb.append("]");
        return sb.toString();
    }
}