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
public class PrenotazionePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_pren")
    private Character idPren;
    @Basic(optional = false)
    @Column(name = "id_profp")
    private Character idProfp;
    @Basic(optional = false)
    @Column(name = "id_utentep")
    private Character idUtentep;

    public PrenotazionePK() {
    }

    public PrenotazionePK(Character idPren, Character idProfp, Character idUtentep) {
        this.idPren = idPren;
        this.idProfp = idProfp;
        this.idUtentep = idUtentep;
    }

    public Character getIdPren() {
        return idPren;
    }

    public void setIdPren(Character idPren) {
        this.idPren = idPren;
    }

    public Character getIdProfp() {
        return idProfp;
    }

    public void setIdProfp(Character idProfp) {
        this.idProfp = idProfp;
    }

    public Character getIdUtentep() {
        return idUtentep;
    }

    public void setIdUtentep(Character idUtentep) {
        this.idUtentep = idUtentep;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPren != null ? idPren.hashCode() : 0);
        hash += (idProfp != null ? idProfp.hashCode() : 0);
        hash += (idUtentep != null ? idUtentep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrenotazionePK)) {
            return false;
        }
        PrenotazionePK other = (PrenotazionePK) object;
        if ((this.idPren == null && other.idPren != null) || (this.idPren != null && !this.idPren.equals(other.idPren))) {
            return false;
        }
        if ((this.idProfp == null && other.idProfp != null) || (this.idProfp != null && !this.idProfp.equals(other.idProfp))) {
            return false;
        }
        if ((this.idUtentep == null && other.idUtentep != null) || (this.idUtentep != null && !this.idUtentep.equals(other.idUtentep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restfuldb.PrenotazionePK[ idPren=" + idPren + ", idProfp=" + idProfp + ", idUtentep=" + idUtentep + " ]";
    }
    
}
