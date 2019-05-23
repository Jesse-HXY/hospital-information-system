package com.neuedu.hospitalinformationsystem.po;

public class NonMedicine {
    private Integer nmId;

    private String nmName;

    private Double nmFee;

    private String nmStandard;

    private String nmFeeType;

    private String nmCode;

    public Integer getNmId() {
        return nmId;
    }

    public void setNmId(Integer nmId) {
        this.nmId = nmId;
    }

    public String getNmName() {
        return nmName;
    }

    public void setNmName(String nmName) {
        this.nmName = nmName;
    }

    public Double getNmFee() {
        return nmFee;
    }

    public void setNmFee(Double nmFee) {
        this.nmFee = nmFee;
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

    public String getNmCode() {
        return nmCode;
    }

    public void setNmCode(String nmCode) {
        this.nmCode = nmCode;
    }
}