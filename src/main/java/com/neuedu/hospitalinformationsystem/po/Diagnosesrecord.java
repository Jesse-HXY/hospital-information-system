package com.neuedu.hospitalinformationsystem.po;

public class Diagnosesrecord {
    private Integer drId;

    private String dS;

    private String dO;

    private String dA;

    private String dP;

    public Integer getDrId() {
        return drId;
    }

    public void setDrId(Integer drId) {
        this.drId = drId;
    }

    public String getdS() {
        return dS;
    }

    public void setdS(String dS) {
        this.dS = dS;
    }

    public String getdO() {
        return dO;
    }

    public void setdO(String dO) {
        this.dO = dO;
    }

    public String getdA() {
        return dA;
    }

    public void setdA(String dA) {
        this.dA = dA;
    }

    public String getdP() {
        return dP;
    }

    public void setdP(String dP) {
        this.dP = dP;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", drId=").append(drId);
        sb.append(", dS=").append(dS);
        sb.append(", dO=").append(dO);
        sb.append(", dA=").append(dA);
        sb.append(", dP=").append(dP);
        sb.append("]");
        return sb.toString();
    }
}