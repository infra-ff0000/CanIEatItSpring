/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.aeteris.controller;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ariazavocki
 */
/*@Entity
@Table(name = "DIET_USER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DietUser.findAll", query = "SELECT d FROM DietUser d")
    , @NamedQuery(name = "DietUser.findByUsersId", query = "SELECT d FROM DietUser d WHERE d.dietUserPK.usersId = :usersId")
    , @NamedQuery(name = "DietUser.findByDietDietid", query = "SELECT d FROM DietUser d WHERE d.dietUserPK.dietDietid = :dietDietid")
    , @NamedQuery(name = "DietUser.findByFirstname", query = "SELECT d FROM DietUser d WHERE d.firstname = :firstname")
    , @NamedQuery(name = "DietUser.findByLastname", query = "SELECT d FROM DietUser d WHERE d.lastname = :lastname")})
*/

public class DietUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DietUserPK dietUserPK;
    @Size(max = 255)
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Size(max = 255)
    @Column(name = "LASTNAME")
    private String lastname;
    @JoinColumn(name = "DIET_DIETID", referencedColumnName = "DIETID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Diet diet;

    public DietUser() {
    }

    public DietUser(DietUserPK dietUserPK) {
        this.dietUserPK = dietUserPK;
    }

    public DietUser(long usersId, long dietDietid) {
        this.dietUserPK = new DietUserPK(usersId, dietDietid);
    }

    public DietUserPK getDietUserPK() {
        return dietUserPK;
    }

    public void setDietUserPK(DietUserPK dietUserPK) {
        this.dietUserPK = dietUserPK;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dietUserPK != null ? dietUserPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DietUser)) {
            return false;
        }
        DietUser other = (DietUser) object;
        if ((this.dietUserPK == null && other.dietUserPK != null) || (this.dietUserPK != null && !this.dietUserPK.equals(other.dietUserPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.aeteris.ciei.DietUser[ dietUserPK=" + dietUserPK + " ]";
    }
    
}
