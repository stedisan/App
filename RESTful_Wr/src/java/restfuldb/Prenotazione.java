/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restfuldb;

import java.io.Serializable;
import javax.persistence.Column;
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
 * @author Teresa
 */
@Entity
@Table(name = "prenotazione")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prenotazione.findAll", query = "SELECT p FROM Prenotazione p")
    , @NamedQuery(name = "Prenotazione.findByIdPren", query = "SELECT p FROM Prenotazione p WHERE p.prenotazionePK.idPren = :idPren")
    , @NamedQuery(name = "Prenotazione.findByGiorno", query = "SELECT p FROM Prenotazione p WHERE p.giorno = :giorno")
    , @NamedQuery(name = "Prenotazione.findByOra", query = "SELECT p FROM Prenotazione p WHERE p.ora = :ora")
    , @NamedQuery(name = "Prenotazione.findByIdProfp", query = "SELECT p FROM Prenotazione p WHERE p.prenotazionePK.idProfp = :idProfp")
    , @NamedQuery(name = "Prenotazione.findByIdUtentep", query = "SELECT p FROM Prenotazione p WHERE p.prenotazionePK.idUtentep = :idUtentep")})
public class Prenotazione implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrenotazionePK prenotazionePK;
    @Column(name = "giorno")
    private Character giorno;
    @Column(name = "ora")
    private Character ora;
    @JoinColumn(name = "id_profp", referencedColumnName = "id_prof", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Professionista professionista;
    @JoinColumn(name = "id_utentep", referencedColumnName = "id_utente", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Utente utente;

    public Prenotazione() {
    }

    public Prenotazione(PrenotazionePK prenotazionePK) {
        this.prenotazionePK = prenotazionePK;
    }

    public Prenotazione(Character idPren, Character idProfp, Character idUtentep) {
        this.prenotazionePK = new PrenotazionePK(idPren, idProfp, idUtentep);
    }

    public PrenotazionePK getPrenotazionePK() {
        return prenotazionePK;
    }

    public void setPrenotazionePK(PrenotazionePK prenotazionePK) {
        this.prenotazionePK = prenotazionePK;
    }

    public Character getGiorno() {
        return giorno;
    }

    public void setGiorno(Character giorno) {
        this.giorno = giorno;
    }

    public Character getOra() {
        return ora;
    }

    public void setOra(Character ora) {
        this.ora = ora;
    }

    public Professionista getProfessionista() {
        return professionista;
    }

    public void setProfessionista(Professionista professionista) {
        this.professionista = professionista;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prenotazionePK != null ? prenotazionePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prenotazione)) {
            return false;
        }
        Prenotazione other = (Prenotazione) object;
        if ((this.prenotazionePK == null && other.prenotazionePK != null) || (this.prenotazionePK != null && !this.prenotazionePK.equals(other.prenotazionePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restfuldb.Prenotazione[ prenotazionePK=" + prenotazionePK + " ]";
    }
    
}
