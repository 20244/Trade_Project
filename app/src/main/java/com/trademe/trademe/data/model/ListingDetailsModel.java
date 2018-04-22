package com.trademe.trademe.data.model;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;




public class ListingDetailsModel {

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
    @SerializedName("PhotoId")
    @Expose
    private Integer photoId;
    @SerializedName("HasPayNow")
    @Expose
    private Boolean hasPayNow;
    @SerializedName("RegionId")
    @Expose
    private Integer regionId;
    @SerializedName("Region")
    @Expose
    private String region;
    @SerializedName("SuburbId")
    @Expose
    private Integer suburbId;
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
    @SerializedName("CategoryName")
    @Expose
    private String categoryName;
    @SerializedName("ReserveState")
    @Expose
    private Integer reserveState;
    @SerializedName("Attributes")
    @Expose
    private List<Object> attributes = null;
    @SerializedName("OpenHomes")
    @Expose
    private List<Object> openHomes = null;
    @SerializedName("MinimumNextBidAmount")
    @Expose
    private Double minimumNextBidAmount;
    @SerializedName("PriceDisplay")
    @Expose
    private String priceDisplay;
    @SerializedName("AdditionalData")
    @Expose
    private AdditionalData additionalData;
    @SerializedName("Member")
    @Expose
    private Member member;
    @SerializedName("Body")
    @Expose
    private String body;
    @SerializedName("Photos")
    @Expose
    private List<Photo> photos = null;
    @SerializedName("AllowsPickups")
    @Expose
    private Integer allowsPickups;
    @SerializedName("ShippingOptions")
    @Expose
    private List<ShippingOption> shippingOptions = null;
    @SerializedName("PaymentOptions")
    @Expose
    private String paymentOptions;
    @SerializedName("AuthenticatedMembersOnly")
    @Expose
    private Boolean authenticatedMembersOnly;
    @SerializedName("CurrentShippingPromotion")
    @Expose
    private CurrentShippingPromotion currentShippingPromotion;
    @SerializedName("CanAddToCart")
    @Expose
    private Boolean canAddToCart;
    @SerializedName("EmbeddedContent")
    @Expose
    private EmbeddedContent embeddedContent;
    @SerializedName("IsEligibleForBuyerProtection")
    @Expose
    private Boolean isEligibleForBuyerProtection;
    @SerializedName("SupportsQuestionsAndAnswers")
    @Expose
    private Boolean supportsQuestionsAndAnswers;
    @SerializedName("PaymentMethods")
    @Expose
    private List<PaymentMethod> paymentMethods = null;

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

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }

    public Boolean getHasPayNow() {
        return hasPayNow;
    }

    public void setHasPayNow(Boolean hasPayNow) {
        this.hasPayNow = hasPayNow;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getSuburbId() {
        return suburbId;
    }

    public void setSuburbId(Integer suburbId) {
        this.suburbId = suburbId;
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getReserveState() {
        return reserveState;
    }

    public void setReserveState(Integer reserveState) {
        this.reserveState = reserveState;
    }

    public List<Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Object> attributes) {
        this.attributes = attributes;
    }

    public List<Object> getOpenHomes() {
        return openHomes;
    }

    public void setOpenHomes(List<Object> openHomes) {
        this.openHomes = openHomes;
    }

    public Double getMinimumNextBidAmount() {
        return minimumNextBidAmount;
    }

    public void setMinimumNextBidAmount(Double minimumNextBidAmount) {
        this.minimumNextBidAmount = minimumNextBidAmount;
    }

    public String getPriceDisplay() {
        return priceDisplay;
    }

    public void setPriceDisplay(String priceDisplay) {
        this.priceDisplay = priceDisplay;
    }

    public AdditionalData getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(AdditionalData additionalData) {
        this.additionalData = additionalData;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Integer getAllowsPickups() {
        return allowsPickups;
    }

    public void setAllowsPickups(Integer allowsPickups) {
        this.allowsPickups = allowsPickups;
    }

    public List<ShippingOption> getShippingOptions() {
        return shippingOptions;
    }

    public void setShippingOptions(List<ShippingOption> shippingOptions) {
        this.shippingOptions = shippingOptions;
    }

    public String getPaymentOptions() {
        return paymentOptions;
    }

    public void setPaymentOptions(String paymentOptions) {
        this.paymentOptions = paymentOptions;
    }

    public Boolean getAuthenticatedMembersOnly() {
        return authenticatedMembersOnly;
    }

    public void setAuthenticatedMembersOnly(Boolean authenticatedMembersOnly) {
        this.authenticatedMembersOnly = authenticatedMembersOnly;
    }

    public CurrentShippingPromotion getCurrentShippingPromotion() {
        return currentShippingPromotion;
    }

    public void setCurrentShippingPromotion(CurrentShippingPromotion currentShippingPromotion) {
        this.currentShippingPromotion = currentShippingPromotion;
    }

    public Boolean getCanAddToCart() {
        return canAddToCart;
    }

    public void setCanAddToCart(Boolean canAddToCart) {
        this.canAddToCart = canAddToCart;
    }

    public EmbeddedContent getEmbeddedContent() {
        return embeddedContent;
    }

    public void setEmbeddedContent(EmbeddedContent embeddedContent) {
        this.embeddedContent = embeddedContent;
    }

    public Boolean getIsEligibleForBuyerProtection() {
        return isEligibleForBuyerProtection;
    }

    public void setIsEligibleForBuyerProtection(Boolean isEligibleForBuyerProtection) {
        this.isEligibleForBuyerProtection = isEligibleForBuyerProtection;
    }

    public Boolean getSupportsQuestionsAndAnswers() {
        return supportsQuestionsAndAnswers;
    }

    public void setSupportsQuestionsAndAnswers(Boolean supportsQuestionsAndAnswers) {
        this.supportsQuestionsAndAnswers = supportsQuestionsAndAnswers;
    }

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }



    public class Member {

        @SerializedName("MemberId")
        @Expose
        private Integer memberId;
        @SerializedName("Nickname")
        @Expose
        private String nickname;
        @SerializedName("DateAddressVerified")
        @Expose
        private String dateAddressVerified;
        @SerializedName("DateJoined")
        @Expose
        private String dateJoined;
        @SerializedName("UniqueNegative")
        @Expose
        private Integer uniqueNegative;
        @SerializedName("UniquePositive")
        @Expose
        private Integer uniquePositive;
        @SerializedName("FeedbackCount")
        @Expose
        private Integer feedbackCount;
        @SerializedName("IsAddressVerified")
        @Expose
        private Boolean isAddressVerified;
        @SerializedName("Suburb")
        @Expose
        private String suburb;
        @SerializedName("Region")
        @Expose
        private String region;
        @SerializedName("IsAuthenticated")
        @Expose
        private Boolean isAuthenticated;

        public Integer getMemberId() {
            return memberId;
        }

        public void setMemberId(Integer memberId) {
            this.memberId = memberId;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getDateAddressVerified() {
            return dateAddressVerified;
        }

        public void setDateAddressVerified(String dateAddressVerified) {
            this.dateAddressVerified = dateAddressVerified;
        }

        public String getDateJoined() {
            return dateJoined;
        }

        public void setDateJoined(String dateJoined) {
            this.dateJoined = dateJoined;
        }

        public Integer getUniqueNegative() {
            return uniqueNegative;
        }

        public void setUniqueNegative(Integer uniqueNegative) {
            this.uniqueNegative = uniqueNegative;
        }

        public Integer getUniquePositive() {
            return uniquePositive;
        }

        public void setUniquePositive(Integer uniquePositive) {
            this.uniquePositive = uniquePositive;
        }

        public Integer getFeedbackCount() {
            return feedbackCount;
        }

        public void setFeedbackCount(Integer feedbackCount) {
            this.feedbackCount = feedbackCount;
        }

        public Boolean getIsAddressVerified() {
            return isAddressVerified;
        }

        public void setIsAddressVerified(Boolean isAddressVerified) {
            this.isAddressVerified = isAddressVerified;
        }

        public String getSuburb() {
            return suburb;
        }

        public void setSuburb(String suburb) {
            this.suburb = suburb;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public Boolean getIsAuthenticated() {
            return isAuthenticated;
        }

        public void setIsAuthenticated(Boolean isAuthenticated) {
            this.isAuthenticated = isAuthenticated;
        }

    }

    public class PaymentMethod {

        @SerializedName("Id")
        @Expose
        private Integer id;
        @SerializedName("Name")
        @Expose
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }


    public class Photo {

        @SerializedName("Key")
        @Expose
        private Integer key;
        @SerializedName("Value")
        @Expose
        private Value value;

        public Integer getKey() {
            return key;
        }

        public void setKey(Integer key) {
            this.key = key;
        }

        public Value getValue() {
            return value;
        }

        public void setValue(Value value) {
            this.value = value;
        }

    }


    public class ShippingOption {

        @SerializedName("Type")
        @Expose
        private Integer type;
        @SerializedName("Price")
        @Expose
        private Double price;
        @SerializedName("Method")
        @Expose
        private String method;
        @SerializedName("ShippingId")
        @Expose
        private Integer shippingId;

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public Integer getShippingId() {
            return shippingId;
        }

        public void setShippingId(Integer shippingId) {
            this.shippingId = shippingId;
        }

    }


    public class Value {

        @SerializedName("Thumbnail")
        @Expose
        private String thumbnail;
        @SerializedName("List")
        @Expose
        private String list;
        @SerializedName("Medium")
        @Expose
        private String medium;
        @SerializedName("Gallery")
        @Expose
        private String gallery;
        @SerializedName("Large")
        @Expose
        private String large;
        @SerializedName("FullSize")
        @Expose
        private String fullSize;
        @SerializedName("PhotoId")
        @Expose
        private Integer photoId;

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getList() {
            return list;
        }

        public void setList(String list) {
            this.list = list;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getGallery() {
            return gallery;
        }

        public void setGallery(String gallery) {
            this.gallery = gallery;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getFullSize() {
            return fullSize;
        }

        public void setFullSize(String fullSize) {
            this.fullSize = fullSize;
        }

        public Integer getPhotoId() {
            return photoId;
        }

        public void setPhotoId(Integer photoId) {
            this.photoId = photoId;
        }

    }

    public class AdditionalData {

        @SerializedName("BulletPoints")
        @Expose
        private List<Object> bulletPoints = null;
        @SerializedName("Tags")
        @Expose
        private List<Object> tags = null;

        public List<Object> getBulletPoints() {
            return bulletPoints;
        }

        public void setBulletPoints(List<Object> bulletPoints) {
            this.bulletPoints = bulletPoints;
        }

        public List<Object> getTags() {
            return tags;
        }

        public void setTags(List<Object> tags) {
            this.tags = tags;
        }

    }


    public class CurrentShippingPromotion {

        @SerializedName("Threshold")
        @Expose
        private Integer threshold;
        @SerializedName("ThresholdType")
        @Expose
        private Integer thresholdType;

        public Integer getThreshold() {
            return threshold;
        }

        public void setThreshold(Integer threshold) {
            this.threshold = threshold;
        }

        public Integer getThresholdType() {
            return thresholdType;
        }

        public void setThresholdType(Integer thresholdType) {
            this.thresholdType = thresholdType;
        }

    }


    public class EmbeddedContent {


    }

}
