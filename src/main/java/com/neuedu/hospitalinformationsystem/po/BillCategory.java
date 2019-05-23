package com.neuedu.hospitalinformationsystem.po;

public class BillCategory {

    private int dcId;
    private String bcName;

    @Override
    public String toString() {
        return "BillCategory{" +
                "dcId=" + dcId +
                ", bcName='" + bcName + '\'' +
                '}';
    }

    public int getDcId() {
        return dcId;
    }

    public void setDcId(int dcId) {
        this.dcId = dcId;
    }

    public String getBcName() {
        return bcName;
    }

    public void setBcName(String bcName) {
        this.bcName = bcName;
    }
}
