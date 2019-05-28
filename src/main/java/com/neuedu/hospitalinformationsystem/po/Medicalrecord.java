package com.neuedu.hospitalinformationsystem.po;

public class Medicalrecord {
    private Integer mRId;

    private Integer pId;

    private String mChiefComplaint;

    private String mHistoryOfPresentIllness;

    private String mSituation;

    private String mHistoryOfPastIllness;

    private String mAllergy;

    private String mPhysicalExamination;

    private String mSuggestion;

    private String mMention;

    public Integer getmRId() {
        return mRId;
    }

    public void setmRId(Integer mRId) {
        this.mRId = mRId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getmChiefComplaint() {
        return mChiefComplaint;
    }

    public void setmChiefComplaint(String mChiefComplaint) {
        this.mChiefComplaint = mChiefComplaint;
    }

    public String getmHistoryOfPresentIllness() {
        return mHistoryOfPresentIllness;
    }

    public void setmHistoryOfPresentIllness(String mHistoryOfPresentIllness) {
        this.mHistoryOfPresentIllness = mHistoryOfPresentIllness;
    }

    public String getmSituation() {
        return mSituation;
    }

    public void setmSituation(String mSituation) {
        this.mSituation = mSituation;
    }

    public String getmHistoryOfPastIllness() {
        return mHistoryOfPastIllness;
    }

    public void setmHistoryOfPastIllness(String mHistoryOfPastIllness) {
        this.mHistoryOfPastIllness = mHistoryOfPastIllness;
    }

    public String getmAllergy() {
        return mAllergy;
    }

    public void setmAllergy(String mAllergy) {
        this.mAllergy = mAllergy;
    }

    public String getmPhysicalExamination() {
        return mPhysicalExamination;
    }

    public void setmPhysicalExamination(String mPhysicalExamination) {
        this.mPhysicalExamination = mPhysicalExamination;
    }

    public String getmSuggestion() {
        return mSuggestion;
    }

    public void setmSuggestion(String mSuggestion) {
        this.mSuggestion = mSuggestion;
    }

    public String getmMention() {
        return mMention;
    }

    public void setmMention(String mMention) {
        this.mMention = mMention;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mRId=").append(mRId);
        sb.append(", pId=").append(pId);
        sb.append(", mChiefComplaint=").append(mChiefComplaint);
        sb.append(", mHistoryOfPresentIllness=").append(mHistoryOfPresentIllness);
        sb.append(", mSituation=").append(mSituation);
        sb.append(", mHistoryOfPastIllness=").append(mHistoryOfPastIllness);
        sb.append(", mAllergy=").append(mAllergy);
        sb.append(", mPhysicalExamination=").append(mPhysicalExamination);
        sb.append(", mSuggestion=").append(mSuggestion);
        sb.append(", mMention=").append(mMention);
        sb.append("]");
        return sb.toString();
    }
}