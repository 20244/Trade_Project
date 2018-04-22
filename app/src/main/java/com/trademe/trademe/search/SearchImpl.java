package com.trademe.trademe.search;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.trademe.trademe.TrademeApp;
import com.trademe.trademe.data.model.SearchResultsModel;
import com.trademe.trademe.network.NetworkApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchImpl  implements  SearchPresenter{


    NetworkApi networkApi;
    Context context;
    SearchView view;
    public SearchImpl(Context context,SearchView view){
        this.context=context;
        this.view = view;
        networkApi = ((TrademeApp)context.getApplicationContext()).getRetrofit().create(NetworkApi.class);
    }


    @Override
    public void getSearchResult(String query){

            networkApi.getSearch(query).enqueue(new Callback<SearchResultsModel>() {
                @Override
                public void onResponse(Call<SearchResultsModel> call, Response<SearchResultsModel> response) {
                    //
                    try {
                        view.setSearchResult(response.body());

                    }
                    catch (Exception e){
                        view.onError(e.getMessage());
                        e.printStackTrace();

                    }
                }

                @Override
                public void onFailure(Call<SearchResultsModel> call, Throwable t) {
                    System.out.println("error: "+t.getMessage());
                    view.onError("");
                }
            });



    }

}
