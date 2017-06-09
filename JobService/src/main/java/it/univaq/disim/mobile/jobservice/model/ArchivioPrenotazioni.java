/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.model;


import java.util.ArrayList;

/**
 *
 * @author Francesca
 */
public class ArchivioPrenotazioni extends Prenotazione {
    private final ArrayList<Prenotazione> prenotazione= new ArrayList<>();
    
    public void addPrenot(Prenotazione p){
        prenotazione.add(p);
    }
    
    public void removePrenot(Prenotazione p){
            prenotazione.remove(p);
    }
    
    public void ToString(){
       prenotazione.toString();
        }
    
    


}
