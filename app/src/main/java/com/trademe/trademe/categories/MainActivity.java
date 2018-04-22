package com.trademe.trademe.categories;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.trademe.trademe.R;
import com.trademe.trademe.data.model.MainCategories;
import com.trademe.trademe.utils.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CategoriesView {

    private List<MainCategories.Subcategory> mainCategories=new ArrayList<>();
    private RecyclerView recyclerView;
    private CategoriesAdapter adapter;
    TextView tvEmpty;
    private CategoriesPresenter categoriesPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        categoriesPresenter = new CategoriesImps(this,this);
        categoriesPresenter.fetchCategories();
    }



    void initView(){

        setTitle("TradeMe");


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        tvEmpty = (TextView)findViewById(R.id.tvEmpty);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));


        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // do whatever
                        goToNextScreen(position);
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );

    }


    void goToNextScreen(int position){


        Intent intent =new Intent(this, CategoryListingActivity.class);
        intent.putExtra("title",mainCategories.get(position).getName());
        intent.putExtra("number",mainCategories.get(position).getNumber());
        startActivity(intent);


    }



    @Override
    public void setCategories(List<MainCategories.Subcategory> mainCategories){

            this.mainCategories = mainCategories;
        adapter=new CategoriesAdapter(mainCategories);
            recyclerView.setAdapter(adapter);
            if(mainCategories.size()>0){
                tvEmpty.setVisibility(View.GONE);
            }
            else {
                tvEmpty.setText("No result found");
            }

    }


    @Override
    public void onError(String error){
        tvEmpty.setText("No result found");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        // Inflate menu to add items to action bar if it is present.
        inflater.inflate(R.menu.menu_main, menu);
        // Associate searchable configuration with the SearchView
        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.menu_search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));

        return true;
    }
}
