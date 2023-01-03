package com.yigitb.foodapp.di;

import com.yigitb.foodapp.data.repo.YemeklerDaoRepository;
import com.yigitb.foodapp.retrofit.ApiUtils;
import com.yigitb.foodapp.retrofit.YemeklerDAO;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {
    @Provides
    @Singleton
    public YemeklerDaoRepository provideYemeklerDaoRepository(YemeklerDAO ydao) {
        return new YemeklerDaoRepository(ydao);
    }

    @Provides
    @Singleton
    public YemeklerDAO provideYemeklerDao() {
        return ApiUtils.getYemeklerDao();
    }

}
