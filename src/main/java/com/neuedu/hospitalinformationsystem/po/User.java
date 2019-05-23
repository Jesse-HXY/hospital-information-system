package com.neuedu.hospitalinformationsystem.po;

public class User {
    private int uId;
    private String uNickname;
    private String uPassword;
    private String uName;
    private int dId;
    private boolean isDoctor;
    private String uCategory;

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uNickname='" + uNickname + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uName='" + uName + '\'' +
                ", dId=" + dId +
                ", isDoctor=" + isDoctor +
                ", uCatagory='" + uCategory + '\'' +
                '}';
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public boolean isDoctor() {
        return isDoctor;
    }

    public void setDoctor(boolean doctor) {
        isDoctor = doctor;
    }

    public String getuCatagory() {
        return uCategory;
    }

    public void setuCatagory(String uCatagory) {
        this.uCategory = uCatagory;
    }
}
