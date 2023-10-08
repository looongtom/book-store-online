package com.example.bookstoreonline.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Product", schema = "dbo", catalog = "book-store-online")
public class ProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "PublisherId")
    private int publisherId;
    @Basic
    @Column(name = "Title")
    private String title;
    @Basic
    @Column(name = "Description")
    private String description;
    @Basic
    @Column(name = "Pages")
    private int pages;
    @Basic
    @Column(name = "ReleaseDate")
    private Date releaseDate;
    @Basic
    @Column(name = "SummaryPath")
    private String summaryPath;
    @Basic
    @Column(name = "Price")
    private float price;
    @Basic
    @Column(name = "ReleaseDate2")
    private Date releaseDate2;
    @Basic
    @Column(name = "PublishDate")
    private Date publishDate;
    @Basic
    @Column(name = "Discriminator")
    private String discriminator;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSummaryPath() {
        return summaryPath;
    }

    public void setSummaryPath(String summaryPath) {
        this.summaryPath = summaryPath;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getReleaseDate2() {
        return releaseDate2;
    }

    public void setReleaseDate2(Date releaseDate2) {
        this.releaseDate2 = releaseDate2;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
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
        ProductEntity that = (ProductEntity) o;
        return id == that.id && publisherId == that.publisherId && pages == that.pages && Float.compare(that.price, price) == 0 && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(releaseDate, that.releaseDate) && Objects.equals(summaryPath, that.summaryPath) && Objects.equals(releaseDate2, that.releaseDate2) && Objects.equals(publishDate, that.publishDate) && Objects.equals(discriminator, that.discriminator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, publisherId, title, description, pages, releaseDate, summaryPath, price, releaseDate2, publishDate, discriminator);
    }
}
