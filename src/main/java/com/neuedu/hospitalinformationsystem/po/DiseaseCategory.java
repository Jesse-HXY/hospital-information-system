package com.neuedu.hospitalinformationsystem.po;

public class DiseaseCategory {
    private String dcId;
    private String dcName;

    @Override
    public String toString() {
        return "DiseaseCatagory{" +
                "dcId='" + dcId + '\'' +
                ", dcName='" + dcName + '\'' +
                '}';
    }

    public String getDcId() {
        return dcId;
    }

    public void setDcId(String dcId) {
        this.dcId = dcId;
    }

    public String getDcName() {
        return dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName;
    }
}
