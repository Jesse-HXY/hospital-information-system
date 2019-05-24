package com.neuedu.hospitalinformationsystem.po;

public class BillCategory {

    private Integer bcId;

    private String bcName;

    @Override
    public String toString() {
        return "BillCategory{" +
                "bcid=" + bcId +
                ", bcname='" + bcName + '\'' +
                '}';
    }

    public Integer getBcId() {
        return bcId;
    }

    public void setBcId(Integer bcId) {
        this.bcId = bcId;
    }

    public String getBcName() {
        return bcName;
    }

    public void setBcName(String bcName) {
        this.bcName = bcName;
    }
}