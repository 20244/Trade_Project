package com.trademe.trademe.search;

import com.trademe.trademe.data.model.SearchResultsModel;

public interface SearchView
{
    void setSearchResult(SearchResultsModel searchResultsModel);
    void onError(String str);

}
