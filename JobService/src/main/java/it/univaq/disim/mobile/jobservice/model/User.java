/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Francesca
 */

@Entity
@Table(name = "utenti")
public class User implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utente")
    private Long id;

    @Column(name = "username", nullable = false, length = 255)
    private String username;

    @Column(name = "password", nullable = false, length = 255)
    private String password;
    
    @Column(name = "nome", nullable = false, length = 255)
    private String nome;
    
    @Column(name = "cognome", nullable = false, length = 255)
    private String cognome;
    
    @Column(name = "email", nullable = false, length = 255)
    private String email;
    
    @Column(name="telefono", nullable=false, length=10)
    private String telefono;
    
    @Column(name="città", nullable=false, length=10)
    private String città;
    
    @Column(name="età", nullable=false, length=10)
    private int età;
    
    @Column(name="datadinascita", nullable=false, length=255)
    private String datadinascita;
    
    
    

    @JsonIgnore
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Task> tasks = new HashSet<>();

    public User(String nome, String cognome, String username, String password, String telefono, int età, String email, String città, String datadinascita) {
       this.nome=nome;
       this.cognome=cognome;
       this.username=username;
       this.password=password;
       this.telefono=telefono;
       this.città=città;
       this.età=età;
       this.email=email;
       this.datadinascita=datadinascita;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
     public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }
    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }
    
    
    public String getDatadinascita() {
        return datadinascita;
    }

    public void setDatadinascita(String datadinascita) {
        this.datadinascita = datadinascita;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task) {
        task.setUser(this);
        tasks.add(task);
    }
    
    public User createUser(User user){
        return user;
    }
    
}

   

    


    

