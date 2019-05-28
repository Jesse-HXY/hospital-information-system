package com.neuedu.hospitalinformationsystem.po;

import java.util.Date;

public class Account {
    private Integer accId;

    private String dId;

    private Integer uId;

    private Integer patientAmount;

    private Integer billAmount;

    private Double wMeFee;

    private Double cPMeFee;

    private Double cHMefee;

    private Double registerFee;

    private Double examFee;

    private Double checkFee;

    private Double testFee;

    private Double materialFee;

    private Double operationFee;

    private Double otherFee;

    private Date date;

    @Override
    public String toString() {
        return "Account{" +
                "accId=" + accId +
                ", dId='" + dId + '\'' +
                ", uId=" + uId +
                ", patientAmount=" + patientAmount +
                ", billAmount=" + billAmount +
                ", wMeFee=" + wMeFee +
                ", cPMeFee=" + cPMeFee +
                ", cHMefee=" + cHMefee +
                ", registerFee=" + registerFee +
                ", examFee=" + examFee +
                ", checkFee=" + checkFee +
                ", testFee=" + testFee +
                ", materialFee=" + materialFee +
                ", operationFee=" + operationFee +
                ", otherFee=" + otherFee +
                ", date=" + date +
                '}';
    }

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getPatientAmount() {
        return patientAmount;
    }

    public void setPatientAmount(Integer patientAmount) {
        this.patientAmount = patientAmount;
    }

    public Integer getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Integer billAmount) {
        this.billAmount = billAmount;
    }

    public Double getwMeFee() {
        return wMeFee;
    }

    public void setwMeFee(Double wMeFee) {
        this.wMeFee = wMeFee;
    }

    public Double getcPMeFee() {
        return cPMeFee;
    }

    public void setcPMeFee(Double cPMeFee) {
        this.cPMeFee = cPMeFee;
    }

    public Double getcHMefee() {
        return cHMefee;
    }

    public void setcHMefee(Double cHMefee) {
        this.cHMefee = cHMefee;
    }

    public Double getRegisterFee() {
        return registerFee;
    }

    public void setRegisterFee(Double registerFee) {
        this.registerFee = registerFee;
    }

    public Double getExamFee() {
        return examFee;
    }

    public void setExamFee(Double examFee) {
        this.examFee = examFee;
    }

    public Double getCheckFee() {
        return checkFee;
    }

    public void setCheckFee(Double checkFee) {
        this.checkFee = checkFee;
    }

    public Double getTestFee() {
        return testFee;
    }

    public void setTestFee(Double testFee) {
        this.testFee = testFee;
    }

    public Double getMaterialFee() {
        return materialFee;
    }

    public void setMaterialFee(Double materialFee) {
        this.materialFee = materialFee;
    }

    public Double getOperationFee() {
        return operationFee;
    }

    public void setOperationFee(Double operationFee) {
        this.operationFee = operationFee;
    }

    public Double getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(Double otherFee) {
        this.otherFee = otherFee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}