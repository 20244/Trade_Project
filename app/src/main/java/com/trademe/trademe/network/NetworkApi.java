package com.trademe.trademe.network;

import android.util.Base64;

import com.trademe.trademe.data.model.ListingDetailsModel;
import com.trademe.trademe.data.model.MainCategories;
import com.trademe.trademe.data.model.SearchResultsModel;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NetworkApi {


//    default loading categories

    @GET("Categories/0.json?depth=1&region=1&with_counts=false")
    Call<ResponseBody> getMainCategory();

    @GET("Categories/{id}.json?depth=1&region=1&with_counts=true")
    Call<ResponseBody> getSubCategories(@Path("id") String id);


//    search result
    @Headers("Authorization:OAuth oauth_consumer_key=\"A1AC63F0332A131A78FAC304D007E7D1\", oauth_signature_method=\"PLAINTEXT\", oauth_signature=\"EC7F18B17A062962C6930A8AE88B16C7&\"")
     @GET("Search/General.json?buy=All&clearance=All&condition=All&expired=false&listed_as=Auctions&page=1&pay=All&photo_size=Thumbnail&return_did_you_mean=false&return_metadata=false&rows=20&shipping_method=All&sort_order=Default")
    Call<SearchResultsModel> getSearch(@Query("search_string") String searchString);


//    listing details
    @Headers("Authorization:OAuth oauth_consumer_key=\"A1AC63F0332A131A78FAC304D007E7D1\", oauth_signature_method=\"PLAINTEXT\", oauth_signature=\"EC7F18B17A062962C6930A8AE88B16C7&\"")
    @GET("Listings/{id}.json")
    Call<ListingDetailsModel> getListing(@Path("id") String id);



}
