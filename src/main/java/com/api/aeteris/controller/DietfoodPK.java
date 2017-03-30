/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.aeteris.controller;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ariazavocki
 */
@Embeddable
public class DietfoodPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DIET_DIETID")
    private long dietDietid;

    public DietfoodPK() {
    }

    public DietfoodPK(long id, long dietDietid) {
        this.id = id;
        this.dietDietid = dietDietid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDietDietid() {
        return dietDietid;
    }

    public void setDietDietid(long dietDietid) {
        this.dietDietid = dietDietid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) dietDietid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DietfoodPK)) {
            return false;
        }
        DietfoodPK other = (DietfoodPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.dietDietid != other.dietDietid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeteris.ciei.DietfoodPK[ id=" + id + ", dietDietid=" + dietDietid + " ]";
    }
    
}
