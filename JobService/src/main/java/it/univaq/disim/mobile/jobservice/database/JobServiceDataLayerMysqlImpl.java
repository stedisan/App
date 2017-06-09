/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.database;


import it.univaq.disim.mobile.jobservice.util.DataLayerException;
import it.univaq.disim.mobile.jobservice.database.DataLayerMysqlImpl;
import it.univaq.disim.mobile.jobservice.model.Categoria;
import it.univaq.disim.mobile.jobservice.model.User;
import it.univaq.disim.mobile.jobservice.model.Chat;
import it.univaq.disim.mobile.jobservice.model.Prenotazione;
import it.univaq.disim.mobile.jobservice.model.Professionista;
import it.univaq.disim.mobile.jobservice.util.JobServiceDataLayer;
import it.univaq.disim.mobile.jobservice.model.Session;
import it.univaq.disim.mobile.jobservice.model.Task;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Francesca
 */
public class JobServiceDataLayerMysqlImpl extends DataLayerMysqlImpl implements JobServiceDataLayer {
    private PreparedStatement iUser, uUser, dUser;
    private PreparedStatement iPrenotazione, dPrenotazione;
    private PreparedStatement sCategoriaByNOME;

    public JobServiceDataLayerMysqlImpl(DataSource datasource) throws SQLException, NamingException{
        super(datasource);
    }

    @Override
    public void init() throws DataLayerException {
        try {
            super.init();
            
            sCategoriaByNOME = connection.prepareStatement("SELECT NOME from categoria" );     
            iUser = connection.prepareStatement("INSERT INTO user (username,password,firstname,lastname,) VALUES(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            uUser = connection.prepareStatement("UPDATE user SET username=?,password=?,firstname=?,lastname=?, WHERE ID=?");
            dUser = connection.prepareStatement("DELETE FROM user WHERE ID=?");

            iPrenotazione = connection.prepareStatement("INSERT INTO prenotazione (data,ora) VALUES(?,?)", Statement.RETURN_GENERATED_KEYS);
            dPrenotazione = connection.prepareStatement("DELETE FROM prenotazione WHERE ID=?");

        } catch (SQLException ex) {
            throw new DataLayerException("Error initializing newspaper data layer", ex);
        }
    }

    @Override
    public User createUser() {
        return new User(this);
    }
    
    public User createUser(ResultSet rs) throws DataLayerException {
        try {
            User a = new User(this);
            a.setId(rs.getLong("ID"));
            a.setFirstname(rs.getString("firstname"));
            a.setLastname(rs.getString("lastname"));
            return a;
        } catch (SQLException ex) {
            throw new DataLayerException("Unable to create author object form ResultSet", ex);
        }
    }

    @Override
    public Task createTask() {
        return new Task(this);
    }
    
    
    public Task createTask(ResultSet rs) throws DataLayerException{
        try{
            Task a=new Task(this);
            a.setId(rs.getLong("ID"));
            a.setText(rs.getString("TEXT"));
        return a;
        }
        catch (SQLException ex){
            throw new DataLayerException("Unable to create author object form ResultSet", ex);
        }
        }
        
    

            @Override
    public Session createSession() {
        return new Session(this);
       
    }

    @Override
    public Prenotazione createPrenotazione() {
        return new Prenotazione(this);
       
    }

    @Override
    public Professionista createProfessionista() {
       return new Professionista(this);
    }

    @Override
    public Categoria createCategoria() {
        return new Categoria(this);
    }

    @Override
    public Chat createChat() {
        return new Chat(this);
    }

    @Override
    public Chat getChat(int id_chat) throws DataLayerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Task getTask(int task_id) throws DataLayerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categoria getCategoria(int id_categ) throws DataLayerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Chat> getChat() throws DataLayerException {
        List<Chat> result = new ArrayList();

        try (ResultSet rs = sAuthors.executeQuery()) {
            while (rs.next()) {
                result.add(getAuthor(rs.getInt("ID")));

            }
        } catch (SQLException ex) {
            throw new DataLayerException("Unable to load authors", ex);
        }
        return result;
    }
        

    @Override
    public ArrayList<Professionista> getProfessionista() throws DataLayerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Professionista getProfessionista(int id_prof) throws DataLayerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Session getSession(String token) throws DataLayerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getUser(long id_user) throws DataLayerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Prenotazione getPrenotazione(int id_prenot) throws DataLayerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Prenotazione> getPrenotazione() throws DataLayerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void storePrenotazione(Prenotazione prenotazione) throws DataLayerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void storeUser(User user) throws DataLayerException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void destroy() {
        //anche chiudere i PreparedStamenent è una buona pratica...
        //also closing PreparedStamenents is a good practice...
        try {
          
            iUser.close();
            uUser.close();
            dUser.close();

            iPrenotazione.close();
            dPrenotazione.close();
        } catch (SQLException ex) {
            //
        }
        super.destroy();
    }


}
