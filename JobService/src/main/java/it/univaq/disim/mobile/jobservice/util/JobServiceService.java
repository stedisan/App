/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.util;

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

    void updateUser(String token, User user);

    Task createTask(String token, Task task);

    List<Task> findAllTasks(String username);

    Task findTaskById(String token, Long id);

    Task updateTask(String token, Task task);

    void deleteTask(String token, Long id);

    void updateOrderTasks(String token, List<Task> tasks);

}
