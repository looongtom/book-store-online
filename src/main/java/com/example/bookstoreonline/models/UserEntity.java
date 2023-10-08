package com.example.bookstoreonline.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "User", schema = "dbo", catalog = "book-store-online")
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private String id;
    @Basic
    @Column(name = "RoleId")
    private String roleId;
    @Basic
    @Column(name = "Password")
    private String password;
    @Basic
    @Column(name = "PhoneNumber2")
    private Integer phoneNumber2;
    @Basic
    @Column(name = "Gender2")
    private Integer gender2;
    @Basic
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Basic
    @Column(name = "Gender")
    private Integer gender;
    @Basic
    @Column(name = "Discriminator")
    private String discriminator;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(Integer phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public Integer getGender2() {
        return gender2;
    }

    public void setGender2(Integer gender2) {
        this.gender2 = gender2;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
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
        UserEntity that = (UserEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(roleId, that.roleId) && Objects.equals(password, that.password) && Objects.equals(phoneNumber2, that.phoneNumber2) && Objects.equals(gender2, that.gender2) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(gender, that.gender) && Objects.equals(discriminator, that.discriminator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleId, password, phoneNumber2, gender2, phoneNumber, gender, discriminator);
    }
}
