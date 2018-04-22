package com.trademe.trademe.categories;

import android.content.Context;
import android.view.View;

import com.trademe.trademe.TrademeApp;
import com.trademe.trademe.data.model.MainCategories;
import com.trademe.trademe.network.NetworkApi;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoriesImps  implements CategoriesPresenter{

    Context mContext;
    CategoriesView view;
    NetworkApi networkApi;
    private List<MainCategories.Subcategory> mainCategories=new ArrayList<>();
    public CategoriesImps(Context context,CategoriesView view){
        this.mContext=context;
        this.view=view;
        networkApi = ((TrademeApp)mContext.getApplicationContext()).getRetrofit().create(NetworkApi.class);
    }

    @Override
    public void fetchCategories(){

            networkApi.getMainCategory().enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    //
                    try {
                        JSONObject jsonResponse = new JSONObject(response.body().string());
                        JSONArray jsonArray=jsonResponse.getJSONArray("Subcategories");
                        MainCategories.Subcategory subcategory;
                        for(int i=0;i<jsonArray.length();i++){
                            subcategory = new MainCategories.Subcategory();
                            subcategory.setName(jsonArray.getJSONObject(i).getString("Name"));
                            subcategory.setNumber(jsonArray.getJSONObject(i).getString("Number"));
                            mainCategories.add(subcategory);
                        }

                        view.setCategories(mainCategories);
                    }
                    catch (Exception e){
                        view.onError("");
                        e.printStackTrace();
                    }

                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {
                    System.out.println("error: "+t.getMessage());
                    view.onError("");
                }
            });



    }

    @Override
    public void fetchSubCategories(String getNumber){

        networkApi.getSubCategories(getNumber).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                //System.out.println("response: "+response.body());
                try {
                    JSONObject jsonResponse = new JSONObject(response.body().string());
                    JSONArray jsonArray=jsonResponse.getJSONArray("Subcategories");
                    MainCategories.Subcategory subcategory;
                    for(int i=0;i<jsonArray.length();i++){
                        subcategory = new MainCategories.Subcategory();
                        subcategory.setName(jsonArray.getJSONObject(i).getString("Name"));
                        subcategory.setNumber(jsonArray.getJSONObject(i).getString("Number"));
                        mainCategories.add(subcategory);
                    }
                    view.setCategories(mainCategories);


                }
                catch (Exception e){
                    e.printStackTrace();
                    view.onError("");
                }

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                System.out.println("error: "+t.getMessage());
                view.onError("");
            }
        });

    }



}
