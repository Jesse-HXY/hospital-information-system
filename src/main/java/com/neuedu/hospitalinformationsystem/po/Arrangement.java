package com.neuedu.hospitalinformationsystem.po;

import java.sql.Date;

public class Arrangement {
    private int aId;
    private Date aDate;
    private int dId;
    private int uId;
    private int rId;
    private boolean isValid;
    private String aCategory;
    private int aLimitation;
    private int aLeft;

    @Override
    public String toString() {
        return "Arrangement{" +
                "aId=" + aId +
                ", aDate=" + aDate +
                ", dId=" + dId +
                ", uId=" + uId +
                ", rId=" + rId +
                ", isValid=" + isValid +
                ", aCatagory='" + aCategory + '\'' +
                ", aLimitation=" + aLimitation +
                ", aLeft=" + aLeft +
                '}';
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public Date getaDate() {
        return aDate;
    }

    public void setaDate(Date aDate) {
        this.aDate = aDate;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public String getaCatagory() {
        return aCategory;
    }

    public void setaCatagory(String aCatagory) {
        this.aCategory = aCatagory;
    }

    public int getaLimitation() {
        return aLimitation;
    }

    public void setaLimitation(int aLimitation) {
        this.aLimitation = aLimitation;
    }

    public int getaLeft() {
        return aLeft;
    }

    public void setaLeft(int aLeft) {
        this.aLeft = aLeft;
    }
}
