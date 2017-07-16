/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.util;

import it.univaq.disim.mobile.jobservice.model.Preferiti;
import it.univaq.disim.mobile.jobservice.model.Prenotazione;
import it.univaq.disim.mobile.jobservice.model.Task;
import it.univaq.disim.mobile.jobservice.model.User;
import it.univaq.disim.mobile.jobservice.model.Session;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@Transactional
public class JobServiceServiceImpl implements JobServiceService {
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private SessionRepository sessionRepository;

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;
    
     @Autowired
    private PrenotazioneRepository preferitiRepository;

    @Override
    public Session login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            Session session = new Session();
            session.setUser(user);
            session.setToken(Tokenrandom.generateToken());
            Session newSession = sessionRepository.save(session);
            return newSession;
        } else {
            return null;
        }
    }

    @Override
    public void logout(String token) {
        Session session = sessionRepository.findByToken(token);
        if (session != null) {
            sessionRepository.delete(session);
        }
    }

    @Override
    public boolean createUser(User user) {
        User u = userRepository.findByUsername(user.getUsername());
        if (u != null) {
            return false;
        }
        userRepository.save(user);
        return true;
    }

    @Override
    public void updateUser(String token, User user) {
        Session session = sessionRepository.findByToken(token);
        if (session != null) {
            User oldUser = session.getUser();
            oldUser.setNome(user.getNome());
            oldUser.setCognome(user.getCognome());
            oldUser.setEmail(user.getEmail());
            oldUser.setTelefono(user.getTelefono());
            oldUser.setEtà(user.getEtà());
            oldUser.setCittà(user.getCittà());
            oldUser.setDatadinascita(user.getDatadinascita());
        }

    }

    @Override
    public Task createTask(String token, Task task) {
        Session session = sessionRepository.findByToken(token);
        if (session != null) {
            task.setUser(session.getUser());
            return taskRepository.save(task);
        }
        return null;
    }

    @Override
    public List<Task> findAllTasks(String token) {
        Session session = sessionRepository.findByToken(token);
        if (session != null) {
            /*
            Set<Task> tasks = session.getUser().getTasks();
            return Arrays.asList(tasks.toArray(new Task[0]));
            */
            return taskRepository.findByUserIdOrderByPosition(session.getUser().getId());
            
        } else {
            return new ArrayList<>();
        }

    }

    @Override
    public Task findTaskById(String token, Long id) {
        Session session = sessionRepository.findByToken(token);
        if (session != null) {
            Task task = taskRepository.findOne(id);
            if (task != null && task.getUser().getId() == session.getUser().getId()) {
                return task;
            }
        }
        return null;

    }

    @Override
    public Task updateTask(String token, Task newTask) {
        Session session = sessionRepository.findByToken(token);
        if (session != null) {
            Task task = taskRepository.findOne(newTask.getId());
            if (task != null && task.getUser().getId() == session.getUser().getId()) {
                task.setCompleted(newTask.isCompleted());
                task.setText(newTask.getText());
                task.setPosition(newTask.getPosition());
                return task;
            }
        }
        return null;
    }

    @Override
    public void deleteTask(String token, Long id) {
        Session session = sessionRepository.findByToken(token);
        if (session != null) {
            taskRepository.delete(id);
        }

    }

    @Override
    public void updateOrderTasks(String token, List<Task> tasks) {
        Session session = sessionRepository.findByToken(token);
        if (session != null) {
            tasks.forEach((task) -> {
                Task newTask = taskRepository.findOne(task.getId());
                if (newTask != null) {
                    newTask.setPosition(task.getPosition());
                }
            });
        }
    }
    
    
    @Override
    public boolean createPrenotazione (Prenotazione prenotazione){
        Prenotazione p = prenotazioneRepository.findById(prenotazione.getIdPreno());
        if (p != null) {
            return false;
        }
        prenotazioneRepository.save(prenotazione);
        return true;
    }

    public void updatePrenotazione(String token, Prenotazione prenotazione) {
        Session session = sessionRepository.findByToken(token);
        if (session != null) {
            Prenotazione oldPrenotazione = session.getPrenotazione();
            oldPrenotazione.setOra(prenotazione.getOra());
            oldPrenotazione.setData(prenotazione.getData());
    }
    }

    @Override
    public void deletePrenotazione(Long id_prenot) {
        prenotazioneRepository.delete(id_prenot);
    }
    
   
    public boolean createPreferiti (Preferiti preferiti){
        Prenotazione p = preferitiRepository.findById(preferiti.getIdPref());
        if (p != null) {
            return false;
        }
        preferitiRepository.save(preferiti);
        return true;
    }
    
    public void deletePreferiti (Long id_pref) {
        preferitiRepository.delete(id_pref);
    }
}
