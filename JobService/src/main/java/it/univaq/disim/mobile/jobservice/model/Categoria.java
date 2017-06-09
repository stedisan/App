/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.model;

import it.univaq.disim.mobile.jobservice.database.JobServiceDataLayerMysqlImpl;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Francesca
 */

 public class Categoria implements java.io.Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="idcategoria")
    private long id_categ;
    
    @Column(name="nomecate")
    private String nomecateg;

    public Categoria(JobServiceDataLayerMysqlImpl aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public long getId(){
       return id_categ;
       }
    
    public void SetId(Long id_categ){
        this.id_categ=id_categ;
        
    }
    
    public void SetNomeCat(String nomecateg){
        this.nomecateg=nomecateg;
    }
    
    public String GetNomeCat(){
        return nomecateg;
    }
}
   

