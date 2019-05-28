package com.neuedu.hospitalinformationsystem.po;

public class Medicine {
    private String mId;

    private String mName;

    private String mSpell;

    private String mSepcification;

    private String mUnit;

    private String mProducer;

    private String mType;

    private Double mFee;

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmSpell() {
        return mSpell;
    }

    public void setmSpell(String mSpell) {
        this.mSpell = mSpell;
    }

    public String getmSepcification() {
        return mSepcification;
    }

    public void setmSepcification(String mSepcification) {
        this.mSepcification = mSepcification;
    }

    public String getmUnit() {
        return mUnit;
    }

    public void setmUnit(String mUnit) {
        this.mUnit = mUnit;
    }

    public String getmProducer() {
        return mProducer;
    }

    public void setmProducer(String mProducer) {
        this.mProducer = mProducer;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public Double getmFee() {
        return mFee;
    }

    public void setmFee(Double mFee) {
        this.mFee = mFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mId=").append(mId);
        sb.append(", mName=").append(mName);
        sb.append(", mSpell=").append(mSpell);
        sb.append(", mSepcification=").append(mSepcification);
        sb.append(", mUnit=").append(mUnit);
        sb.append(", mProducer=").append(mProducer);
        sb.append(", mType=").append(mType);
        sb.append(", mFee=").append(mFee);
        sb.append("]");
        return sb.toString();
    }
}