package com.neuedu.hospitalinformationsystem.po;

public class Disease {
    private String disId;
    private String disName;
    private String disCode;
    private String disSexLimitation;
    private String disCareLimitation;

    @Override
    public String toString() {
        return "Disease{" +
                "disId='" + disId + '\'' +
                ", disName='" + disName + '\'' +
                ", disSpell='" + disCode + '\'' +
                ", disSexLimitation='" + disSexLimitation + '\'' +
                ", disCareLimitation='" + disCareLimitation + '\'' +
                '}';
    }

    public String getDisId() {
        return disId;
    }

    public void setDisId(String disId) {
        this.disId = disId;
    }

    public String getDisName() {
        return disName;
    }

    public void setDisName(String disName) {
        this.disName = disName;
    }

    public String getDisSpell() {
        return disCode;
    }

    public void setDisSpell(String disSpell) {
        this.disCode = disSpell;
    }

    public String getDisSexLimitation() {
        return disSexLimitation;
    }

    public void setDisSexLimitation(String disSexLimitation) {
        this.disSexLimitation = disSexLimitation;
    }

    public String getDisCareLimitation() {
        return disCareLimitation;
    }

    public void setDisCareLimitation(String disCareLimitation) {
        this.disCareLimitation = disCareLimitation;
    }
}
