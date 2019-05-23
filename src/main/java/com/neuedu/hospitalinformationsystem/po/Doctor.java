package com.neuedu.hospitalinformationsystem.po;

public class Doctor {
    private int uId;
    private String dVocation;
    private String isDue;

    @Override
    public String toString() {
        return "Doctor{" +
                "uId=" + uId +
                ", dVocation='" + dVocation + '\'' +
                ", isDue='" + isDue + '\'' +
                '}';
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getdVocation() {
        return dVocation;
    }

    public void setdVocation(String dVocation) {
        this.dVocation = dVocation;
    }

    public String getIsDue() {
        return isDue;
    }

    public void setIsDue(String isDue) {
        this.isDue = isDue;
    }
}
