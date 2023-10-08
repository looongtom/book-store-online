package com.example.bookstoreonline.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class CategoriesReportEntityPK implements Serializable {
    @Column(name = "CategoriesId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoriesId;
    @Column(name = "ReportId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
        CategoriesReportEntityPK that = (CategoriesReportEntityPK) o;
        return categoriesId == that.categoriesId && reportId == that.reportId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoriesId, reportId);
    }
}
