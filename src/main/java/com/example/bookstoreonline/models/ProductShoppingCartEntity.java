package com.example.bookstoreonline.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Product_ShoppingCart", schema = "dbo", catalog = "book-store-online")
@IdClass(ProductShoppingCartEntityPK.class)
public class ProductShoppingCartEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProductId")
    private int productId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ShoppingCartId")
    private int shoppingCartId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getShoppingCartId() {
        return shoppingCartId;
    }

    public void setShoppingCartId(int shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductShoppingCartEntity that = (ProductShoppingCartEntity) o;
        return productId == that.productId && shoppingCartId == that.shoppingCartId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, shoppingCartId);
    }
}
