package com.neuedu.hospitalinformationsystem.po;

public class Diagnosis {
    private Integer diaId;

    private Integer diaTId;

    private Integer rId;

    private Integer uId;

    private String diaName;

    public Integer getDiaId() {
        return diaId;
    }

    public void setDiaId(Integer diaId) {
        this.diaId = diaId;
    }

    public Integer getDiaTId() {
        return diaTId;
    }

    public void setDiaTId(Integer diaTId) {
        this.diaTId = diaTId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getDiaName() {
        return diaName;
    }

    public void setDiaName(String diaName) {
        this.diaName = diaName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", diaId=").append(diaId);
        sb.append(", diaTId=").append(diaTId);
        sb.append(", rId=").append(rId);
        sb.append(", uId=").append(uId);
        sb.append(", diaName=").append(diaName);
        sb.append("]");
        return sb.toString();
    }
}