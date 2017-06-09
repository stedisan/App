/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.model;

import it.univaq.disim.mobile.jobservice.database.JobServiceDataLayerMysqlImpl;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Francesca
 */

    @Table(name="prontazione")
public class Prenotazione implements java.io.Serializable{

    @Column(name="id_preno")
    private String id_prenot;
    
    @Column (name="data")
    private Date data;

    
    @Column(name="ora")
    private TimeZone ora;
    
    @Column(name="idprofp")
    private String id_profp;
    
    @Column(name="idutentep")
    private String id_utentep;

    public Prenotazione(JobServiceDataLayerMysqlImpl aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void SetIdPreno(String id_prenot){
        this.id_prenot=id_prenot;
    }
    
    public String GetIdPreno(){
        return id_prenot;
    }
    
    public Date GetDate(){
        return data;
    }
    
    public void SetData(Date data){
       this.data=data;
    }
     public TimeZone GetTimeZone(){
        return ora;
    }
    
    public void SetTimeZone(TimeZone ora){
       this.ora=ora;
    }
    
    
   public void SetIdProf(String id_profp){
        this.id_profp=id_profp;
    }
    
    public String getIdProf(){
        return id_profp;
    }
    public void SetIdUtentep(String id_utentep){
        this.id_utentep=id_utentep;
    }
    
    public String getId_prenP(){
        return id_utentep;
    }
    }



