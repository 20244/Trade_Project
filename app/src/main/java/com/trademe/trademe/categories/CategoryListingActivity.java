package com.trademe.trademe.categories;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.trademe.trademe.R;

import com.trademe.trademe.search.SearchResultsActivity;
import com.trademe.trademe.data.model.MainCategories;
import com.trademe.trademe.utils.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class CategoryListingActivity extends AppCompatActivity implements CategoriesView {


    private List<MainCategories.Subcategory> mainCategories;
    private RecyclerView recyclerView;
    private SubCategoriesAdapter adapter;
    private String getTitle="",getNumber;
    private CategoriesPresenter presenter;
    TextView tvEmpty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        if(getIntent()!=null){
            getNumber = getIntent().getStringExtra("number");
            getTitle=getIntent().getStringExtra("title");
            System.out.println("number:"+getNumber);
        }

        setTitle(getTitle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initView();

        presenter= new CategoriesImps(this,this);
        presenter.fetchSubCategories(getNumber);


    }

    void initView(){

       //
        mainCategories=new ArrayList<>();
        tvEmpty = (TextView) findViewById(R.id.tvEmpty);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));


        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        Intent intent=new Intent(CategoryListingActivity.this,SearchResultsActivity.class);
                        intent.putExtra("query",mainCategories.get(position).getName());
                        startActivity(intent);
                    }
                    @Override public void onLongItemClick(View view, int position) {

                    }
                })
        );

    }



    @Override
    public void setCategories(List<MainCategories.Subcategory> mainCategories){

        this.mainCategories =mainCategories;
        adapter=new SubCategoriesAdapter(mainCategories);
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
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
