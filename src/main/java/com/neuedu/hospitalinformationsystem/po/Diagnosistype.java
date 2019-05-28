package com.neuedu.hospitalinformationsystem.po;

public class Diagnosistype {
    private Integer diaTId;

    private Boolean diaType;

    public Integer getDiaTId() {
        return diaTId;
    }

    public void setDiaTId(Integer diaTId) {
        this.diaTId = diaTId;
    }

    public Boolean getDiaType() {
        return diaType;
    }

    public void setDiaType(Boolean diaType) {
        this.diaType = diaType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", diaTId=").append(diaTId);
        sb.append(", diaType=").append(diaType);
        sb.append("]");
        return sb.toString();
    }
}