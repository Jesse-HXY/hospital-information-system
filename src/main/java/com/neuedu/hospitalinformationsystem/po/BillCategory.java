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

    public Integer getBcid() {
        return bcId;
    }

    public void setBcid(Integer bcid) {
        this.bcId = bcId;
    }

    public String getBcname() {
        return bcName;
    }

    public void setBcname(String bcname) {
        this.bcName = bcName;
    }
}