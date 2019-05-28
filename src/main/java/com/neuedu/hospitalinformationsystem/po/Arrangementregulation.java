package com.neuedu.hospitalinformationsystem.po;

public class Arrangementregulation {
    private String arId;

    private String dId;

    private Integer arName;

    private Integer arPlan;

    public String getArId() {
        return arId;
    }

    public void setArId(String arId) {
        this.arId = arId;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    public Integer getArName() {
        return arName;
    }

    public void setArName(Integer arName) {
        this.arName = arName;
    }

    public Integer getArPlan() {
        return arPlan;
    }

    public void setArPlan(Integer arPlan) {
        this.arPlan = arPlan;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", arId=").append(arId);
        sb.append(", dId=").append(dId);
        sb.append(", arName=").append(arName);
        sb.append(", arPlan=").append(arPlan);
        sb.append("]");
        return sb.toString();
    }
}