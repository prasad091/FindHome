package com.prasad.findhome.model;

public class CategoryModel {

    Integer imgSrc;
    String categoryName;

    public CategoryModel(Integer imgSrc, String categoryName) {
        this.imgSrc = imgSrc;
        this.categoryName = categoryName;
    }

    public Integer getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(Integer imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
