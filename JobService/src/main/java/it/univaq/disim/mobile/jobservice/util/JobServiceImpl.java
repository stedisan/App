/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.util;
import it.univaq.disim.mobile.jobservice.business.Jobservice;
import it.univaq.disim.mobile.jobservice.model.Session;
import it.univaq.disim.mobile.jobservice.model.Task;
import it.univaq.disim.mobile.jobservice.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class JobServiceImpl implements Jobservice {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private SessionRepository sessionRepository;

    @Autowired
    private Userrepository userRepository;

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
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(String token, User user) {
        Session session = sessionRepository.findByToken(token);
        if (session != null) {
            User oldUser = session.getUser();
            oldUser.setFirstname(user.getFirstname());
            oldUser.setLastname(user.getLastname());
            oldUser.setEmail(user.getEmail());
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
            Set<Task> tasks = session.getUser().getTasks();
            return Arrays.asList(tasks.toArray(new Task[0]));
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
            for (Task task : tasks) {
                Task newTask = taskRepository.findOne(task.getId());
                if (newTask != null) {
                    newTask.setPosition(task.getPosition());
                }

            }
        }
    }

}

