package com.neuedu.hospitalinformationsystem.po;

public class Department {
    private String dId;
    private String dName;
    private int dCategory;//1代表 临床科室, 0代表 医技科室

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

    public int isdCatagory() {
        return dCategory;
    }

    public void setdCatagory(int dCatagory) {
        this.dCategory = dCatagory;
    }
}
