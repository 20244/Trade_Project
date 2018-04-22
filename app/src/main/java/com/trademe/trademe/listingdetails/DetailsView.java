package com.trademe.trademe.listingdetails;

import com.trademe.trademe.data.model.ListingDetailsModel;
import com.trademe.trademe.data.model.SearchResultsModel;

public interface DetailsView
{
    void setDetails(ListingDetailsModel searchResultsModel);
    void onError(String str);

}
