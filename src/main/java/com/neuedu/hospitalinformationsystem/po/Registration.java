package com.neuedu.hospitalinformationsystem.po;

public class Registration {
    private int rId;
    private String rName;
    private boolean isDefault;
    private int rOrder;
    private double rFee;

    @Override
    public String toString() {
        return "Registration{" +
                "rId=" + rId +
                ", rName='" + rName + '\'' +
                ", isDefault=" + isDefault +
                ", rOrder=" + rOrder +
                ", rFee=" + rFee +
                '}';
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public int getrOrder() {
        return rOrder;
    }

    public void setrOrder(int rOrder) {
        this.rOrder = rOrder;
    }

    public double getrFee() {
        return rFee;
    }

    public void setrFee(double rFee) {
        this.rFee = rFee;
    }
}
