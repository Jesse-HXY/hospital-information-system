package com.neuedu.hospitalinformationsystem.po;

public class Examnationitem {
    private Integer eIId;

    private String dId;

    private String eIName;

    private String elSpecification;

    private Double eIFee;

    private String elFeeType;

    private String elCode;

    public Integer geteIId() {
        return eIId;
    }

    public void seteIId(Integer eIId) {
        this.eIId = eIId;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    public String geteIName() {
        return eIName;
    }

    public void seteIName(String eIName) {
        this.eIName = eIName;
    }

    public String getElSpecification() {
        return elSpecification;
    }

    public void setElSpecification(String elSpecification) {
        this.elSpecification = elSpecification;
    }

    public Double geteIFee() {
        return eIFee;
    }

    public void seteIFee(Double eIFee) {
        this.eIFee = eIFee;
    }

    public String getElFeeType() {
        return elFeeType;
    }

    public void setElFeeType(String elFeeType) {
        this.elFeeType = elFeeType;
    }

    public String getElCode() {
        return elCode;
    }

    public void setElCode(String elCode) {
        this.elCode = elCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eIId=").append(eIId);
        sb.append(", dId=").append(dId);
        sb.append(", eIName=").append(eIName);
        sb.append(", elSpecification=").append(elSpecification);
        sb.append(", eIFee=").append(eIFee);
        sb.append(", elFeeType=").append(elFeeType);
        sb.append(", elCode=").append(elCode);
        sb.append("]");
        return sb.toString();
    }
}