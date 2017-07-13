/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restfuldb;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "professionista")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Professionista.findAll", query = "SELECT p FROM Professionista p")
    , @NamedQuery(name = "Professionista.findByIdProf", query = "SELECT p FROM Professionista p WHERE p.professionistaPK.idProf = :idProf")
    , @NamedQuery(name = "Professionista.findByNomep", query = "SELECT p FROM Professionista p WHERE p.nomep = :nomep")
    , @NamedQuery(name = "Professionista.findByIdCat", query = "SELECT p FROM Professionista p WHERE p.professionistaPK.idCat = :idCat")
    , @NamedQuery(name = "Professionista.findByCognnomep", query = "SELECT p FROM Professionista p WHERE p.cognnomep = :cognnomep")
    , @NamedQuery(name = "Professionista.findByEtap", query = "SELECT p FROM Professionista p WHERE p.etap = :etap")
    , @NamedQuery(name = "Professionista.findByTelp", query = "SELECT p FROM Professionista p WHERE p.telp = :telp")
    , @NamedQuery(name = "Professionista.findByMailp", query = "SELECT p FROM Professionista p WHERE p.mailp = :mailp")})
public class Professionista implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProfessionistaPK professionistaPK;
    @Column(name = "nomep")
    private Character nomep;
    @Column(name = "cognnomep")
    private Character cognnomep;
    @Column(name = "etap")
    private Character etap;
    @Column(name = "telp")
    private Integer telp;
    @Column(name = "mailp")
    private Character mailp;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "professionista")
    private Collection<Prenotazione> prenotazioneCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "professionista")
    private Collection<Chat> chatCollection;
    @JoinColumn(name = "id_cat", referencedColumnName = "id_cat", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Categoria categoria;

    public Professionista() {
    }

    public Professionista(ProfessionistaPK professionistaPK) {
        this.professionistaPK = professionistaPK;
    }

    public Professionista(Character idProf, Character idCat) {
        this.professionistaPK = new ProfessionistaPK(idProf, idCat);
    }

    public ProfessionistaPK getProfessionistaPK() {
        return professionistaPK;
    }

    public void setProfessionistaPK(ProfessionistaPK professionistaPK) {
        this.professionistaPK = professionistaPK;
    }

    public Character getNomep() {
        return nomep;
    }

    public void setNomep(Character nomep) {
        this.nomep = nomep;
    }

    public Character getCognnomep() {
        return cognnomep;
    }

    public void setCognnomep(Character cognnomep) {
        this.cognnomep = cognnomep;
    }

    public Character getEtap() {
        return etap;
    }

    public void setEtap(Character etap) {
        this.etap = etap;
    }

    public Integer getTelp() {
        return telp;
    }

    public void setTelp(Integer telp) {
        this.telp = telp;
    }

    public Character getMailp() {
        return mailp;
    }

    public void setMailp(Character mailp) {
        this.mailp = mailp;
    }

    @XmlTransient
    public Collection<Prenotazione> getPrenotazioneCollection() {
        return prenotazioneCollection;
    }

    public void setPrenotazioneCollection(Collection<Prenotazione> prenotazioneCollection) {
        this.prenotazioneCollection = prenotazioneCollection;
    }

    @XmlTransient
    public Collection<Chat> getChatCollection() {
        return chatCollection;
    }

    public void setChatCollection(Collection<Chat> chatCollection) {
        this.chatCollection = chatCollection;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (professionistaPK != null ? professionistaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professionista)) {
            return false;
        }
        Professionista other = (Professionista) object;
        if ((this.professionistaPK == null && other.professionistaPK != null) || (this.professionistaPK != null && !this.professionistaPK.equals(other.professionistaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restfuldb.Professionista[ professionistaPK=" + professionistaPK + " ]";
    }
    
}
