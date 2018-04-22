package com.trademe.trademe.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.trademe.trademe.listingdetails.ProductDetailsActivity;
import com.trademe.trademe.R;

public class Utils {

    public static void setImage(Context context, String url, ImageView imageView){

        Glide.with(context).load(url)
                //.thumbnail(0.5f)
                //.crossFade()
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_loading)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);

    }
}
