package com.trademe.trademe.listingdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.trademe.trademe.R;
import com.trademe.trademe.TrademeApp;
import com.trademe.trademe.data.model.ListingDetailsModel;
import com.trademe.trademe.network.NetworkApi;
import com.trademe.trademe.utils.Utils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductDetailsActivity extends AppCompatActivity implements DetailsView{



    private ListingDetailsModel listingDetailsModel;
    ImageView imgLarge;
    TextView tvStartPrice,tvBuyNow,tvDescription,tvpayoptn,tvsuburb,tvTitle;
    LinearLayout llPayment,llPrice,llBuyNow;
    DetailsPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        initView();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if(getIntent()!=null && getIntent().hasExtra("id")){
            presenter.getDetails(getIntent().getStringExtra("id"));
        }
        else {
            Toast.makeText(this,"no id found",Toast.LENGTH_LONG).show();

        }



    }

    void initView(){
        tvStartPrice = findViewById(R.id.tvstartprice);
        tvBuyNow= findViewById(R.id.tvbuynow);
        tvDescription = findViewById(R.id.tvDescription);
        tvpayoptn = findViewById(R.id.tvpayopt);
        tvTitle = findViewById(R.id.tvTitle);
        tvsuburb = findViewById(R.id.tvsuburb);
        imgLarge=findViewById(R.id.imgLarge);

        llPayment= findViewById(R.id.llPayment);
        llPrice =findViewById(R.id.llPrice);
        llBuyNow=findViewById(R.id.llBuy);

        presenter =new DetailsImpl(this,this);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void setDetails(ListingDetailsModel listingDetailsModel){
        this.listingDetailsModel = listingDetailsModel;
        if(listingDetailsModel!=null){

            tvStartPrice.setText(listingDetailsModel.getStartPrice()+"");
            tvDescription.setText(listingDetailsModel.getBody());
            tvBuyNow.setText(listingDetailsModel.getBuyNowPrice()+"");
            tvpayoptn.setText(listingDetailsModel.getPaymentOptions());
            tvTitle.setText(listingDetailsModel.getTitle());
            tvsuburb.setText(listingDetailsModel.getSuburb());
            if(listingDetailsModel.getBuyNowPrice() == null || listingDetailsModel.getBuyNowPrice() ==0)
            {
                llBuyNow.setVisibility(View.GONE);
                llPayment.setVisibility(View.GONE);
                llPrice.setVisibility(View.GONE);
            }

            Utils.setImage(ProductDetailsActivity.this,listingDetailsModel.getPhotos().get(0).getValue().getLarge()
                    ,imgLarge);
        }

    }

    @Override
    public void onError(String str) {

    }
}
