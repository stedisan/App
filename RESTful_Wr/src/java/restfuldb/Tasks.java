/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restfuldb;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Teresa
 */
@Entity
@Table(name = "tasks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tasks.findAll", query = "SELECT t FROM Tasks t")
    , @NamedQuery(name = "Tasks.findByTaskId", query = "SELECT t FROM Tasks t WHERE t.taskId = :taskId")
    , @NamedQuery(name = "Tasks.findByText", query = "SELECT t FROM Tasks t WHERE t.text = :text")
    , @NamedQuery(name = "Tasks.findByCompleted", query = "SELECT t FROM Tasks t WHERE t.completed = :completed")
    , @NamedQuery(name = "Tasks.findByPosition", query = "SELECT t FROM Tasks t WHERE t.position = :position")})
public class Tasks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "task_id")
    private String taskId;
    @Basic(optional = false)
    @Column(name = "text")
    private String text;
    @Column(name = "completed")
    private Boolean completed;
    @Basic(optional = false)
    @Column(name = "position")
    private int position;
    @JoinTable(name = "tasks_utente", joinColumns = {
        @JoinColumn(name = "id_task_2", referencedColumnName = "task_id")}, inverseJoinColumns = {
        @JoinColumn(name = "id_utente_2", referencedColumnName = "id_utente")})
    @ManyToMany
    private Collection<Utente> utenteCollection;
    @JoinColumn(name = "user_id", referencedColumnName = "id_utente")
    @ManyToOne(optional = false)
    private Utente userId;

    public Tasks() {
    }

    public Tasks(String taskId) {
        this.taskId = taskId;
    }

    public Tasks(String taskId, String text, int position) {
        this.taskId = taskId;
        this.text = text;
        this.position = position;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @XmlTransient
    public Collection<Utente> getUtenteCollection() {
        return utenteCollection;
    }

    public void setUtenteCollection(Collection<Utente> utenteCollection) {
        this.utenteCollection = utenteCollection;
    }

    public Utente getUserId() {
        return userId;
    }

    public void setUserId(Utente userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taskId != null ? taskId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tasks)) {
            return false;
        }
        Tasks other = (Tasks) object;
        if ((this.taskId == null && other.taskId != null) || (this.taskId != null && !this.taskId.equals(other.taskId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restfuldb.Tasks[ taskId=" + taskId + " ]";
    }
    
}
