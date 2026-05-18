package com.rajae_sekkat.Kids_IT_Learning_Platform.store.dto;

import com.rajae_sekkat.Kids_IT_Learning_Platform.store.entity.ProductCategory;

import java.math.BigDecimal;

public class ProductDto {

    private Long id;
    private String title;
    private String description;
    private BigDecimal price;
    private BigDecimal originalPrice;
    private String imageUrl;
    private String badge;
    private Double rating;
    private Integer reviewCount;
    private ProductCategory category;
    private Boolean featured;
    private Boolean bestSeller;
    private Boolean isNew;
    private String sellerName;
    private String sellerSlug;

    public ProductDto() {
    }

    public ProductDto(Long id, String title, String description, BigDecimal price, BigDecimal originalPrice, String imageUrl, String badge, Double rating, Integer reviewCount, ProductCategory category, Boolean featured, Boolean bestSeller, Boolean isNew, String sellerName, String sellerSlug) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.originalPrice = originalPrice;
        this.imageUrl = imageUrl;
        this.badge = badge;
        this.rating = rating;
        this.reviewCount = reviewCount;
        this.category = category;
        this.featured = featured;
        this.bestSeller = bestSeller;
        this.isNew = isNew;
        this.sellerName = sellerName;
        this.sellerSlug = sellerSlug;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Boolean getBestSeller() {
        return bestSeller;
    }

    public void setBestSeller(Boolean bestSeller) {
        this.bestSeller = bestSeller;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerSlug() {
        return sellerSlug;
    }

    public void setSellerSlug(String sellerSlug) {
        this.sellerSlug = sellerSlug;
    }
}
