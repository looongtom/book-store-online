package com.example.bookstoreonline.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class ProductReportEntityPK implements Serializable {
    @Column(name = "ProductId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    @Column(name = "ReportId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
        ProductReportEntityPK that = (ProductReportEntityPK) o;
        return productId == that.productId && reportId == that.reportId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, reportId);
    }
}
