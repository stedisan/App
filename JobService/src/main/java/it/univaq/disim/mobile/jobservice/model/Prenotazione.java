/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.model;


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
    private Date data;

    
    @Column(name="ora",nullable=false)
    private LocalTime ora;
    
    @Column(name="id_prof")
    private int id_profp;
    
    @Column(name="id_utente")
    private int id_utentep;

    public Prenotazione(Date data, LocalTime ora, int id_profp, int id_utentep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    public void setIdPreno(Long id_prenot){
        this.id_prenot=id_prenot;
    }
    
    public Long getIdPreno(){
        return id_prenot;
    }
    
    public Date getData(){
        return data;
    }
    
    public void setData(Date data){
       this.data=data;
    }
     public LocalTime getOra(){
        return ora;
    }
    
    public void setOra(LocalTime ora){
       this.ora=ora;
    }
    
    
   public void setIdProf(int id_profp){
        this.id_profp=id_profp;
    }
    
    public int getIdProf(){
        return id_profp;
    }
    public void setIdUtentep(int id_utentep){
        this.id_utentep=id_utentep;
    }
 
    
    public int getIdUtentep(){
        return id_utentep;
    }
    }



