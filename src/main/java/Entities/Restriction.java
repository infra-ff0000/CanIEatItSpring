/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "RESTRICTION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Restriction.findAll", query = "SELECT r FROM Restriction r")
    , @NamedQuery(name = "Restriction.findById", query = "SELECT r FROM Restriction r WHERE r.id = :id")})
public class Restriction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @ManyToMany(mappedBy = "restrictionCollection")
    private Collection<Diet> dietCollection;
    @ManyToMany(mappedBy = "restrictionCollection")
    private Collection<Allergen> allergenCollection;

    public Restriction() {
    }

    public Restriction(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlTransient
    public Collection<Diet> getDietCollection() {
        return dietCollection;
    }

    public void setDietCollection(Collection<Diet> dietCollection) {
        this.dietCollection = dietCollection;
    }

    @XmlTransient
    public Collection<Allergen> getAllergenCollection() {
        return allergenCollection;
    }

    public void setAllergenCollection(Collection<Allergen> allergenCollection) {
        this.allergenCollection = allergenCollection;
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
        if (!(object instanceof Restriction)) {
            return false;
        }
        Restriction other = (Restriction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Restriction[ id=" + id + " ]";
    }
    
}
