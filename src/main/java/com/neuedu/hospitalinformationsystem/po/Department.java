package com.neuedu.hospitalinformationsystem.po;

public class Department {
    private String dId;
    private String dName;
    private String dType;
    private String dCategory;

    @Override
    public String toString() {
        return "Department{" +
                "dId='" + dId + '\'' +
                ", dName='" + dName + '\'' +
                ", dType='" + dType + '\'' +
                ", dCategory='" + dCategory + '\'' +
                '}';
    }

    public String getdCategory() {
        return dCategory;
    }

    public void setdCategory(String dCategory) {
        this.dCategory = dCategory;
    }

    public String getdType() {
        return dType;
    }

    public void setdType(String dType) {
        this.dType = dType;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

}
