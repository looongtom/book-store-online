package com.example.bookstoreonline.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Payment", schema = "dbo", catalog = "book-store-online")
public class PaymentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "OrderId")
    private int orderId;
    @Basic
    @Column(name = "Amount")
    private Float amount;
    @Basic
    @Column(name = "GivenAmount")
    private Float givenAmount;
    @Basic
    @Column(name = "CardNumber")
    private String cardNumber;
    @Basic
    @Column(name = "Discriminator")
    private String discriminator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Float getGivenAmount() {
        return givenAmount;
    }

    public void setGivenAmount(Float givenAmount) {
        this.givenAmount = givenAmount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
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
        PaymentEntity that = (PaymentEntity) o;
        return id == that.id && orderId == that.orderId && Objects.equals(amount, that.amount) && Objects.equals(givenAmount, that.givenAmount) && Objects.equals(cardNumber, that.cardNumber) && Objects.equals(discriminator, that.discriminator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, amount, givenAmount, cardNumber, discriminator);
    }
}
