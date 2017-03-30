/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.aeteris.controller;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ariazavocki
 */
@Entity
@Table(name = "FOOD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Food.findAll", query = "SELECT f FROM Food f")
    , @NamedQuery(name = "Food.findByFoodid", query = "SELECT f FROM Food f WHERE f.foodid = :foodid")
    , @NamedQuery(name = "Food.findByBarcode", query = "SELECT f FROM Food f WHERE f.barcode = :barcode")
    , @NamedQuery(name = "Food.findByCarbs", query = "SELECT f FROM Food f WHERE f.carbs = :carbs")
    , @NamedQuery(name = "Food.findByFat", query = "SELECT f FROM Food f WHERE f.fat = :fat")
    , @NamedQuery(name = "Food.findByName", query = "SELECT f FROM Food f WHERE f.name = :name")
    , @NamedQuery(name = "Food.findByProtein", query = "SELECT f FROM Food f WHERE f.protein = :protein")})
public class Food implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FOODID")
    private Long foodid;
    @Size(max = 255)
    @Column(name = "BARCODE")
    private String barcode;
    @Size(max = 255)
    @Column(name = "CARBS")
    private String carbs;
    @Size(max = 255)
    @Column(name = "FAT")
    private String fat;
    @Size(max = 255)
    @Column(name = "NAME")
    private String name;
    @Size(max = 255)
    @Column(name = "PROTEIN")
    private String protein;
    @ManyToMany(mappedBy = "foodCollection")
    private Collection<Foodallergen> foodallergenCollection;
    @ManyToMany(mappedBy = "foodCollection1")
    private Collection<Foodallergen> foodallergenCollection1;
    @OneToMany(mappedBy = "foodFoodid")
    private Collection<Dietfood> dietfoodCollection;

    public Food() {
    }

    public Food(Long foodid) {
        this.foodid = foodid;
    }

    public Long getFoodid() {
        return foodid;
    }

    public void setFoodid(Long foodid) {
        this.foodid = foodid;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getCarbs() {
        return carbs;
    }

    public void setCarbs(String carbs) {
        this.carbs = carbs;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    @XmlTransient
    public Collection<Foodallergen> getFoodallergenCollection() {
        return foodallergenCollection;
    }

    public void setFoodallergenCollection(Collection<Foodallergen> foodallergenCollection) {
        this.foodallergenCollection = foodallergenCollection;
    }

    @XmlTransient
    public Collection<Foodallergen> getFoodallergenCollection1() {
        return foodallergenCollection1;
    }

    public void setFoodallergenCollection1(Collection<Foodallergen> foodallergenCollection1) {
        this.foodallergenCollection1 = foodallergenCollection1;
    }

    @XmlTransient
    public Collection<Dietfood> getDietfoodCollection() {
        return dietfoodCollection;
    }

    public void setDietfoodCollection(Collection<Dietfood> dietfoodCollection) {
        this.dietfoodCollection = dietfoodCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (foodid != null ? foodid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Food)) {
            return false;
        }
        Food other = (Food) object;
        if ((this.foodid == null && other.foodid != null) || (this.foodid != null && !this.foodid.equals(other.foodid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeteris.ciei.Food[ foodid=" + foodid + " ]";
    }
    
}
