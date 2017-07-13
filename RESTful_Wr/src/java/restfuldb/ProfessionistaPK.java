/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restfuldb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Teresa
 */
@Embeddable
public class ProfessionistaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_prof")
    private Character idProf;
    @Basic(optional = false)
    @Column(name = "id_cat")
    private Character idCat;

    public ProfessionistaPK() {
    }

    public ProfessionistaPK(Character idProf, Character idCat) {
        this.idProf = idProf;
        this.idCat = idCat;
    }

    public Character getIdProf() {
        return idProf;
    }

    public void setIdProf(Character idProf) {
        this.idProf = idProf;
    }

    public Character getIdCat() {
        return idCat;
    }

    public void setIdCat(Character idCat) {
        this.idCat = idCat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProf != null ? idProf.hashCode() : 0);
        hash += (idCat != null ? idCat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfessionistaPK)) {
            return false;
        }
        ProfessionistaPK other = (ProfessionistaPK) object;
        if ((this.idProf == null && other.idProf != null) || (this.idProf != null && !this.idProf.equals(other.idProf))) {
            return false;
        }
        if ((this.idCat == null && other.idCat != null) || (this.idCat != null && !this.idCat.equals(other.idCat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restfuldb.ProfessionistaPK[ idProf=" + idProf + ", idCat=" + idCat + " ]";
    }
    
}
