/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.model;

import it.univaq.disim.mobile.jobservice.database.JobServiceDataLayerMysqlImpl;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

 @Entity
@Table(name="chat")
public class Chat implements java.io.Serializable {
    
    @Id
    @Column(name="id_chat")
    private String id_chat;
    
    @Column(name="id_profC")
    private String id_profC;
    
    @Column(name="id_utenteC")
    private String id_utenteC;

    public Chat(JobServiceDataLayerMysqlImpl aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void SetIdChat(String id_chat){
        this.id_chat=id_chat;
    }
    
    public String GetIdChat(){
        return id_chat;
    }
    
    public void SetIdProf(String id_profC){
        this.id_profC=id_profC;
    }
    
    public String GetIdProf(){
        return id_profC;}
    
    public void SetIdUtente(String id_utenteC){
        this.id_utenteC=id_utenteC;
    }
    
    public String GetIdUtente(){
        return id_utenteC;
    }
    
       
   }
