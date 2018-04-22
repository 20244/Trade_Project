package com.trademe.trademe.data.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SearchResultsModel {

    @SerializedName("TotalCount")
    @Expose
    private Integer totalCount;
    @SerializedName("Page")
    @Expose
    private Integer page;
    @SerializedName("PageSize")
    @Expose
    private Integer pageSize;
    @SerializedName("List")
    @Expose
    private java.util.List<List> list = null;
    @SerializedName("DidYouMean")
    @Expose
    private String didYouMean;
    @SerializedName("FoundCategories")
    @Expose
    private java.util.List<FoundCategory> foundCategories = null;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public java.util.List<List> getList() {
        return list;
    }

    public void setList(java.util.List<List> list) {
        this.list = list;
    }

    public String getDidYouMean() {
        return didYouMean;
    }

    public void setDidYouMean(String didYouMean) {
        this.didYouMean = didYouMean;
    }

    public java.util.List<FoundCategory> getFoundCategories() {
        return foundCategories;
    }

    public void setFoundCategories(java.util.List<FoundCategory> foundCategories) {
        this.foundCategories = foundCategories;
    }


    public class AdditionalData {

        @SerializedName("BulletPoints")
        @Expose
        private java.util.List<Object> bulletPoints = null;
        @SerializedName("Tags")
        @Expose
        private java.util.List<Object> tags = null;

        public java.util.List<Object> getBulletPoints() {
            return bulletPoints;
        }

        public void setBulletPoints(java.util.List<Object> bulletPoints) {
            this.bulletPoints = bulletPoints;
        }

        public java.util.List<Object> getTags() {
            return tags;
        }

        public void setTags(java.util.List<Object> tags) {
            this.tags = tags;
        }

    }

    public class FoundCategory {

        @SerializedName("Count")
        @Expose
        private Integer count;
        @SerializedName("Category")
        @Expose
        private String category;
        @SerializedName("Name")
        @Expose
        private String name;
        @SerializedName("CategoryId")
        @Expose
        private Integer categoryId;

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
        }

    }


    public class List {

        @SerializedName("ListingId")
        @Expose
        private Integer listingId;
        @SerializedName("Title")
        @Expose
        private String title;
        @SerializedName("Category")
        @Expose
        private String category;
        @SerializedName("StartPrice")
        @Expose
        private Double startPrice;
        @SerializedName("BuyNowPrice")
        @Expose
        private Double buyNowPrice;
        @SerializedName("StartDate")
        @Expose
        private String startDate;
        @SerializedName("EndDate")
        @Expose
        private String endDate;
        @SerializedName("ListingLength")
        @Expose
        private Object listingLength;
        @SerializedName("HasGallery")
        @Expose
        private Boolean hasGallery;
        @SerializedName("AsAt")
        @Expose
        private String asAt;
        @SerializedName("CategoryPath")
        @Expose
        private String categoryPath;
        @SerializedName("PictureHref")
        @Expose
        private String pictureHref;
        @SerializedName("HasPayNow")
        @Expose
        private Boolean hasPayNow;
        @SerializedName("Region")
        @Expose
        private String region;
        @SerializedName("Suburb")
        @Expose
        private String suburb;
        @SerializedName("HasReserve")
        @Expose
        private Boolean hasReserve;
        @SerializedName("HasBuyNow")
        @Expose
        private Boolean hasBuyNow;
        @SerializedName("NoteDate")
        @Expose
        private String noteDate;
        @SerializedName("ReserveState")
        @Expose
        private Integer reserveState;
        @SerializedName("PriceDisplay")
        @Expose
        private String priceDisplay;
        @SerializedName("HasFreeShipping")
        @Expose
        private Boolean hasFreeShipping;
        @SerializedName("PromotionId")
        @Expose
        private Integer promotionId;
        @SerializedName("AdditionalData")
        @Expose
        private AdditionalData additionalData;
        @SerializedName("MemberId")
        @Expose
        private Integer memberId;
        @SerializedName("IsNew")
        @Expose
        private Boolean isNew;
        @SerializedName("Subtitle")
        @Expose
        private String subtitle;

        public Integer getListingId() {
            return listingId;
        }

        public void setListingId(Integer listingId) {
            this.listingId = listingId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public Double getStartPrice() {
            return startPrice;
        }

        public void setStartPrice(Double startPrice) {
            this.startPrice = startPrice;
        }

        public Double getBuyNowPrice() {
            return buyNowPrice;
        }

        public void setBuyNowPrice(Double buyNowPrice) {
            this.buyNowPrice = buyNowPrice;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public Object getListingLength() {
            return listingLength;
        }

        public void setListingLength(Object listingLength) {
            this.listingLength = listingLength;
        }

        public Boolean getHasGallery() {
            return hasGallery;
        }

        public void setHasGallery(Boolean hasGallery) {
            this.hasGallery = hasGallery;
        }

        public String getAsAt() {
            return asAt;
        }

        public void setAsAt(String asAt) {
            this.asAt = asAt;
        }

        public String getCategoryPath() {
            return categoryPath;
        }

        public void setCategoryPath(String categoryPath) {
            this.categoryPath = categoryPath;
        }

        public String getPictureHref() {
            return pictureHref;
        }

        public void setPictureHref(String pictureHref) {
            this.pictureHref = pictureHref;
        }

        public Boolean getHasPayNow() {
            return hasPayNow;
        }

        public void setHasPayNow(Boolean hasPayNow) {
            this.hasPayNow = hasPayNow;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getSuburb() {
            return suburb;
        }

        public void setSuburb(String suburb) {
            this.suburb = suburb;
        }

        public Boolean getHasReserve() {
            return hasReserve;
        }

        public void setHasReserve(Boolean hasReserve) {
            this.hasReserve = hasReserve;
        }

        public Boolean getHasBuyNow() {
            return hasBuyNow;
        }

        public void setHasBuyNow(Boolean hasBuyNow) {
            this.hasBuyNow = hasBuyNow;
        }

        public String getNoteDate() {
            return noteDate;
        }

        public void setNoteDate(String noteDate) {
            this.noteDate = noteDate;
        }

        public Integer getReserveState() {
            return reserveState;
        }

        public void setReserveState(Integer reserveState) {
            this.reserveState = reserveState;
        }

        public String getPriceDisplay() {
            return priceDisplay;
        }

        public void setPriceDisplay(String priceDisplay) {
            this.priceDisplay = priceDisplay;
        }

        public Boolean getHasFreeShipping() {
            return hasFreeShipping;
        }

        public void setHasFreeShipping(Boolean hasFreeShipping) {
            this.hasFreeShipping = hasFreeShipping;
        }

        public Integer getPromotionId() {
            return promotionId;
        }

        public void setPromotionId(Integer promotionId) {
            this.promotionId = promotionId;
        }

        public AdditionalData getAdditionalData() {
            return additionalData;
        }

        public void setAdditionalData(AdditionalData additionalData) {
            this.additionalData = additionalData;
        }

        public Integer getMemberId() {
            return memberId;
        }

        public void setMemberId(Integer memberId) {
            this.memberId = memberId;
        }

        public Boolean getIsNew() {
            return isNew;
        }

        public void setIsNew(Boolean isNew) {
            this.isNew = isNew;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

    }

}


