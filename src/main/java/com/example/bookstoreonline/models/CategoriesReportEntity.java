package com.example.bookstoreonline.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Categories_Report", schema = "dbo", catalog = "book-store-online")
@IdClass(CategoriesReportEntityPK.class)
public class CategoriesReportEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CategoriesId")
    private int categoriesId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ReportId")
    private int reportId;

    public int getCategoriesId() {
        return categoriesId;
    }

    public void setCategoriesId(int categoriesId) {
        this.categoriesId = categoriesId;
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
        CategoriesReportEntity that = (CategoriesReportEntity) o;
        return categoriesId == that.categoriesId && reportId == that.reportId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoriesId, reportId);
    }
}
