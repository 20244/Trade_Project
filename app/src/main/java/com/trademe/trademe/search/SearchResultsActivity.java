package com.trademe.trademe.search;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.trademe.trademe.listingdetails.ProductDetailsActivity;
import com.trademe.trademe.R;
import com.trademe.trademe.TrademeApp;
import com.trademe.trademe.data.model.SearchResultsModel;
import com.trademe.trademe.network.NetworkApi;
import com.trademe.trademe.utils.RecyclerItemClickListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchResultsActivity extends AppCompatActivity implements SearchView {


    private SearchResultsModel searchResultsModel;
    private RecyclerView recyclerView;
    private SearchAdapter adapter;
    SearchPresenter presenter;
    TextView tvEmpty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new SearchImpl(this,this);
        initView();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        handleIntent(getIntent());


    }

    void initView(){

        setTitle("TradeMe");
        tvEmpty = (TextView) findViewById(R.id.tvEmpty);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));


        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        Intent intent=new Intent(SearchResultsActivity.this,ProductDetailsActivity.class);
                        intent.putExtra("id",searchResultsModel.getList().get(position).getListingId()+"");
                        startActivity(intent);

                    }
                    @Override public void onLongItemClick(View view, int position) {
                        //
                    }
                })
        );

    }


    private void handleIntent(Intent intent) {

        try{
            if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
                String query = intent.getStringExtra(SearchManager.QUERY);
                setTitle(""+query);
                presenter.getSearchResult(query);
                //use the query to search
            }
            else if(intent!=null && intent.hasExtra("query")){
                setTitle(""+intent.getStringExtra("query"));
                presenter.getSearchResult(intent.getStringExtra("query"));
            }
        }
        catch (Exception e){
            Toast.makeText(SearchResultsActivity.this,"response"+e.getMessage(),Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void setSearchResult(SearchResultsModel searchResultsModel) {

        this.searchResultsModel = searchResultsModel;
        adapter=new SearchAdapter(searchResultsModel.getList(),SearchResultsActivity.this);
        recyclerView.setAdapter(adapter);
        if(searchResultsModel.getList().size()>0){
            tvEmpty.setVisibility(View.GONE);
        }
        else {
            tvEmpty.setText("No result found for search query");
        }

    }

    @Override
    public void onError(String str){
        tvEmpty.setText("No result found for search query");
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
}
