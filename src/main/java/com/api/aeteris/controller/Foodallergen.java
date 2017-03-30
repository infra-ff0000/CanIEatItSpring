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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ariazavocki
 */
@Entity
@Table(name = "FOODALLERGEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Foodallergen.findAll", query = "SELECT f FROM Foodallergen f")
    , @NamedQuery(name = "Foodallergen.findById", query = "SELECT f FROM Foodallergen f WHERE f.id = :id")})
public class Foodallergen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @JoinTable(name = "FOODALLERGEN_ALLERGEN", joinColumns = {
        @JoinColumn(name = "FOODALLERGENCOLLECTION_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "ALLERGENCOLLECTION_ALLERGENSID", referencedColumnName = "ALLERGENSID")})
    @ManyToMany
    private Collection<Allergen> allergenCollection;
    @JoinTable(name = "FOODALLERGEN_FOOD", joinColumns = {
        @JoinColumn(name = "FOODALLERGENCOLLECTION_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "FOODCOLLECTION_FOODID", referencedColumnName = "FOODID")})
    @ManyToMany
    private Collection<Food> foodCollection;
    @JoinTable(name = "FOOD_FOODALLERGEN", joinColumns = {
        @JoinColumn(name = "FOODALLERGENS_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "FOOD_FOODID", referencedColumnName = "FOODID")})
    @ManyToMany
    private Collection<Food> foodCollection1;
    @ManyToMany(mappedBy = "foodallergenCollection1")
    private Collection<Allergen> allergenCollection1;

    public Foodallergen() {
    }

    public Foodallergen(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlTransient
    public Collection<Allergen> getAllergenCollection() {
        return allergenCollection;
    }

    public void setAllergenCollection(Collection<Allergen> allergenCollection) {
        this.allergenCollection = allergenCollection;
    }

    @XmlTransient
    public Collection<Food> getFoodCollection() {
        return foodCollection;
    }

    public void setFoodCollection(Collection<Food> foodCollection) {
        this.foodCollection = foodCollection;
    }

    @XmlTransient
    public Collection<Food> getFoodCollection1() {
        return foodCollection1;
    }

    public void setFoodCollection1(Collection<Food> foodCollection1) {
        this.foodCollection1 = foodCollection1;
    }

    @XmlTransient
    public Collection<Allergen> getAllergenCollection1() {
        return allergenCollection1;
    }

    public void setAllergenCollection1(Collection<Allergen> allergenCollection1) {
        this.allergenCollection1 = allergenCollection1;
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
        if (!(object instanceof Foodallergen)) {
            return false;
        }
        Foodallergen other = (Foodallergen) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeteris.ciei.Foodallergen[ id=" + id + " ]";
    }
    
}
