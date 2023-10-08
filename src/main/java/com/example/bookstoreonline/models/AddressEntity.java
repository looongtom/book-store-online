package com.example.bookstoreonline.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Address", schema = "dbo", catalog = "book-store-online")
public class AddressEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "UserId")
    private String userId;
    @Basic
    @Column(name = "City")
    private String city;
    @Basic
    @Column(name = "District")
    private String district;
    @Basic
    @Column(name = "HomeSignNumber")
    private int homeSignNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getHomeSignNumber() {
        return homeSignNumber;
    }

    public void setHomeSignNumber(int homeSignNumber) {
        this.homeSignNumber = homeSignNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEntity that = (AddressEntity) o;
        return id == that.id && homeSignNumber == that.homeSignNumber && Objects.equals(userId, that.userId) && Objects.equals(city, that.city) && Objects.equals(district, that.district);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, city, district, homeSignNumber);
    }
}
