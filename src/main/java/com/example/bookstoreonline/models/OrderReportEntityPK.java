package com.example.bookstoreonline.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class OrderReportEntityPK implements Serializable {
    @Column(name = "OrderId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    @Column(name = "ReportId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reportId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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
        OrderReportEntityPK that = (OrderReportEntityPK) o;
        return orderId == that.orderId && reportId == that.reportId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, reportId);
    }
}
