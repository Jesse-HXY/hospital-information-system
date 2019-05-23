package com.neuedu.hospitalinformationsystem.po;

public class Department {
    private String dId;
    private String dName;
    private boolean dCategory;//true代表 临床科室, false代表 医技科室

    @Override
    public String toString() {
        return "Department{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                ", dCatagory=" + dCategory +
                '}';
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

    public boolean isdCatagory() {
        return dCategory;
    }

    public void setdCatagory(boolean dCatagory) {
        this.dCategory = dCatagory;
    }
}
