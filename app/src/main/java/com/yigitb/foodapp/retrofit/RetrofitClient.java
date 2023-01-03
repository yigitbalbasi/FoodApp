package com.yigitb.foodapp.retrofit;

import com.yigitb.foodapp.data.entity.Yemekler;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private Retrofit retrofit;
    private Yemekler yemekler;
    private Call<Yemekler> yemeklerCall;


    public static Retrofit getClient(String baseUrl) {
        return new Retrofit
                .Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(
                        GsonConverterFactory.create())
                .build();


    }


}
