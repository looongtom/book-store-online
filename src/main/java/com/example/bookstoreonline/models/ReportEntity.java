package com.example.bookstoreonline.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Report", schema = "dbo", catalog = "book-store-online")
public class ReportEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "Content")
    private String content;
    @Basic
    @Column(name = "AmountCustomer")
    private Integer amountCustomer;
    @Basic
    @Column(name = "AverageAge")
    private Float averageAge;
    @Basic
    @Column(name = "AmountCategory")
    private Integer amountCategory;
    @Basic
    @Column(name = "AmountProduct")
    private Integer amountProduct;
    @Basic
    @Column(name = "TotalPages")
    private Integer totalPages;
    @Basic
    @Column(name = "AmountOrders")
    private Integer amountOrders;
    @Basic
    @Column(name = "TotalPrice")
    private Float totalPrice;
    @Basic
    @Column(name = "Promotion")
    private Float promotion;
    @Basic
    @Column(name = "Discriminator")
    private String discriminator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAmountCustomer() {
        return amountCustomer;
    }

    public void setAmountCustomer(Integer amountCustomer) {
        this.amountCustomer = amountCustomer;
    }

    public Float getAverageAge() {
        return averageAge;
    }

    public void setAverageAge(Float averageAge) {
        this.averageAge = averageAge;
    }

    public Integer getAmountCategory() {
        return amountCategory;
    }

    public void setAmountCategory(Integer amountCategory) {
        this.amountCategory = amountCategory;
    }

    public Integer getAmountProduct() {
        return amountProduct;
    }

    public void setAmountProduct(Integer amountProduct) {
        this.amountProduct = amountProduct;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getAmountOrders() {
        return amountOrders;
    }

    public void setAmountOrders(Integer amountOrders) {
        this.amountOrders = amountOrders;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Float getPromotion() {
        return promotion;
    }

    public void setPromotion(Float promotion) {
        this.promotion = promotion;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReportEntity that = (ReportEntity) o;
        return id == that.id && Objects.equals(content, that.content) && Objects.equals(amountCustomer, that.amountCustomer) && Objects.equals(averageAge, that.averageAge) && Objects.equals(amountCategory, that.amountCategory) && Objects.equals(amountProduct, that.amountProduct) && Objects.equals(totalPages, that.totalPages) && Objects.equals(amountOrders, that.amountOrders) && Objects.equals(totalPrice, that.totalPrice) && Objects.equals(promotion, that.promotion) && Objects.equals(discriminator, that.discriminator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, amountCustomer, averageAge, amountCategory, amountProduct, totalPages, amountOrders, totalPrice, promotion, discriminator);
    }
}
