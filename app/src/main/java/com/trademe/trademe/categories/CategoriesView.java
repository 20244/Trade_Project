package com.trademe.trademe.categories;

import com.trademe.trademe.data.model.MainCategories;

import java.util.List;

public interface CategoriesView {

    void setCategories(List<MainCategories.Subcategory> mainCategories);
    void onError(String error);
}
