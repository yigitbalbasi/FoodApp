package com.yigitb.foodapp.retrofit;

import com.yigitb.foodapp.data.entity.Yemekler;

public class ApiUtils {
    public static final String BASE_URL = "http://kasimadalan.pe.hu/";

    public static YemeklerDAO getYemeklerDao() {
        return RetrofitClient.getClient(BASE_URL).create(YemeklerDAO.class);


    }
}
