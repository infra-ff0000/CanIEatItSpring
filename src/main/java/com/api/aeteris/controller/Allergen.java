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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ariazavocki
 */
@Entity
@Table(name = "ALLERGEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Allergen.findAll", query = "SELECT a FROM Allergen a")
    , @NamedQuery(name = "Allergen.findByAllergensid", query = "SELECT a FROM Allergen a WHERE a.allergensid = :allergensid")
    , @NamedQuery(name = "Allergen.findByName", query = "SELECT a FROM Allergen a WHERE a.name = :name")})
public class Allergen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ALLERGENSID")
    private Long allergensid;
    @Size(max = 255)
    @Column(name = "NAME")
    private String name;
    @ManyToMany(mappedBy = "allergenCollection")
    private Collection<Foodallergen> foodallergenCollection;
    @JoinTable(name = "ALLERGEN_RESTRICTION", joinColumns = {
        @JoinColumn(name = "ALLERGEN_ALLERGENSID", referencedColumnName = "ALLERGENSID")}, inverseJoinColumns = {
        @JoinColumn(name = "RESTRICTIONS_ID", referencedColumnName = "ID")})
    @ManyToMany
    private Collection<Restriction> restrictionCollection;
    @JoinTable(name = "ALLERGEN_FOODALLERGEN", joinColumns = {
        @JoinColumn(name = "ALLERGEN_ALLERGENSID", referencedColumnName = "ALLERGENSID")}, inverseJoinColumns = {
        @JoinColumn(name = "FOODALLERGENS_ID", referencedColumnName = "ID")})
    @ManyToMany
    private Collection<Foodallergen> foodallergenCollection1;

    public Allergen() {
    }

    public Allergen(Long allergensid) {
        this.allergensid = allergensid;
    }

    public Long getAllergensid() {
        return allergensid;
    }

    public void setAllergensid(Long allergensid) {
        this.allergensid = allergensid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Collection<Foodallergen> getFoodallergenCollection() {
        return foodallergenCollection;
    }

    public void setFoodallergenCollection(Collection<Foodallergen> foodallergenCollection) {
        this.foodallergenCollection = foodallergenCollection;
    }

    @XmlTransient
    public Collection<Restriction> getRestrictionCollection() {
        return restrictionCollection;
    }

    public void setRestrictionCollection(Collection<Restriction> restrictionCollection) {
        this.restrictionCollection = restrictionCollection;
    }

    @XmlTransient
    public Collection<Foodallergen> getFoodallergenCollection1() {
        return foodallergenCollection1;
    }

    public void setFoodallergenCollection1(Collection<Foodallergen> foodallergenCollection1) {
        this.foodallergenCollection1 = foodallergenCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (allergensid != null ? allergensid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Allergen)) {
            return false;
        }
        Allergen other = (Allergen) object;
        if ((this.allergensid == null && other.allergensid != null) || (this.allergensid != null && !this.allergensid.equals(other.allergensid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeteris.ciei.Allergen[ allergensid=" + allergensid + " ]";
    }
    
}
