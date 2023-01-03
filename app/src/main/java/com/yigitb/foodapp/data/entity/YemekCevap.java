package com.yigitb.foodapp.data.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class YemekCevap {
    @SerializedName("kisiler")
    private List<Yemekler> yemekler;
    @SerializedName("success")
    private int success;

    public YemekCevap() {
    }

    public YemekCevap(List<Yemekler> yemekler, int success) {
        this.yemekler = yemekler;
        this.success = success;
    }

    public List<Yemekler> getYemekler() {
        return yemekler;
    }

    public void setYemekler(List<Yemekler> yemekler) {
        this.yemekler = yemekler;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }
}
