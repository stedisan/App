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
public class ChatPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_chat")
    private int idChat;
    @Basic(optional = false)
    @Column(name = "id_profC")
    private Character idprofC;
    @Basic(optional = false)
    @Column(name = "id_utenteC")
    private Character idutenteC;

    public ChatPK() {
    }

    public ChatPK(int idChat, Character idprofC, Character idutenteC) {
        this.idChat = idChat;
        this.idprofC = idprofC;
        this.idutenteC = idutenteC;
    }

    public int getIdChat() {
        return idChat;
    }

    public void setIdChat(int idChat) {
        this.idChat = idChat;
    }

    public Character getIdprofC() {
        return idprofC;
    }

    public void setIdprofC(Character idprofC) {
        this.idprofC = idprofC;
    }

    public Character getIdutenteC() {
        return idutenteC;
    }

    public void setIdutenteC(Character idutenteC) {
        this.idutenteC = idutenteC;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idChat;
        hash += (idprofC != null ? idprofC.hashCode() : 0);
        hash += (idutenteC != null ? idutenteC.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChatPK)) {
            return false;
        }
        ChatPK other = (ChatPK) object;
        if (this.idChat != other.idChat) {
            return false;
        }
        if ((this.idprofC == null && other.idprofC != null) || (this.idprofC != null && !this.idprofC.equals(other.idprofC))) {
            return false;
        }
        if ((this.idutenteC == null && other.idutenteC != null) || (this.idutenteC != null && !this.idutenteC.equals(other.idutenteC))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restfuldb.ChatPK[ idChat=" + idChat + ", idprofC=" + idprofC + ", idutenteC=" + idutenteC + " ]";
    }
    
}
