package com.neuedu.hospitalinformationsystem.po;

public class Disease {
    /*自动生成主键*/
    private Integer disId;
/*疾病完整编码*/
    private String disIcd;
/*疾病完整名称*/
    private String disName;
//拼音首拼
    private String disCode;
//疾病种类
    private String disType;


    public Integer getDisId() {
        return disId;
    }

    public void setDisId(Integer disId) {
        this.disId = disId;
    }

    public String getDisIcd() {
        return disIcd;
    }

    public void setDisIcd(String disIcd) {
        this.disIcd = disIcd;
    }

    public String getDisName() {
        return disName;
    }

    public void setDisName(String disName) {
        this.disName = disName;
    }

    public String getDisCode() {
        return disCode;
    }

    public void setDisCode(String disCode) {
        this.disCode = disCode;
    }

    public String getDisType() {
        return disType;
    }

    public void setDisType(String disType) {
        this.disType = disType;
    }
}