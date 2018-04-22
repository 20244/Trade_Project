package com.trademe.trademe;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TrademeApp extends Application {

    Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();
        createRetrofitConfig();
    }

    void createRetrofitConfig(){
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.tmsandbox.co.nz/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getRetrofit() {
        if(retrofit == null)
            createRetrofitConfig();
        return retrofit;
    }
}
