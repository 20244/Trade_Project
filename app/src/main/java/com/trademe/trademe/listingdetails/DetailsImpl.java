package com.trademe.trademe.listingdetails;

import android.content.Context;
import android.view.View;

import com.trademe.trademe.TrademeApp;
import com.trademe.trademe.data.model.ListingDetailsModel;
import com.trademe.trademe.data.model.SearchResultsModel;
import com.trademe.trademe.network.NetworkApi;
import com.trademe.trademe.utils.Utils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailsImpl  implements DetailsPresenter {


    NetworkApi networkApi;
    Context context;
    DetailsView view;
    public DetailsImpl(Context context,DetailsView view){
        this.context=context;
        this.view = view;
        networkApi = ((TrademeApp)context.getApplicationContext()).getRetrofit().create(NetworkApi.class);
    }


    @Override
    public void getDetails(String id){

            networkApi.getListing(id).enqueue(new Callback<ListingDetailsModel>() {
                @Override
                public void onResponse(Call<ListingDetailsModel> call, Response<ListingDetailsModel> response) {
                    //
                    try {
                        view.setDetails(response.body());

                    }
                    catch (Exception e){
                        e.printStackTrace();
                        view.onError("try again.");

                    }

                }

                @Override
                public void onFailure(Call<ListingDetailsModel> call, Throwable t) {
                    System.out.println("error: "+t.getMessage());
                    view.onError("try again.");
                }
            });



    }
}
