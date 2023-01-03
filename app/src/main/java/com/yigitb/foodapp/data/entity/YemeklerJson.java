package com.yigitb.foodapp.data.entity;

import com.google.gson.annotations.SerializedName;

public class YemeklerJson {


    private int yemek_id;
    private String yemek_ad;
    private String yemek_resim_adi;
    private int yemek_fiyat;

    public YemeklerJson() {
    }

    public int getYemek_id() {
        return yemek_id;
    }

    public void setYemek_id(int yemek_id) {
        this.yemek_id = yemek_id;
    }

    public String getYemek_ad() {
        return yemek_ad;
    }

    public void setYemek_ad(String yemek_ad) {
        this.yemek_ad = yemek_ad;
    }

    public String getYemek_resim_adi() {
        return yemek_resim_adi;
    }

    public void setYemek_resim_adi(String yemek_resim_adi) {
        this.yemek_resim_adi = yemek_resim_adi;
    }

    public int getYemek_fiyat() {
        return yemek_fiyat;
    }

    public void setYemek_fiyat(int yemek_fiyat) {
        this.yemek_fiyat = yemek_fiyat;
    }

    public YemeklerJson(int yemek_id, String yemek_ad, String yemek_resim_adi, int yemek_fiyat) {
        this.yemek_id = yemek_id;
        this.yemek_ad = yemek_ad;
        this.yemek_resim_adi = yemek_resim_adi;
        this.yemek_fiyat = yemek_fiyat;
    }

    
}
