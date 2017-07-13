/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restfuldb;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Teresa
 */
@Entity
@Table(name = "categoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c")
    , @NamedQuery(name = "Categoria.findByIdCat", query = "SELECT c FROM Categoria c WHERE c.idCat = :idCat")
    , @NamedQuery(name = "Categoria.findByNomec", query = "SELECT c FROM Categoria c WHERE c.nomec = :nomec")})
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_cat")
    private String idCat;
    @Column(name = "nomec")
    private Character nomec;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    private Collection<Professionista> professionistaCollection;

    public Categoria() {
    }

    public Categoria(String idCat) {
        this.idCat = idCat;
    }

    public String getIdCat() {
        return idCat;
    }

    public void setIdCat(String idCat) {
        this.idCat = idCat;
    }

    public Character getNomec() {
        return nomec;
    }

    public void setNomec(Character nomec) {
        this.nomec = nomec;
    }

    @XmlTransient
    public Collection<Professionista> getProfessionistaCollection() {
        return professionistaCollection;
    }

    public void setProfessionistaCollection(Collection<Professionista> professionistaCollection) {
        this.professionistaCollection = professionistaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCat != null ? idCat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.idCat == null && other.idCat != null) || (this.idCat != null && !this.idCat.equals(other.idCat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restfuldb.Categoria[ idCat=" + idCat + " ]";
    }
    
}
