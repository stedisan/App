/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.model;

import java.io.*;
import javax.persistence.Column;
import javax.persistence.Table;


/**
 *
 * @author Francesca
 */
@Table(name="professionisti")
public class Professionista implements java.io.Serializable {
    @Column(name="id_prof")
    private Long id_prof;
    
    @Column(name="nomep" ,nullable = false, length = 255)
    private String nomep;
    
    @Column(name="id_cat", nullable = false, length = 255)
    private int idcateg;
    
    @Column(name="cognomep", nullable = false, length = 255)
    private String cognomep;
    
    @Column(name="etàp" ,nullable = false, length = 255)
    private int etàp;
    
    @Column(name="telp" ,nullable = false, length = 255)
    private String telp;
    
    @Column(name="mailp" ,nullable = false, length = 255)
    private String mailp;
    
    @Column(name="città", nullable = false, length = 255)
    private String città;

    public Professionista(String nomep, String cognomep, String mailp, String telp , int etàp, int idcateg, String città) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void setIdProf(Long id_prof){
        this.id_prof=id_prof;
    }
    
    public Long getIdPreno(){
        return id_prof;
    }
    
    public void setNomep(String nomep){
        this.nomep=nomep;
    }
    
    public String getNomep(){
        return nomep;
    }
    
    public void setIdCateg(int idcateg){
        this.idcateg=idcateg;
    }
    
    public int getIdCateg(){
        return idcateg;
    }
    
    public void setCognomep(String cognomep){
        this.cognomep=cognomep;
    }
    
    
    public String getCognomep(){
        return cognomep;
    }
    
    public void setEtap(int etàp){
        this.etàp=etàp;
    }
    
    public int getEtap(){
        return etàp;
    }
    
    public void setTelp(String telp){
        this.telp=telp;
    }
    
    public String getTelp(){
        return telp;
    }
    
    public void setCittà(String città){
        this.città=città;
    }
    
    public String getCittà(){
        return città;
    }
    
    public void setMailp(String mailp){
        this.mailp=mailp;
    }
    
    public String getmailp(){
        return mailp;
    }
}


