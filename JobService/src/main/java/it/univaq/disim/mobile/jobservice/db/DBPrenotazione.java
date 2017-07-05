/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.db;

import it.univaq.disim.mobile.jobservice.model.Prenotazione;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Francesca
 */
public class DBPrenotazione {
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
            //creiamo ed inseriamo una prenoazione
        Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save( new Prenotazione( new Date(),new LocalTime(), 0 , 0) );
	session.getTransaction().commit();
	session.close();
	
	// visualizziamo le prenotazioni memorizzati su db
	session = sessionFactory.openSession();
	session.beginTransaction();
	List<Prenotazione> result = session.createQuery( "from Prenotazione" ).list();
	for ( Prenotazione prenotazione : (List<Prenotazione>) result ) {
	System.out.println( "Prenotazione (" + prenotazione.getData() + ") : " + prenotazione.getOra()+"  "+ prenotazione.getIdProf() + prenotazione.getIdUtentep() );
	}
	session.getTransaction().commit();
	session.close();
	//seleziono tutto dalle prenotazioni
        session=sessionFactory.openSession();
        session.beginTransaction();
        String h1 = "FROM Prenotazione E SELECT *";
        Query query = session.createQuery(h1);
        List results = query.list();
        System.out.println(results);
        session.getTransaction().commit();
        session.close();
        //seleziono per id utente
        session=sessionFactory.openSession();
        session.beginTransaction();
        String h2 = "FROM Professionista E SELECT * WHERE E.id_utente=this";
        Query query1 = session.createQuery(h2);
        List results1 = query1.list();
        System.out.println(results1);
        session.getTransaction().commit();
        session.close();
        //seleziono per id professionista
        session=sessionFactory.openSession();
        session.beginTransaction();
        String h3 = "FROM Prenotazione E SELECT * WHERE E.id_prof=this";
        Query query2 = session.createQuery(h3);
        List results2 = query2.list();
        System.out.println(results2);
        session.getTransaction().commit();
        session.close();
        //seleziono per id utente e id professionista
        session=sessionFactory.openSession();
        session.beginTransaction();
        String h4 = "FROM Prenotazione E SELECT * WHERE E.id_prof=this && WHERE E.id_utente=this";
        Query query3 = session.createQuery(h4);
        List results3 = query3.list();
        System.out.println(results3);
        session.getTransaction().commit();
        session.close();
         
        //seleziono per data
        session=sessionFactory.openSession();
        session.beginTransaction();
        String h5 = "FROM Prenotazione E SELECT * WHERE E.data=";
        Query query4 = session.createQuery(h5);
        List results4 = query4.list();
        System.out.println(results4);
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


