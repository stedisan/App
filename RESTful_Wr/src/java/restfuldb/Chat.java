/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restfuldb;

import java.io.Serializable;
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
@Table(name = "chat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chat.findAll", query = "SELECT c FROM Chat c")
    , @NamedQuery(name = "Chat.findByIdChat", query = "SELECT c FROM Chat c WHERE c.chatPK.idChat = :idChat")
    , @NamedQuery(name = "Chat.findByIdprofC", query = "SELECT c FROM Chat c WHERE c.chatPK.idprofC = :idprofC")
    , @NamedQuery(name = "Chat.findByIdutenteC", query = "SELECT c FROM Chat c WHERE c.chatPK.idutenteC = :idutenteC")})
public class Chat implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ChatPK chatPK;
    @JoinColumn(name = "id_profC", referencedColumnName = "id_prof", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Professionista professionista;
    @JoinColumn(name = "id_utenteC", referencedColumnName = "id_utente", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Utente utente;

    public Chat() {
    }

    public Chat(ChatPK chatPK) {
        this.chatPK = chatPK;
    }

    public Chat(int idChat, Character idprofC, Character idutenteC) {
        this.chatPK = new ChatPK(idChat, idprofC, idutenteC);
    }

    public ChatPK getChatPK() {
        return chatPK;
    }

    public void setChatPK(ChatPK chatPK) {
        this.chatPK = chatPK;
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
        hash += (chatPK != null ? chatPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chat)) {
            return false;
        }
        Chat other = (Chat) object;
        if ((this.chatPK == null && other.chatPK != null) || (this.chatPK != null && !this.chatPK.equals(other.chatPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restfuldb.Chat[ chatPK=" + chatPK + " ]";
    }
    
}
