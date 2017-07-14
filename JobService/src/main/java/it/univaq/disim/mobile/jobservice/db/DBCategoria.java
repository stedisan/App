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
 * @author Francesca
 */
public class DBCategoria {
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
            //creiamo ed inseriamo una categoria
        Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save( new Categoria( "idraulico") );
	session.getTransaction().commit();
	session.close();
	
	// visualizziamo le categorie memorizzate su db
	session = sessionFactory.openSession();
	session.beginTransaction();
	List<Categoria> result = session.createQuery( "from categoria" ).list();
	for ( Categoria categoria : (List<Categoria>) result ) {
	System.out.println( "Categoria " + categoria.getNomeCat() );
	}
	session.getTransaction().commit();
	session.close();
	//seleziona tutto della categoria 
        session=sessionFactory.openSession();
        session.beginTransaction();
        String h1 = "FROM Categoria E SELECT * ";
        Query query = session.createQuery(h1);
        List results = query.list();
        System.out.println(results);
        session.getTransaction().commit();
        session.close();
        //select da professionista ordinando per categoria
        session=sessionFactory.openSession();
        session.beginTransaction();
        String h2 = "FROM Categoria E SELECT * ORDER BY E.nomec";
        Query query1 = session.createQuery(h2);
        List results1 = query1.list();
        System.out.println(results1);
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


