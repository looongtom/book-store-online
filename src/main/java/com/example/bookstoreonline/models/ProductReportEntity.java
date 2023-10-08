package com.example.bookstoreonline.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Product_Report", schema = "dbo", catalog = "book-store-online")
@IdClass(ProductReportEntityPK.class)
public class ProductReportEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ProductId")
    private int productId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ReportId")
    private int reportId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductReportEntity that = (ProductReportEntity) o;
        return productId == that.productId && reportId == that.reportId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, reportId);
    }
}
