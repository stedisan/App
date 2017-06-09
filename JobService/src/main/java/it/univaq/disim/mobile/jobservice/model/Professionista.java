/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.model;
import it.univaq.disim.mobile.jobservice.database.JobServiceDataLayerMysqlImpl;
import java.io.*;
import javax.persistence.Column;
import javax.persistence.Table;


/**
 *
 * @author Francesca
 */
@Table(name="professionista")
public class Professionista implements java.io.Serializable {
    @Column(name="id_prof")
    private String id_prof;
    
    @Column(name="nomep")
    private String nomep;
    
    @Column(name="idcateg")
    private String idcateg;
    
    @Column(name="cognomep")
    private String Cognomep;
    
    @Column(name="etàap")
    private String etàp;
    
    @Column(name="telp")
    private String telp;
    
    @Column(name="mailp")
    private String mailp;

    public Professionista(JobServiceDataLayerMysqlImpl aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void SetIdProf(String id_prof){
        this.id_prof=id_prof;
    }
    
    public String GetIdPreno(){
        return id_prof;
    }
    
    public void SetNomeP(String nomep){
        this.nomep=nomep;
    }
    
    public String GetNomeP(){
        return nomep;
    }
    
    public void SetIdCateg(String idcateg){
        this.idcateg=idcateg;
    }
    
    public String GetIdCateg(){
        return idcateg;
    }
    
    public void SetCognomep(String cognomp){
        this.Cognomep=cognomp;
    }
    
    
    public String GetCognomep(){
        return Cognomep;
    }
    
    public void SetEtap(String etap){
        this.etàp=etap;
    }
    
    public String GetEtap(){
        return etàp;
    }
    
    public void SetTelp(String telp){
        this.telp=telp;
    }
    
    public String GetTelp(){
        return telp;
    }
    
    public void SetMailp(String Mailp){
        this.mailp=Mailp;
    }
    
    public String Getmailp(){
        return mailp;
    }
}


