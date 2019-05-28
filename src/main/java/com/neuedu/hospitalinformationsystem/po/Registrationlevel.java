package com.neuedu.hospitalinformationsystem.po;

public class Registrationlevel {
    private Integer rLId;

    private String rLName;

    private Integer rLLimitation;

    private Double rLFee;

    public Integer getrLId() {
        return rLId;
    }

    public void setrLId(Integer rLId) {
        this.rLId = rLId;
    }

    public String getrLName() {
        return rLName;
    }

    public void setrLName(String rLName) {
        this.rLName = rLName;
    }

    public Integer getrLLimitation() {
        return rLLimitation;
    }

    public void setrLLimitation(Integer rLLimitation) {
        this.rLLimitation = rLLimitation;
    }

    public Double getrLFee() {
        return rLFee;
    }

    public void setrLFee(Double rLFee) {
        this.rLFee = rLFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rLId=").append(rLId);
        sb.append(", rLName=").append(rLName);
        sb.append(", rLLimitation=").append(rLLimitation);
        sb.append(", rLFee=").append(rLFee);
        sb.append("]");
        return sb.toString();
    }
}