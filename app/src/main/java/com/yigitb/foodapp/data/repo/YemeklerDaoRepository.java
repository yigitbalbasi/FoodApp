package com.yigitb.foodapp.data.repo;

import androidx.lifecycle.MutableLiveData;

import com.yigitb.foodapp.data.entity.YemekCevap;
import com.yigitb.foodapp.data.entity.Yemekler;
import com.yigitb.foodapp.retrofit.YemeklerDAO;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class YemeklerDaoRepository {
    private MutableLiveData<List<Yemekler>> yemeklerListesi;
    private YemeklerDAO ydao;

    public YemeklerDaoRepository(YemeklerDAO ydao) {
        this.ydao = ydao;
        yemeklerListesi = new MutableLiveData();
    }

    public void yemekleriYuke() {
        ydao.yemekleriYukle().enqueue(new Callback<YemekCevap>() {
            @Override
            public void onResponse(Call<YemekCevap> call, Response<YemekCevap> response) {
                List<Yemekler> liste = response.body().getYemekler();
                yemeklerListesi.setValue(liste);

            }

            @Override
            public void onFailure(Call<YemekCevap> call, Throwable t) {

            }
        });
    }
}
