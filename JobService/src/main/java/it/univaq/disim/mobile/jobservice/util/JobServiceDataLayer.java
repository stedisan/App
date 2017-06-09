/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.util;

import it.univaq.disim.mobile.jobservice.model.Categoria;
import it.univaq.disim.mobile.jobservice.model.Chat;
import it.univaq.disim.mobile.jobservice.model.Prenotazione;
import it.univaq.disim.mobile.jobservice.model.Session;
import it.univaq.disim.mobile.jobservice.model.Task;
import it.univaq.disim.mobile.jobservice.model.User;
import it.univaq.disim.mobile.jobservice.model.Professionista;
import java.util.ArrayList;

/**
 *
 * @author Francesca
 */
public interface JobServiceDataLayer extends DataLayer{

    User createUser();

    Task createTask();

    Session createSession();

    Prenotazione createPrenotazione();
    
    Professionista createProfessionista();
    
    Categoria createCategoria();
    
    Chat createChat();

    Chat getChat(int id_chat) throws DataLayerException;
    
    Task getTask(int task_id) throws DataLayerException;
    
    Categoria getCategoria(int id_categ) throws DataLayerException;
    
    ArrayList<Chat> getChat() throws DataLayerException;
    
    ArrayList<Professionista> getProfessionista() throws DataLayerException;
    
    Professionista getProfessionista(int id_prof) throws DataLayerException;
    
    Session getSession(String token) throws DataLayerException;

    User getUser(long id_user) throws DataLayerException;

    Prenotazione getPrenotazione (int id_prenot) throws DataLayerException;

    ArrayList<Prenotazione> getPrenotazione() throws DataLayerException;
    
    void storePrenotazione(Prenotazione prenotazione) throws DataLayerException;

    void storeUser(User user) throws DataLayerException;

}
