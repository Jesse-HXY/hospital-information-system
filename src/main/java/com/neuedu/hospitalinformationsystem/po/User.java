package com.neuedu.hospitalinformationsystem.po;

public class User {
    private Integer uId;

    private String uNickName;

    private String uPassword;

    private String uName;

    private Boolean isDoctor;

    private String uCategory;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuNickName() {
        return uNickName;
    }

    public void setuNickName(String uNickName) {
        this.uNickName = uNickName;
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

    public Boolean getIsDoctor() {
        return isDoctor;
    }

    public void setIsDoctor(Boolean isDoctor) {
        this.isDoctor = isDoctor;
    }

    public String getuCategory() {
        return uCategory;
    }

    public void setuCategory(String uCategory) {
        this.uCategory = uCategory;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uId=").append(uId);
        sb.append(", uNickName=").append(uNickName);
        sb.append(", uPassword=").append(uPassword);
        sb.append(", uName=").append(uName);
        sb.append(", isDoctor=").append(isDoctor);
        sb.append(", uCategory=").append(uCategory);
        sb.append("]");
        return sb.toString();
    }
}