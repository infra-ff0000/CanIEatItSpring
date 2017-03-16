/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

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
public class DietUserPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "USERS_ID")
    private long usersId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DIET_DIETID")
    private long dietDietid;

    public DietUserPK() {
    }

    public DietUserPK(long usersId, long dietDietid) {
        this.usersId = usersId;
        this.dietDietid = dietDietid;
    }

    public long getUsersId() {
        return usersId;
    }

    public void setUsersId(long usersId) {
        this.usersId = usersId;
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
        hash += (int) usersId;
        hash += (int) dietDietid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DietUserPK)) {
            return false;
        }
        DietUserPK other = (DietUserPK) object;
        if (this.usersId != other.usersId) {
            return false;
        }
        if (this.dietDietid != other.dietDietid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.DietUserPK[ usersId=" + usersId + ", dietDietid=" + dietDietid + " ]";
    }
    
}
