/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name = "DIET")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diet.findAll", query = "SELECT d FROM Diet d")
    , @NamedQuery(name = "Diet.findByDietid", query = "SELECT d FROM Diet d WHERE d.dietid = :dietid")
    , @NamedQuery(name = "Diet.findByName", query = "SELECT d FROM Diet d WHERE d.name = :name")})
public class Diet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "DIETID")
    private Long dietid;
    @Size(max = 255)
    @Column(name = "NAME")
    private String name;
    @JoinTable(name = "DIET_RESTRICTION", joinColumns = {
        @JoinColumn(name = "DIET_DIETID", referencedColumnName = "DIETID")}, inverseJoinColumns = {
        @JoinColumn(name = "RESTRICTIONS_ID", referencedColumnName = "ID")})
    @ManyToMany
    private Collection<Restriction> restrictionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diet")
    private Collection<Dietfood> dietfoodCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diet")
    private Collection<DietUser> dietUserCollection;

    public Diet() {
    }

    public Diet(Long dietid) {
        this.dietid = dietid;
    }

    public Long getDietid() {
        return dietid;
    }

    public void setDietid(Long dietid) {
        this.dietid = dietid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Collection<Restriction> getRestrictionCollection() {
        return restrictionCollection;
    }

    public void setRestrictionCollection(Collection<Restriction> restrictionCollection) {
        this.restrictionCollection = restrictionCollection;
    }

    @XmlTransient
    public Collection<Dietfood> getDietfoodCollection() {
        return dietfoodCollection;
    }

    public void setDietfoodCollection(Collection<Dietfood> dietfoodCollection) {
        this.dietfoodCollection = dietfoodCollection;
    }

    @XmlTransient
    public Collection<DietUser> getDietUserCollection() {
        return dietUserCollection;
    }

    public void setDietUserCollection(Collection<DietUser> dietUserCollection) {
        this.dietUserCollection = dietUserCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dietid != null ? dietid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diet)) {
            return false;
        }
        Diet other = (Diet) object;
        if ((this.dietid == null && other.dietid != null) || (this.dietid != null && !this.dietid.equals(other.dietid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Diet[ dietid=" + dietid + " ]";
    }
    
}
