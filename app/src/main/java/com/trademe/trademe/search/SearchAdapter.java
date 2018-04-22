package com.trademe.trademe.search;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.trademe.trademe.R;
import com.trademe.trademe.data.model.SearchResultsModel;
import com.trademe.trademe.utils.Utils;

import java.util.List;

public class SearchAdapter extends RecyclerView
        .Adapter<SearchAdapter.MyViewHolder> {




    private Context context;
    private List<SearchResultsModel.List> searchList;;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title,tvPrice,tvRegion;
        public ImageView img;
        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            img =(ImageView)view.findViewById(R.id.img);
            tvPrice = view.findViewById(R.id.tvPrice);
            tvRegion =view.findViewById(R.id.tvRegion);
        }
    }


    public SearchAdapter(List<SearchResultsModel.List> searchList,Context context) {
        this.searchList = searchList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_search_results, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        SearchResultsModel.List result = searchList.get(position);
        holder.title.setText(result.getTitle());
        if(result.getPriceDisplay()!=null){
            holder.tvPrice.setText(result.getPriceDisplay());
        }
        if(result.getSuburb()!=null){
            holder.tvRegion.setText(result.getSuburb());
        }
        Utils.setImage(context,result.getPictureHref(),holder.img);

    }

    @Override
    public int getItemCount() {
        if(searchList!=null)
            return  searchList.size();
        else return 0;

    }

}
