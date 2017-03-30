/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.aeteris.controller;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ariazavocki
 */
@Entity
@Table(name = "DIETFOOD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dietfood.findAll", query = "SELECT d FROM Dietfood d")
    , @NamedQuery(name = "Dietfood.findById", query = "SELECT d FROM Dietfood d WHERE d.dietfoodPK.id = :id")
    , @NamedQuery(name = "Dietfood.findByDietDietid", query = "SELECT d FROM Dietfood d WHERE d.dietfoodPK.dietDietid = :dietDietid")})
public class Dietfood implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DietfoodPK dietfoodPK;
    @JoinColumn(name = "DIET_DIETID", referencedColumnName = "DIETID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Diet diet;
    @JoinColumn(name = "FOOD_FOODID", referencedColumnName = "FOODID")
    @ManyToOne
    private Food foodFoodid;

    public Dietfood() {
    }

    public Dietfood(DietfoodPK dietfoodPK) {
        this.dietfoodPK = dietfoodPK;
    }

    public Dietfood(long id, long dietDietid) {
        this.dietfoodPK = new DietfoodPK(id, dietDietid);
    }

    public DietfoodPK getDietfoodPK() {
        return dietfoodPK;
    }

    public void setDietfoodPK(DietfoodPK dietfoodPK) {
        this.dietfoodPK = dietfoodPK;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public Food getFoodFoodid() {
        return foodFoodid;
    }

    public void setFoodFoodid(Food foodFoodid) {
        this.foodFoodid = foodFoodid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dietfoodPK != null ? dietfoodPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dietfood)) {
            return false;
        }
        Dietfood other = (Dietfood) object;
        if ((this.dietfoodPK == null && other.dietfoodPK != null) || (this.dietfoodPK != null && !this.dietfoodPK.equals(other.dietfoodPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeteris.ciei.Dietfood[ dietfoodPK=" + dietfoodPK + " ]";
    }
    
}
