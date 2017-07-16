/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.util;

import it.univaq.disim.mobile.jobservice.model.Prenotazione;
import it.univaq.disim.mobile.jobservice.model.Session;
import it.univaq.disim.mobile.jobservice.model.Task;
import it.univaq.disim.mobile.jobservice.model.User;
import java.util.List;

/**
 *
 * @author Francesca
 */
public interface JobServiceService {
    
    Session login(String username, String password);

    void logout(String token);

    boolean createUser(User user);
    
    boolean createPrenotazione(Prenotazione prenotazione);    
   
    boolean createPreferito(Preferito preferito);

    void updateUser(String token, User user);
    
    void updatePrenotazione(String token,Prenotazione prenotazione);
    
    void deletePrenotazione(Long id_prenot);

    void deletePreferito(Long id_pref);
    
    Task createTask(String token, Task task);

    List<Task> findAllTasks(String username);

    Task findTaskById(String token, Long id);

    Task updateTask(String token, Task task);

    void deleteTask(String token, Long id);
    
    void updateOrderTasks(String token, List<Task> tasks);

    
}
