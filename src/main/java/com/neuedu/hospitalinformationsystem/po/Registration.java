package com.neuedu.hospitalinformationsystem.po;

public class Registration {
    private Integer rId;

    private Integer drId;

    private Integer eId;

    private String dId;

    private Integer mRId;

    private Integer rLId;

    private Integer pId;

    private Integer uId;

    private Integer rOrder;

    private Double rFee;

    private Boolean hasMedicalHistory;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getDrId() {
        return drId;
    }

    public void setDrId(Integer drId) {
        this.drId = drId;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    public Integer getmRId() {
        return mRId;
    }

    public void setmRId(Integer mRId) {
        this.mRId = mRId;
    }

    public Integer getrLId() {
        return rLId;
    }

    public void setrLId(Integer rLId) {
        this.rLId = rLId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getrOrder() {
        return rOrder;
    }

    public void setrOrder(Integer rOrder) {
        this.rOrder = rOrder;
    }

    public Double getrFee() {
        return rFee;
    }

    public void setrFee(Double rFee) {
        this.rFee = rFee;
    }

    public Boolean getHasMedicalHistory() {
        return hasMedicalHistory;
    }

    public void setHasMedicalHistory(Boolean hasMedicalHistory) {
        this.hasMedicalHistory = hasMedicalHistory;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rId=").append(rId);
        sb.append(", drId=").append(drId);
        sb.append(", eId=").append(eId);
        sb.append(", dId=").append(dId);
        sb.append(", mRId=").append(mRId);
        sb.append(", rLId=").append(rLId);
        sb.append(", pId=").append(pId);
        sb.append(", uId=").append(uId);
        sb.append(", rOrder=").append(rOrder);
        sb.append(", rFee=").append(rFee);
        sb.append(", hasMedicalHistory=").append(hasMedicalHistory);
        sb.append("]");
        return sb.toString();
    }
}