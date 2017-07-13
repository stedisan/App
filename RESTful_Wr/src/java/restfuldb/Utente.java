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
import javax.persistence.ManyToMany;
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
@Table(name = "utente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utente.findAll", query = "SELECT u FROM Utente u")
    , @NamedQuery(name = "Utente.findByIdUtente", query = "SELECT u FROM Utente u WHERE u.idUtente = :idUtente")
    , @NamedQuery(name = "Utente.findByNome", query = "SELECT u FROM Utente u WHERE u.nome = :nome")
    , @NamedQuery(name = "Utente.findByCognome", query = "SELECT u FROM Utente u WHERE u.cognome = :cognome")
    , @NamedQuery(name = "Utente.findByCitta", query = "SELECT u FROM Utente u WHERE u.citta = :citta")
    , @NamedQuery(name = "Utente.findByEta", query = "SELECT u FROM Utente u WHERE u.eta = :eta")
    , @NamedQuery(name = "Utente.findByTelefono", query = "SELECT u FROM Utente u WHERE u.telefono = :telefono")
    , @NamedQuery(name = "Utente.findByEmail", query = "SELECT u FROM Utente u WHERE u.email = :email")
    , @NamedQuery(name = "Utente.findByUsername", query = "SELECT u FROM Utente u WHERE u.username = :username")
    , @NamedQuery(name = "Utente.findByPassword", query = "SELECT u FROM Utente u WHERE u.password = :password")})
public class Utente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_utente")
    private String idUtente;
    @Column(name = "nome")
    private Character nome;
    @Column(name = "cognome")
    private Character cognome;
    @Column(name = "citta")
    private Character citta;
    @Column(name = "eta")
    private Character eta;
    @Column(name = "telefono")
    private Integer telefono;
    @Column(name = "email")
    private Character email;
    @Column(name = "username")
    private Character username;
    @Column(name = "password")
    private Character password;
    @ManyToMany(mappedBy = "utenteCollection")
    private Collection<Tasks> tasksCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "utente")
    private Collection<Prenotazione> prenotazioneCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "utente")
    private Collection<Chat> chatCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<Session> sessionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<Tasks> tasksCollection1;

    public Utente() {
    }

    public Utente(String idUtente) {
        this.idUtente = idUtente;
    }

    public String getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(String idUtente) {
        this.idUtente = idUtente;
    }

    public Character getNome() {
        return nome;
    }

    public void setNome(Character nome) {
        this.nome = nome;
    }

    public Character getCognome() {
        return cognome;
    }

    public void setCognome(Character cognome) {
        this.cognome = cognome;
    }

    public Character getCitta() {
        return citta;
    }

    public void setCitta(Character citta) {
        this.citta = citta;
    }

    public Character getEta() {
        return eta;
    }

    public void setEta(Character eta) {
        this.eta = eta;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Character getEmail() {
        return email;
    }

    public void setEmail(Character email) {
        this.email = email;
    }

    public Character getUsername() {
        return username;
    }

    public void setUsername(Character username) {
        this.username = username;
    }

    public Character getPassword() {
        return password;
    }

    public void setPassword(Character password) {
        this.password = password;
    }

    @XmlTransient
    public Collection<Tasks> getTasksCollection() {
        return tasksCollection;
    }

    public void setTasksCollection(Collection<Tasks> tasksCollection) {
        this.tasksCollection = tasksCollection;
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

    @XmlTransient
    public Collection<Session> getSessionCollection() {
        return sessionCollection;
    }

    public void setSessionCollection(Collection<Session> sessionCollection) {
        this.sessionCollection = sessionCollection;
    }

    @XmlTransient
    public Collection<Tasks> getTasksCollection1() {
        return tasksCollection1;
    }

    public void setTasksCollection1(Collection<Tasks> tasksCollection1) {
        this.tasksCollection1 = tasksCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUtente != null ? idUtente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utente)) {
            return false;
        }
        Utente other = (Utente) object;
        if ((this.idUtente == null && other.idUtente != null) || (this.idUtente != null && !this.idUtente.equals(other.idUtente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restfuldb.Utente[ idUtente=" + idUtente + " ]";
    }
    
}
