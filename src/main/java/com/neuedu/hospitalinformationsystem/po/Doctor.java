package com.neuedu.hospitalinformationsystem.po;

public class Doctor {
    private Integer uId;

    private String dVacation;

    private Boolean isDue;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getdVacation() {
        return dVacation;
    }

    public void setdVacation(String dVacation) {
        this.dVacation = dVacation;
    }

    public Boolean getIsDue() {
        return isDue;
    }

    public void setIsDue(Boolean isDue) {
        this.isDue = isDue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uId=").append(uId);
        sb.append(", dVacation=").append(dVacation);
        sb.append(", isDue=").append(isDue);
        sb.append("]");
        return sb.toString();
    }
}