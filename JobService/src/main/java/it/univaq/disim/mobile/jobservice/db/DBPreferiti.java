/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.db;

import it.univaq.disim.mobile.jobservice.model.Categoria;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Stefania
 */
public class DBPreferiti {
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
            //creiamo ed inseriamo un preferito
        Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save( new Preferiti( 898L , 562L) );
	session.getTransaction().commit();
	session.close();
	
	// visualizziamo i preferiti memorizzati su db
	session = sessionFactory.openSession();
	session.beginTransaction();
	List<Preferiti> result = session.createQuery( "from Preferiti" ).list();
	for ( Preferiti preferiti : (List<Preferiti>) result ) {
	System.out.println( "Preferiti   :  "+ preferiti.getIdProf() + preferiti.getIdUtentep() );
	}
	session.getTransaction().commit();
	session.close();
	//seleziono tutto dai preferiti
        session=sessionFactory.openSession();
        session.beginTransaction();
        String h1 = "FROM Preferiti P SELECT *";
        Query query = session.createQuery(h1);
        List results = query.list();
        System.out.println(results);
        session.getTransaction().commit();
        session.close();
        //seleziono per id utente
        session=sessionFactory.openSession();
        session.beginTransaction();
        String h2 = "FROM Preferiti P SELECT * WHERE P.id_utente=this";
        Query query1 = session.createQuery(h2);
        List results1 = query1.list();
        System.out.println(results1);
        session.getTransaction().commit();
        session.close();
        //seleziono per id professionista
        session=sessionFactory.openSession();
        session.beginTransaction();
        String h3 = "FROM Preferiti P SELECT * WHERE P.id_prof=this";
        Query query2 = session.createQuery(h3);
        List results2 = query2.list();
        System.out.println(results2);
        session.getTransaction().commit();
        session.close();
        //seleziono per id utente e id professionista
        session=sessionFactory.openSession();
        session.beginTransaction();
        String h4 = "FROM Preferiti P SELECT * WHERE P.id_prof=this && WHERE P.id_utente=this";
        Query query3 = session.createQuery(h4);
        List results3 = query3.list();
        System.out.println(results3);
        session.getTransaction().commit();
        session.close();
         
        }
	public static void main (String arg[]) throws Exception{
	DBPreferiti test= new DBPreferiti();
	test.setUp();
	test.testBasicUsage();
	test.shutDown();
	}
	}

