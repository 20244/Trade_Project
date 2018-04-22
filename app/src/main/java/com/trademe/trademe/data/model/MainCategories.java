package com.trademe.trademe.data.model;


import java.util.List;

public class MainCategories   {


    private String name;

    private String number;

    private String path;

    private List<Subcategory> subcategories = null;

    private Boolean isLeaf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Subcategory> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<Subcategory> subcategories) {
        this.subcategories = subcategories;
    }

    public Boolean getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

    public static class Subcategory  {


        private String name;

        private String number;

        private String path;

        private Boolean hasClassifieds;

        private Boolean canHaveSecondCategory;

        private Boolean canBeSecondCategory;

        private Boolean isLeaf;

        private Integer areaOfBusiness;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public Boolean getHasClassifieds() {
            return hasClassifieds;
        }

        public void setHasClassifieds(Boolean hasClassifieds) {
            this.hasClassifieds = hasClassifieds;
        }

        public Boolean getCanHaveSecondCategory() {
            return canHaveSecondCategory;
        }

        public void setCanHaveSecondCategory(Boolean canHaveSecondCategory) {
            this.canHaveSecondCategory = canHaveSecondCategory;
        }

        public Boolean getCanBeSecondCategory() {
            return canBeSecondCategory;
        }

        public void setCanBeSecondCategory(Boolean canBeSecondCategory) {
            this.canBeSecondCategory = canBeSecondCategory;
        }

        public Boolean getIsLeaf() {
            return isLeaf;
        }

        public void setIsLeaf(Boolean isLeaf) {
            this.isLeaf = isLeaf;
        }

        public Integer getAreaOfBusiness() {
            return areaOfBusiness;
        }

        public void setAreaOfBusiness(Integer areaOfBusiness) {
            this.areaOfBusiness = areaOfBusiness;
        }

    }
}
