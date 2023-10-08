package com.example.bookstoreonline.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Order_Report", schema = "dbo", catalog = "book-store-online")
@IdClass(OrderReportEntityPK.class)
public class OrderReportEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OrderId")
    private int orderId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ReportId")
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
        OrderReportEntity that = (OrderReportEntity) o;
        return orderId == that.orderId && reportId == that.reportId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, reportId);
    }
}
