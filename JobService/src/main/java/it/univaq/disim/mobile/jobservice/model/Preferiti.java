/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.model;


import javax.persistence.Column;
import javax.persistence.Table;

/**
 *
 * @author Stefania
 */

  @Table(name="preferiti")
public class Preferiti implements java.io.Serializable{

    @Column(name="id_pref")
    private Long id_pref;
    
    @Column(name="id_prof")
    private Long id_profp;
    
    @Column(name="id_utente")
    private Long id_utentep;

    public class Preferiti (Long id_profp, Long id_utentep) {
        this.id_profp=id_profp;
        this.id_utentep=id_utentep;
        
    }

    public void setIdPref(Long id_pref){
        this.id_pref=id_pref;
    }
     
    public Long getIdPref(){
        return id_pref;
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
