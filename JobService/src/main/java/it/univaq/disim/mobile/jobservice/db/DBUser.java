/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.db;

import it.univaq.disim.mobile.jobservice.model.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Francesca
 */
public class DBUser {
    private SessionFactory sessionFactory;
	protected void setUp() throws Exception {
	// Otteniamo una SessionFactory per la nostra applicazione
	sessionFactory = new Configuration()
	.configure() // configura la SessionFactory utilizzando l' hibernate.cfg.xml
	.buildSessionFactory();
	}
	protected void shutDown() throws Exception {
	if ( sessionFactory != null ) {
	sessionFactory.close();
	}
	}
	public void testBasicUsage() {
            //creiamo ed inseriamo un utente
        Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save( new User( "stefania","di sante", "setfdisa", "xxxxx", "3895448717", 26 , "stefaniadisante@gmail.com","roseto", "25marzo90") );
	session.getTransaction().commit();
	session.close();
	
	// visualizziamo gli utenti memorizzati su db
	session = sessionFactory.openSession();
	session.beginTransaction();
	List<User> result = session.createQuery( "from User" ).list();
	for ( User utente : (List<User>) result ) {
	System.out.println( "Utente (" + utente.getNome() + ") : " + utente.getCognome()+"  "+ utente.getTelefono()+ utente.getCittà()+ utente.getEtà()+ utente.getDatadinascita()+ utente.getUsername()+ utente.getPassword() );
	}
	session.getTransaction().commit();
	session.close();
	//selezioniamo tutto degli utenti
        session=sessionFactory.openSession();
        session.beginTransaction();
        String h1 = "FROM User E SELECT *";
        Query query = session.createQuery(h1);
        List results = query.list();
        System.out.println(results);
        session.getTransaction().commit();
        session.close();
        }
	public static void main (String arg[]) throws Exception{
	DBProfessionista test= new DBProfessionista();
	test.setUp();
	test.testBasicUsage();
	test.shutDown();
	}
}
