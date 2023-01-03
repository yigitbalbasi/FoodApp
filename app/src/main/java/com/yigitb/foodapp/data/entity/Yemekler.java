package com.yigitb.foodapp.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.yigitb.foodapp.R;

import java.io.Serializable;
import java.util.ArrayList;

public class Yemekler implements Serializable {
    @SerializedName("yemek_id")
    @Expose
    private int yemek_id;
    @SerializedName("yemek_ad")
    private String yemek_ad;
    @SerializedName("yemek_resim_adi")
    private String yemek_resim_adi;
    @SerializedName("yemek_fiyat")
    private int yemek_fiyat;


    public Yemekler() {
    }


    public Yemekler(int yemek_id, String yemek_ad, String yemek_resim_adi, int yemek_fiyat) {
        this.yemek_id = yemek_id;
        this.yemek_ad = yemek_ad;
        this.yemek_resim_adi = yemek_resim_adi;
        this.yemek_fiyat = yemek_fiyat;
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

    public String getResim_adi() {
        return yemek_resim_adi;
    }

    public void setResim_adi(String yemek_resim_adi) {
        this.yemek_resim_adi = yemek_resim_adi;
    }

    public int getYemek_fiyat() {
        return yemek_fiyat;
    }

    public void setYemek_fiyat(int yemek_fiyat) {
        this.yemek_fiyat = yemek_fiyat;
    }


    public static ArrayList<Yemekler> getData() {
        ArrayList<Yemekler> productList = new ArrayList<Yemekler>();
        //buraya api'den foto ve isimler gelecek
        int productImages[] = {R.drawable.sepete_ekle_resim, R.drawable.sepete_ekle_resim, R.drawable.sepete_ekle_resim, R.drawable.sepete_ekle_resim};
        String[] productNames = {"Geleceği Yazanlar", "Paycell", "Tv+", "Dergilik", "Bip", "GNC", "Hesabım", "Sim", "LifeBox", "Merhaba Umut", "Yaani", "Hayal Ortağım", "Goller Cepte", "Piri"};

        for (int i = 0; i < productImages.length; i++) {
            Yemekler temp = new Yemekler();
            temp.setYemek_ad(String.valueOf(productImages[i]));
            temp.setResim_adi(productNames[i]);
            temp.setYemek_fiyat(1);

            productList.add(temp);

        }


        return productList;


    }
}
