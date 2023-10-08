package com.example.bookstoreonline.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Product_prices", schema = "dbo", catalog = "book-store-online")
public class ProductPricesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProductId")
    private int productId;
    @Basic
    @Column(name = "Prices")
    private Integer prices;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Integer getPrices() {
        return prices;
    }

    public void setPrices(Integer prices) {
        this.prices = prices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPricesEntity that = (ProductPricesEntity) o;
        return productId == that.productId && Objects.equals(prices, that.prices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, prices);
    }
}
