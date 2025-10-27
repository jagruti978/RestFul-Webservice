/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fashion;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vishal
 */
@Entity
@Table(name = "WOMENFASHIONPRODUCT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Womenfashionproduct.findAll", query = "SELECT w FROM Womenfashionproduct w")
    , @NamedQuery(name = "Womenfashionproduct.findById", query = "SELECT w FROM Womenfashionproduct w WHERE w.id = :id")
    , @NamedQuery(name = "Womenfashionproduct.findByName", query = "SELECT w FROM Womenfashionproduct w WHERE w.name = :name")
    , @NamedQuery(name = "Womenfashionproduct.findByDescription", query = "SELECT w FROM Womenfashionproduct w WHERE w.description = :description")
    , @NamedQuery(name = "Womenfashionproduct.findByPrice", query = "SELECT w FROM Womenfashionproduct w WHERE w.price = :price")
    , @NamedQuery(name = "Womenfashionproduct.findByCategory", query = "SELECT w FROM Womenfashionproduct w WHERE w.category = :category")
    , @NamedQuery(name = "Womenfashionproduct.findByStock", query = "SELECT w FROM Womenfashionproduct w WHERE w.stock = :stock")
    , @NamedQuery(name = "Womenfashionproduct.findByColor", query = "SELECT w FROM Womenfashionproduct w WHERE w.color = :color")
    , @NamedQuery(name = "Womenfashionproduct.findByBrand", query = "SELECT w FROM Womenfashionproduct w WHERE w.brand = :brand")
    , @NamedQuery(name = "Womenfashionproduct.findBySize", query = "SELECT w FROM Womenfashionproduct w WHERE w.size = :size")
    , @NamedQuery(name = "Womenfashionproduct.findByDateAdded", query = "SELECT w FROM Womenfashionproduct w WHERE w.dateAdded = :dateAdded")
    , @NamedQuery(name = "Womenfashionproduct.findByLastModified", query = "SELECT w FROM Womenfashionproduct w WHERE w.lastModified = :lastModified")
    , @NamedQuery(name = "Womenfashionproduct.findByIsAvailable", query = "SELECT w FROM Womenfashionproduct w WHERE w.isAvailable = :isAvailable")
    , @NamedQuery(name = "Womenfashionproduct.findByRating", query = "SELECT w FROM Womenfashionproduct w WHERE w.rating = :rating")})
public class Womenfashionproduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 100)
    @Column(name = "NAME")
    private String name;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PRICE")
    private Integer price;
    @Size(max = 100)
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "STOCK")
    private Integer stock;
    @Size(max = 100)
    @Column(name = "COLOR")
    private String color;
    @Size(max = 100)
    @Column(name = "BRAND")
    private String brand;
    @Size(max = 50)
    @Column(name = "SIZE")
    private String size;
    @Column(name = "DATE_ADDED")
    @Temporal(TemporalType.DATE)
    private Date dateAdded;
    @Column(name = "LAST_MODIFIED")
    @Temporal(TemporalType.DATE)
    private Date lastModified;
    @Column(name = "IS_AVAILABLE")
    private Boolean isAvailable;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RATING")
    private Double rating;

    public Womenfashionproduct() {
    }

    public Womenfashionproduct(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Womenfashionproduct)) {
            return false;
        }
        Womenfashionproduct other = (Womenfashionproduct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fashion.Womenfashionproduct[ id=" + id + " ]";
    }
    
}
