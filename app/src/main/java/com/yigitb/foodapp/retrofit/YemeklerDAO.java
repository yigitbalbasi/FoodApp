package com.yigitb.foodapp.retrofit;

import com.yigitb.foodapp.data.entity.YemekCevap;

import retrofit2.Call;
import retrofit2.http.GET;

public interface YemeklerDAO {

    @GET("yemekler/tumYemekleriGetir.php")
    Call<YemekCevap> yemekleriYukle();


}
