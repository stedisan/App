/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.model;


import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;
import java.time.LocalTime;
import java.util.TimeZone;

/**
 *
 * @author Francesca
 */

    @Table(name="prenotazioni")
public class Prenotazione implements java.io.Serializable{

    @Column(name="id_pren")
    private Long id_prenot;
    
    @Column (name="data", nullable=false)
    private String data;

    
    @Column(name="ora",nullable=false)
    private String ora;
    
    @Column(name="id_prof")
    private Long id_profp;
    
    @Column(name="id_utente")
    private Long id_utentep;

    public Prenotazione(String data, String ora, Long id_profp, Long id_utentep) {
        this.data=data;
        this.ora=ora;
        this.id_profp=id_profp;
        this.id_utentep=id_utentep;
        
        
    }

  
    
    public void setIdPreno(Long id_prenot){
        this.id_prenot=id_prenot;
    }
    
    public Long getIdPreno(){
        return id_prenot;
    }
    
    public String getData(){
        return data;
    }
    
    public void setData(String data){
       this.data=data;
    }
     public String getOra(){
        return ora;
    }
    
    public void setOra(String ora){
       this.ora=ora;
    }
    
    
   public void setIdProf(Long id_profp){
        this.id_profp=id_profp;
    }
    
    public Long getIdProf(){
        return id_profp;
    }
    public void setIdUtentep(Long id_utentep){
        this.id_utentep=id_utentep;
    }
 
    
    public Long getIdUtentep(){
        return id_utentep;
    }
    }



