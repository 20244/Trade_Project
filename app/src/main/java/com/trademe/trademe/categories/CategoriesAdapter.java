package com.trademe.trademe.categories;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import android.support.v7.widget.RecyclerView;

import com.trademe.trademe.R;
import com.trademe.trademe.data.model.MainCategories;

import java.util.List;

public class CategoriesAdapter extends RecyclerView
        .Adapter<CategoriesAdapter.MyViewHolder> {




    private List<MainCategories.Subcategory> mainCategories;;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
        }
    }


    public CategoriesAdapter( List<MainCategories.Subcategory>   list) {
        this.mainCategories = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_categories, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MainCategories.Subcategory movie = mainCategories.get(position);
        holder.title.setText(movie.getName());

    }

    @Override
    public int getItemCount() {
        if(mainCategories == null)
            return 0;
        return mainCategories.size();
    }

}
