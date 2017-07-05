/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.model;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Francesca
 */
@Table(name="categorie")
 public class Categoria implements java.io.Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cat")
    private int id_categ;
    
    @Column(name="nomec", nullable = false)
    private String nomecateg;

    public Categoria(int id_categ, String nomecateg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   
    public int getId(){
       return id_categ;
       }
    
    public void setId(int id_categ){
        this.id_categ=id_categ;
        
    }
    
    public void setNomeCat(String nomecateg){
        this.nomecateg=nomecateg;
    }
    
    public String getNomeCat(){
        return nomecateg;
    }
}
   

