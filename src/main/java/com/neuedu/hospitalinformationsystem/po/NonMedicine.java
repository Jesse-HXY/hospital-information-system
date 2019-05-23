package com.neuedu.hospitalinformationsystem.po;

public class NonMedicine {
    private String nmId;
    private String nmName;
    private double nmFee;
    private String nmStandard;
    private String nmFeeType;
    private String nmCode;

    @Override
    public String toString() {
        return "NonMedicine{" +
                "nmId='" + nmId + '\'' +
                ", nmName='" + nmName + '\'' +
                ", nmFee=" + nmFee +
                ", nmStandard='" + nmStandard + '\'' +
                ", nmFeeType='" + nmFeeType + '\'' +
                '}';
    }

    public String getNmStandard() {
        return nmStandard;
    }

    public void setNmStandard(String nmStandard) {
        this.nmStandard = nmStandard;
    }

    public String getNmFeeType() {
        return nmFeeType;
    }

    public void setNmFeeType(String nmFeeType) {
        this.nmFeeType = nmFeeType;
    }

    public String getNmId() {
        return nmId;
    }

    public void setNmId(String nmId) {
        this.nmId = nmId;
    }

    public String getNmName() {
        return nmName;
    }

    public void setNmName(String nmName) {
        this.nmName = nmName;
    }

    public double getNmFee() {
        return nmFee;
    }

    public void setNmFee(double nmFee) {
        this.nmFee = nmFee;
    }

    public String getNmCode() {
        return nmCode;
    }

    public void setNmCode(String nmCode) {
        this.nmCode = nmCode;
    }
}
